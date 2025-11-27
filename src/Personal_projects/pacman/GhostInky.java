package Personal_projects.pacman;

import java.awt.*;
import java.util.List;

public class GhostInky extends Ghost {

    public GhostInky(int tx, int ty, Color c) {
        super(tx, ty, c);
        this.sprite = SpriteLoader.inkySheet;
    }

    @Override
    public void update(GamePanel panel, Player player, List<Ghost> others) {
        double centerX = tileX * GamePanel.TILE + GamePanel.TILE / 2.0;
        double centerY = tileY * GamePanel.TILE + GamePanel.TILE / 2.0;
        boolean atCenter = Math.abs(px - centerX) < 1.5 && Math.abs(py - centerY) < 1.5;

        if (atCenter) {
            // Find Blinky's position using getters
            int blinkyX = -1, blinkyY = -1;
            for (Ghost g : others) {
                if (g instanceof GhostBlinky) {
                    blinkyX = g.getTileX();
                    blinkyY = g.getTileY();
                }
            }
            if (blinkyX == -1) { blinkyX = 9; blinkyY = 9; } // fallback if Blinky not found

            // Calculate target tile: 2 tiles ahead of player, mirrored across Blinky
            int aheadX = player.getTileX() + 2; // simplified forward
            int aheadY = player.getTileY();
            int targetX = aheadX + (aheadX - blinkyX);
            int targetY = aheadY + (aheadY - blinkyY);

            // Choose best direction toward target
            int bestDir = dir;
            int bestDist = Integer.MAX_VALUE;
            for (int d = 0; d < 4; d++) {
                if (!canMove(panel, d)) continue;
                int nx = tileX + (d == 1 ? 1 : (d == 3 ? -1 : 0));
                int ny = tileY + (d == 2 ? 1 : (d == 0 ? -1 : 0));
                int dist = Math.abs(nx - targetX) + Math.abs(ny - targetY);
                if (dist < bestDist) {
                    bestDist = dist;
                    bestDir = d;
                }
            }
            dir = bestDir;
            px = centerX;
            py = centerY;
        }

        // Move in current direction
        if (dir == 0) py -= speed;
        else if (dir == 1) px += speed;
        else if (dir == 2) py += speed;
        else if (dir == 3) px -= speed;

        // Update tile coordinates
        tileX = (int) Math.round((px - GamePanel.TILE / 2.0) / GamePanel.TILE);
        tileY = (int) Math.round((py - GamePanel.TILE / 2.0) / GamePanel.TILE);
    }
}

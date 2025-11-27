package Personal_projects.pacman;

import java.awt.*;
import java.util.List;

public class GhostPinky extends Ghost {
    public GhostPinky(int tx, int ty, Color c) {
        super(tx, ty, c);
        this.sprite = SpriteLoader.pinkySheet;
    }

    @Override
    public void update(GamePanel panel, Player player, List<Ghost> others) {
        double centerX = tileX * GamePanel.TILE + GamePanel.TILE/2.0;
        double centerY = tileY * GamePanel.TILE + GamePanel.TILE/2.0;
        boolean atCenter = Math.abs(px - centerX) < 1.5 && Math.abs(py - centerY) < 1.5;

        if (atCenter) {
            int targetX = player.getTileX() + 4; // simplified forward
            int targetY = player.getTileY();
            int best = dir; int bestDist = Integer.MAX_VALUE;
            for (int d=0; d<4; d++) {
                if (!canMove(panel,d)) continue;
                int nx = tileX + (d==1?1:(d==3?-1:0));
                int ny = tileY + (d==2?1:(d==0?-1:0));
                int dist = Math.abs(nx - targetX) + Math.abs(ny - targetY);
                if (dist < bestDist) { bestDist = dist; best = d; }
            }
            dir = best;
            px = centerX; py = centerY;
        }

        if (dir == 0) py -= speed; else if (dir == 1) px += speed; else if (dir == 2) py += speed; else if (dir == 3) px -= speed;
        tileX = (int) Math.round((px - GamePanel.TILE/2.0) / GamePanel.TILE);
        tileY = (int) Math.round((py - GamePanel.TILE/2.0) / GamePanel.TILE);
    }
}

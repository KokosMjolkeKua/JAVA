package Personal_projects.pacman;

import java.awt.*;
import java.util.List;
import java.util.Random;

public class GhostClyde extends Ghost {
    private final Random rnd = new Random();
    public GhostClyde(int tx, int ty, Color c) {
        super(tx, ty, c);
        this.sprite = SpriteLoader.clydeSheet;
    }

    @Override
    public void update(GamePanel panel, Player player, List<Ghost> others) {
        double centerX = tileX * GamePanel.TILE + GamePanel.TILE/2.0;
        double centerY = tileY * GamePanel.TILE + GamePanel.TILE/2.0;
        boolean atCenter = Math.abs(px - centerX) < 1.5 && Math.abs(py - centerY) < 1.5;

        if (atCenter) {
            int distToPlayer = Math.abs(tileX - player.getTileX()) + Math.abs(tileY - player.getTileY());
            int best=dir; int bestDist=Integer.MAX_VALUE;

            if(distToPlayer>8) {
                for(int d=0;d<4;d++) {
                    if(!canMove(panel,d)) continue;
                    int nx=tileX+(d==1?1:(d==3?-1:0));
                    int ny=tileY+(d==2?1:(d==0?-1:0));
                    int dist=Math.abs(nx-player.getTileX())+Math.abs(ny-player.getTileY());
                    if(dist<bestDist){bestDist=dist; best=d;}
                }
            } else {
                for(int attempts=0;attempts<8;attempts++) {
                    int d=rnd.nextInt(4);
                    if(canMove(panel,d)){best=d; break;}
                }
            }

            dir=best; px=centerX; py=centerY;
        }

        if(dir==0) py-=speed; else if(dir==1) px+=speed; else if(dir==2) py+=speed; else if(dir==3) px-=speed;
        tileX = (int)Math.round((px - GamePanel.TILE/2.0)/GamePanel.TILE);
        tileY = (int)Math.round((py - GamePanel.TILE/2.0)/GamePanel.TILE);
    }
}

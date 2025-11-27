package Personal_projects.pacman;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;

public class Player {
    private int tileX, tileY;
    private double px, py;
    private int dir = -1;
    private int nextDir = -1;
    private double speed = 3.2;
    private int animTick = 0;

    public Player(int tileX, int tileY) { setTile(tileX, tileY); }
    public void setSpeed(double s) { this.speed = s; }

    public void update(GamePanel panel) {
        if (nextDir != -1 && canMove(panel, nextDir)) { dir = nextDir; nextDir = -1; }
        if (dir != -1 && canMove(panel, dir)) moveInDir(dir);
        tileX = (int) Math.round((px - GamePanel.TILE/2.0) / GamePanel.TILE);
        tileY = (int) Math.round((py - GamePanel.TILE/2.0) / GamePanel.TILE);
        if (px < 0) px = GamePanel.PANEL_W - 1;
        if (px >= GamePanel.PANEL_W) px = 0;
        animTick = (animTick + 1) % 20;
    }

    private boolean canMove(GamePanel panel, int d) {
        double nx = px, ny = py;
        if (d == 0) ny -= speed;
        else if (d == 1) nx += speed;
        else if (d == 2) ny += speed;
        else if (d == 3) nx -= speed;
        int col = (int) Math.round((nx - GamePanel.TILE/2.0) / GamePanel.TILE);
        int row = (int) Math.round((ny - GamePanel.TILE/2.0) / GamePanel.TILE);
        return panel.inside(row, col) && !panel.isWall(row, col);
    }

    private void moveInDir(int d) { if(d==0) py-=speed; else if(d==1) px+=speed; else if(d==2) py+=speed; else if(d==3) px-=speed; }

    public void draw(Graphics2D g) {
        int frame = (animTick / 5) % 2;
        int spriteX = frame * GamePanel.TILE;
        int spriteY = (dir == -1 ? 1 : dir) * GamePanel.TILE;
        BufferedImage img = SpriteLoader.pacmanSheet.getSubimage(spriteX, spriteY, GamePanel.TILE, GamePanel.TILE);
        g.drawImage(img, (int)(px - GamePanel.TILE/2.0), (int)(py - GamePanel.TILE/2.0), null);
    }

    public void keyPressed(KeyEvent e) {
        int kc = e.getKeyCode();
        if (kc == KeyEvent.VK_UP) nextDir = 0;
        else if (kc == KeyEvent.VK_RIGHT) nextDir = 1;
        else if (kc == KeyEvent.VK_DOWN) nextDir = 2;
        else if (kc == KeyEvent.VK_LEFT) nextDir = 3;
    }
    public void keyReleased(KeyEvent e) { }
    public int getTileX() { return tileX; }
    public int getTileY() { return tileY; }
    public void setTile(int tx, int ty) { this.tileX = tx; this.tileY = ty; this.px = tx * GamePanel.TILE + GamePanel.TILE/2.0; this.py = ty * GamePanel.TILE + GamePanel.TILE/2.0; dir=-1; nextDir=-1; }
}

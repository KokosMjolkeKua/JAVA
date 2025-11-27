package Personal_projects.pacman;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.util.List;

public abstract class Ghost {
    protected int tileX, tileY;         // tile coordinates
    protected double px, py;            // pixel coordinates
    protected int dir;                  // 0=up,1=right,2=down,3=left
    protected double speed = 2.0;
    protected boolean frightened = false;
    protected final Color color;
    protected BufferedImage sprite;

    public Ghost(int tx, int ty, Color c) {
        this.tileX = tx;
        this.tileY = ty;
        this.color = c;
        this.px = tx * GamePanel.TILE + GamePanel.TILE/2.0;
        this.py = ty * GamePanel.TILE + GamePanel.TILE/2.0;
        this.dir = 0;
    }

    /** Frightened state */
    public void setFrightened(boolean f) { this.frightened = f; }

    /** Update method for subclasses */
    public abstract void update(GamePanel panel, Player player, List<Ghost> others);

    /** Check if ghost can move in direction d */
    public boolean canMove(GamePanel panel, int d) {
        int nx = tileX + (d == 1 ? 1 : (d == 3 ? -1 : 0));
        int ny = tileY + (d == 2 ? 1 : (d == 0 ? -1 : 0));
        return panel.inside(ny, nx) && !panel.isWall(ny, nx);
    }

    /** Draw ghost using sprite or frightened sprite */
    public void draw(Graphics2D g) {
        BufferedImage img = frightened ? SpriteLoader.frightenedSheet : sprite;
        g.drawImage(img, (int)(px - GamePanel.TILE/2.0), (int)(py - GamePanel.TILE/2.0),
                GamePanel.TILE, GamePanel.TILE, null);
    }

    /** GETTERS for tile position (fixes Inky issue) */
    public int getTileX() { return tileX; }
    public int getTileY() { return tileY; }

    /** GETTERS for pixel position if needed */
    public double getPx() { return px; }
    public double getPy() { return py; }
}
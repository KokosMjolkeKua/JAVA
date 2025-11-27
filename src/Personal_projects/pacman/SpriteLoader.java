package Personal_projects.pacman;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.IOException;

public class SpriteLoader {
    public static BufferedImage pacmanSheet;
    public static BufferedImage blinkySheet, pinkySheet, inkySheet, clydeSheet, frightenedSheet;

    public static void loadSprites() {
        try {
            pacmanSheet = ImageIO.read(SpriteLoader.class.getResource("/sprites/pacman.png"));
            blinkySheet = ImageIO.read(SpriteLoader.class.getResource("/sprites/blinky.png"));
            pinkySheet = ImageIO.read(SpriteLoader.class.getResource("/sprites/pinky.png"));
            inkySheet = ImageIO.read(SpriteLoader.class.getResource("/sprites/inky.png"));
            clydeSheet = ImageIO.read(SpriteLoader.class.getResource("/sprites/clyde.png"));
            frightenedSheet = ImageIO.read(SpriteLoader.class.getResource("/sprites/frightened.png"));
        } catch (IOException e) {
            e.printStackTrace();
            System.err.println("Failed to load sprites!");
        }
    }
}

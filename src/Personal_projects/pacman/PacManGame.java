package Personal_projects.pacman;

import javax.swing.*;

public class PacManGame {
    public static void main(String[] args) {
        SpriteLoader.loadSprites();
        JFrame frame = new JFrame("Pac-Man");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        GamePanel panel = new GamePanel();
        frame.add(panel);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}

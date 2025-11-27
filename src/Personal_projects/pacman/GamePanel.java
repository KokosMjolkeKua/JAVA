package Personal_projects.pacman;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;

public class GamePanel extends JPanel implements ActionListener {
    public static final int TILE = 32;
    public static final int PANEL_W = 28 * TILE;
    public static final int PANEL_H = 31 * TILE;

    private Timer timer;
    private Player player;
    private List<Ghost> ghosts = new ArrayList<>();
    private boolean running = false;

    private int[][] maze = new int[31][28];

    public GamePanel() {
        setPreferredSize(new Dimension(PANEL_W, PANEL_H));
        setBackground(Color.BLACK);
        setFocusable(true);
        requestFocus();

        initMaze();

        player = new Player(9, 15);

        ghosts.add(new GhostBlinky(9, 9, Color.RED));
        ghosts.add(new GhostPinky(8, 9, Color.PINK));
        ghosts.add(new GhostInky(10, 9, Color.CYAN));
        ghosts.add(new GhostClyde(9, 8, Color.ORANGE));

        addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) { player.keyPressed(e); }
            @Override
            public void keyReleased(KeyEvent e) { player.keyReleased(e); }
        });

        timer = new Timer(16, this); // ~60 FPS
        timer.start();
        running = true;
    }

    private void initMaze() {
        for (int row = 0; row < 31; row++) {
            for (int col = 0; col < 28; col++) {
                if (row == 0 || row == 30 || col == 0 || col == 27) maze[row][col] = 1;
                else maze[row][col] = 0;
            }
        }
    }

    public boolean inside(int row, int col) { return row >= 0 && row < maze.length && col >= 0 && col < maze[0].length; }
    public boolean isWall(int row, int col) { return !inside(row, col) || maze[row][col] == 1; }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        drawMaze(g);
        player.draw((Graphics2D) g);
        for (Ghost ghost : ghosts) ghost.draw((Graphics2D) g);
    }

    private void drawMaze(Graphics g) {
        g.setColor(Color.BLUE);
        for (int row = 0; row < maze.length; row++) {
            for (int col = 0; col < maze[0].length; col++) {
                if (maze[row][col] == 1) g.fillRect(col * TILE, row * TILE, TILE, TILE);
            }
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (running) {
            player.update(this);
            for (Ghost ghost : ghosts) ghost.update(this, player, ghosts);
            repaint();
        }
    }
}

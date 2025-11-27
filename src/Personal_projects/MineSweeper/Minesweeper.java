package Personal_projects.MineSweeper;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class Minesweeper extends JFrame{
    private static final int SIZE = 10;  // 10x10 grid
    private static final int MINES = 15; // number of mines

    private Cell[][] cells = new Cell[SIZE][SIZE];
    private boolean gameOver = false;

    public Minesweeper() {
        setTitle("Minesweeper");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 550);
        setLayout(new BorderLayout());

        JPanel boardPanel = new JPanel(new GridLayout(SIZE, SIZE));
        initializeBoard(boardPanel);

        JButton resetButton = new JButton("Restart");
        resetButton.addActionListener(e -> resetGame());

        add(boardPanel, BorderLayout.CENTER);
        add(resetButton, BorderLayout.SOUTH);
        setVisible(true);
    }

    private void initializeBoard(JPanel boardPanel) {
        boardPanel.removeAll();
        gameOver = false;

        // Create cells
        for (int r = 0; r < SIZE; r++) {
            for (int c = 0; c < SIZE; c++) {
                cells[r][c] = new Cell(r, c);
                boardPanel.add(cells[r][c]);
            }
        }

        // Place mines randomly
        Random rand = new Random();
        int placed = 0;
        while (placed < MINES) {
            int r = rand.nextInt(SIZE);
            int c = rand.nextInt(SIZE);
            if (!cells[r][c].isMine) {
                cells[r][c].isMine = true;
                placed++;
            }
        }

        // Compute neighbor counts
        for (int r = 0; r < SIZE; r++) {
            for (int c = 0; c < SIZE; c++) {
                if (!cells[r][c].isMine) {
                    cells[r][c].neighborMines = countMinesAround(r, c);
                }
            }
        }
    }

    private int countMinesAround(int row, int col) {
        int count = 0;
        for (int dr = -1; dr <= 1; dr++) {
            for (int dc = -1; dc <= 1; dc++) {
                int nr = row + dr, nc = col + dc;
                if (nr >= 0 && nr < SIZE && nc >= 0 && nc < SIZE && cells[nr][nc].isMine) {
                    count++;
                }
            }
        }
        return count;
    }

    private void revealAllMines() {
        for (int r = 0; r < SIZE; r++) {
            for (int c = 0; c < SIZE; c++) {
                if (cells[r][c].isMine) {
                    cells[r][c].setText("💣");
                    cells[r][c].setBackground(Color.PINK);
                }
            }
        }
    }

    private void resetGame() {
        getContentPane().removeAll();
        JPanel newBoard = new JPanel(new GridLayout(SIZE, SIZE));
        initializeBoard(newBoard);
        JButton resetButton = new JButton("Restart");
        resetButton.addActionListener(e -> resetGame());
        add(newBoard, BorderLayout.CENTER);
        add(resetButton, BorderLayout.SOUTH);
        revalidate();
        repaint();
    }

    private void checkWin() {
        int revealed = 0;
        for (int r = 0; r < SIZE; r++) {
            for (int c = 0; c < SIZE; c++) {
                if (cells[r][c].revealed) revealed++;
            }
        }
        if (revealed == SIZE * SIZE - MINES) {
            gameOver = true;
            JOptionPane.showMessageDialog(this, "🎉 You win!");
        }
    }

    // Inner Cell class
    private class Cell extends JButton {
        int row, col;
        boolean isMine = false;
        boolean revealed = false;
        int neighborMines = 0;

        Cell(int r, int c) {
            this.row = r;
            this.col = c;
            setFont(new Font("Consolas", Font.BOLD, 18));
            setBackground(Color.LIGHT_GRAY);
            addActionListener(e -> click());
        }

        void click() {
            if (gameOver || revealed) return;
            revealed = true;

            if (isMine) {
                setText("💣");
                setBackground(Color.RED);
                revealAllMines();
                gameOver = true;
                JOptionPane.showMessageDialog(Minesweeper.this, "💥 Boom! You hit a mine.");
            } else {
                if (neighborMines > 0) {
                    setText(String.valueOf(neighborMines));
                } else {
                    setBackground(Color.WHITE);
                    // reveal neighbors recursively
                    for (int dr = -1; dr <= 1; dr++) {
                        for (int dc = -1; dc <= 1; dc++) {
                            int nr = row + dr, nc = col + dc;
                            if (nr >= 0 && nr < SIZE && nc >= 0 && nc < SIZE) {
                                cells[nr][nc].click();
                            }
                        }
                    }
                }
                setEnabled(false);
                checkWin();
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(Minesweeper::new);
    }
}

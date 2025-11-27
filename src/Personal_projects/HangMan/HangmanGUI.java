package Personal_projects.HangMan;

import javax.swing.*;
import java.awt.*;
import java.util.HashSet;
import java.util.Set;

public class HangmanGUI extends JFrame{
    private String word = "CHATGPT"; // You can change or randomize this word
    private Set<Character> guessed = new HashSet<>();
    private int wrongGuesses = 0;

    private JLabel wordLabel;
    private JLabel wrongLabel;
    private JTextField inputField;
    private DrawPanel drawPanel;

    public HangmanGUI() {
        setTitle("Hangman Game");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 500);
        setLayout(new BorderLayout());

        // Top: Word display
        wordLabel = new JLabel(getDisplayWord(), SwingConstants.CENTER);
        wordLabel.setFont(new Font("Consolas", Font.BOLD, 32));
        add(wordLabel, BorderLayout.NORTH);

        // Center: Drawing area
        drawPanel = new DrawPanel();
        add(drawPanel, BorderLayout.CENTER);

        // Bottom: Input and wrong guesses
        JPanel bottomPanel = new JPanel(new BorderLayout());
        inputField = new JTextField();
        wrongLabel = new JLabel("Wrong guesses: ", SwingConstants.CENTER);

        bottomPanel.add(inputField, BorderLayout.NORTH);
        bottomPanel.add(wrongLabel, BorderLayout.SOUTH);
        add(bottomPanel, BorderLayout.SOUTH);

        // Handle user input
        inputField.addActionListener(e -> {
            String text = inputField.getText().toUpperCase();
            if (text.length() == 1 && Character.isLetter(text.charAt(0))) {
                char guess = text.charAt(0);
                if (!guessed.contains(guess)) {
                    guessed.add(guess);
                    if (word.indexOf(guess) == -1) {
                        wrongGuesses++;
                    }
                    updateGame();
                }
            }
            inputField.setText("");
        });

        setVisible(true);
    }

    private void updateGame() {
        wordLabel.setText(getDisplayWord());
        wrongLabel.setText("Wrong guesses: " + getWrongLetters());
        drawPanel.repaint();

        if (isWordGuessed()) {
            JOptionPane.showMessageDialog(this, "🎉 You win! The word was: " + word);
            resetGame();
        } else if (wrongGuesses >= 6) {
            JOptionPane.showMessageDialog(this, "💀 You lose! The word was: " + word);
            resetGame();
        }
    }

    private String getDisplayWord() {
        StringBuilder sb = new StringBuilder();
        for (char c : word.toCharArray()) {
            sb.append(guessed.contains(c) ? c : "_").append(" ");
        }
        return sb.toString();
    }

    private String getWrongLetters() {
        StringBuilder sb = new StringBuilder();
        for (char c : guessed) {
            if (word.indexOf(c) == -1) sb.append(c).append(" ");
        }
        return sb.toString();
    }

    private boolean isWordGuessed() {
        for (char c : word.toCharArray()) {
            if (!guessed.contains(c)) return false;
        }
        return true;
    }

    private void resetGame() {
        word = "JAVA"; // You can randomize this
        guessed.clear();
        wrongGuesses = 0;
        updateGame();
    }

    // Inner class for drawing hangman
    class DrawPanel extends JPanel {
        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            Graphics2D g2 = (Graphics2D) g;
            g2.setStroke(new BasicStroke(3));

            // Draw gallows
            g2.drawLine(50, 400, 200, 400); // base
            g2.drawLine(125, 400, 125, 100); // pole
            g2.drawLine(125, 100, 250, 100); // top bar
            g2.drawLine(250, 100, 250, 150); // rope

            // Draw hangman parts based on wrong guesses
            if (wrongGuesses > 0) g2.drawOval(225, 150, 50, 50); // head
            if (wrongGuesses > 1) g2.drawLine(250, 200, 250, 280); // body
            if (wrongGuesses > 2) g2.drawLine(250, 220, 220, 260); // left arm
            if (wrongGuesses > 3) g2.drawLine(250, 220, 280, 260); // right arm
            if (wrongGuesses > 4) g2.drawLine(250, 280, 220, 330); // left leg
            if (wrongGuesses > 5) g2.drawLine(250, 280, 280, 330); // right leg
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(HangmanGUI::new);
    }
}

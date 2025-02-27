import javax.swing.*;
import java.awt.*;

public class PauseMenu extends JDialog {

    public PauseMenu(JFrame parent, PicPuzzle game) {
        super(parent, "Game Paused", true);

        setUndecorated(true); 
        setSize(350, 420);
        setLocationRelativeTo(parent); // Center the dialog on the game window

        // Panel to hold buttons
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS)); // ✅ Fix: Set layout for the panel

        // Resume Button
        JButton resumeButton = new JButton("  Resume  ");
        resumeButton.setAlignmentX(Component.CENTER_ALIGNMENT);
        resumeButton.setFocusable(false);
        resumeButton.setFont(new Font("Comic Sans",Font.BOLD,20));
        resumeButton.addActionListener(e -> {
            dispose();
            game.resumeGame();
        });

        // Restart Button
        JButton restartButton = new JButton("   Restart   ");
        restartButton.setAlignmentX(Component.CENTER_ALIGNMENT);
        restartButton.setFocusable(false);
        restartButton.setFont(new Font("Comic Sans",Font.BOLD,20));
        restartButton.addActionListener(e -> { 
            game.restartGame();
            dispose();  
        });

        // Home Button
        JButton homeButton = new JButton("    Home    ");
        homeButton.setAlignmentX(Component.CENTER_ALIGNMENT);
        homeButton.setFocusable(false);
        homeButton.setFont(new Font("Comic Sans",Font.BOLD,20));
        homeButton.addActionListener(e -> {
            parent.dispose();
            game.stopTimer();
            GameMenu gameMenu = new GameMenu();
            gameMenu.setVisible(true);
        });

        // Add spacing and buttons
        panel.add(Box.createVerticalGlue());
        panel.add(resumeButton);
        panel.add(Box.createVerticalStrut(35));
        panel.add(restartButton);
        panel.add(Box.createVerticalStrut(35));
        panel.add(homeButton);
        panel.add(Box.createVerticalGlue());

        panel.setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, Color.lightGray));
        add(panel);

        setVisible(true);
    }

}

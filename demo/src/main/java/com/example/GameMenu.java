package com.example;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class GameMenu extends JFrame implements ActionListener{

    JButton btn, btn2, btn3, info;
    JPanel centerPanel, topPanel;
    JLabel label;
    ImageIcon background;
    JPanel backgroundPanel;

    GameMenu() {

        Settings settings = new Settings(this, this);
        settings.play();

        setTitle("PicPuzzle");

        // === Custom Background Panel ===
        backgroundPanel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                background = new ImageIcon("demo\\src\\resources\\images\\art.png"); // Ensure path is correct
                g.drawImage(background.getImage(), 0, 0, getWidth(), getHeight(), this);
            }
        };
        backgroundPanel.setLayout(new BorderLayout());

        // === Transparent Main Panel for UI ===
        JPanel mainPanel = new JPanel(new BorderLayout());
        mainPanel.setOpaque(false);

        // Info Button (Top Right Corner)
        info = new JButton("!");
        info.setFont(new Font("Comic Sans", Font.BOLD, 15));
        info.setToolTipText("About");
        info.setFocusPainted(false);

        // Top Panel (Contains Info Button)
        topPanel = new JPanel(new BorderLayout());
        topPanel.setOpaque(false);
        topPanel.add(info, BorderLayout.EAST);
        topPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        // Game Title
        label = new JLabel("PicPuzzle", SwingConstants.CENTER);
        label.setFont(new Font("Comic Sans", Font.BOLD, 50));
        label.setForeground(Color.BLACK); // Ensures visibility

        btn = createButton(" Play Game ");
        btn2 = createButton("How to Play");
        btn3 = createButton("   Settings   ");

        btn.addActionListener(this);
        btn2.addActionListener(this);
        btn3.addActionListener(this);
        info.addActionListener(this);

        // === Center Panel ===
        centerPanel = new JPanel();
        centerPanel.setOpaque(false);
        centerPanel.setLayout(new BoxLayout(centerPanel, BoxLayout.Y_AXIS));

        label.setAlignmentX(Component.CENTER_ALIGNMENT);
        btn.setAlignmentX(Component.CENTER_ALIGNMENT);
        btn2.setAlignmentX(Component.CENTER_ALIGNMENT);
        btn3.setAlignmentX(Component.CENTER_ALIGNMENT);

        centerPanel.add(Box.createVerticalGlue()); 
        centerPanel.add(label);
        centerPanel.add(Box.createVerticalStrut(100)); 
        centerPanel.add(btn);
        centerPanel.add(Box.createVerticalStrut(50)); 
        centerPanel.add(btn2);
        centerPanel.add(Box.createVerticalStrut(50)); 
        centerPanel.add(btn3);
        centerPanel.add(Box.createVerticalGlue());

        // Add components properly
        mainPanel.add(topPanel, BorderLayout.NORTH);
        mainPanel.add(centerPanel, BorderLayout.CENTER);

        // Add main panel on top of the background panel
        backgroundPanel.add(mainPanel, BorderLayout.CENTER);
        setContentPane(backgroundPanel);

        setSize(1150, 760);
        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    private JButton createButton(String text) {
        JButton button = new JButton(text);
        button.setPreferredSize(new Dimension(190, 30));
        button.setFont(new Font("Comic Sans", Font.BOLD, 20));
        button.setFocusable(false);
    
        button.setContentAreaFilled(false); // Removes background fill
        button.setBorderPainted(false);     // Removes border
        button.setOpaque(false);            // Ensures transparency works
        button.setForeground(Color.BLACK);  // Default text color
    
       
        button.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                button.setForeground(Color.YELLOW); // Change text color on hover
                button.setBorder(BorderFactory.createLineBorder(Color.YELLOW, 2)); // Add border
            }
    
            @Override
            public void mouseExited(java.awt.event.MouseEvent evt) {
                button.setForeground(Color.BLACK);  // Reset text color
                button.setBorder(null);            // Remove border
            }
        });
    
        return button;
    }
    
    

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==btn){
            Levels g = new Levels(this, null); 
            g.display(true);
            this.setVisible(false);
            ImageIcon newBackground = new ImageIcon("path/to/new/background/image.png");
            background = newBackground;
            backgroundPanel.repaint();
        } else if (e.getSource()==btn2){
            HowToPlay h = new HowToPlay(this);
            h.display();
        } else if (e.getSource()==btn3){
            Settings s = new Settings(this, this);
            s.display();
        } else if (e.getSource()==info){
            Info i = new Info(this);
            i.display();
        }
    }

   
}

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class GameDifficulty extends JDialog implements ActionListener{

    JButton btn1, btn2, btn3, btn4, btn5, close;
    JPanel topPanel, centerPanel;
    private PicPuzzle p;
    // private JFrame disposeWindow;
    
        public GameDifficulty(JFrame parent, PicPuzzle p) {
            super(parent, "Game Difficulty", true);
            this.p = p; //this almost sent me into a psychosis
            setUndecorated(true); 
            setLayout(new BorderLayout());
            setSize(350, 420);
    
            close = new JButton("X");
            close.setFont(new Font("Comic Sans",Font.BOLD,15));
            close.setSize( 30, 30);
            close.setFocusPainted(false);
            close.addActionListener(e -> this.dispose());
            close.setVisible(false); 
    
            topPanel = new JPanel(new BorderLayout());
            topPanel.setBorder(BorderFactory.createEmptyBorder(5, 0, 0, 5));
            topPanel.add(close, BorderLayout.EAST);
    
            btn1 = new JButton("    LEVEL 1    ");
            btn1.setFont(new Font("Comic Sans",Font.BOLD,20));
            btn1.addActionListener(this);
            btn1.setFocusable(false);
    
            btn2 = new JButton("    LEVEL 2    ");
            btn2.setFont(new Font("Comic Sans",Font.BOLD,20));
            btn2.addActionListener(this);
            btn2.setFocusable(false);
            btn2.setEnabled(false);
    
            btn3 = new JButton("    LEVEL 3    ");
            btn3.setFont(new Font("Comic Sans",Font.BOLD,20));
            btn3.addActionListener(this);
            btn3.setFocusable(false);
            btn3.setEnabled(false);

            btn4 = new JButton("    LEVEL 4    ");
            btn4.setFont(new Font("Comic Sans",Font.BOLD,20));
            btn4.addActionListener(this);
            btn4.setFocusable(false);
            btn4.setEnabled(false);

            btn5 = new JButton("    LEVEL 5    ");
            btn5.setFont(new Font("Comic Sans",Font.BOLD,20));
            btn5.addActionListener(this);
            btn5.setFocusable(false);
            btn5.setEnabled(false);
    
            centerPanel = new JPanel();
            centerPanel.setLayout(new BoxLayout(centerPanel, BoxLayout.Y_AXIS));
            btn1.setAlignmentX(JPanel.CENTER_ALIGNMENT);
            btn2.setAlignmentX(JPanel.CENTER_ALIGNMENT);
            btn3.setAlignmentX(JPanel.CENTER_ALIGNMENT);
            btn4.setAlignmentX(JPanel.CENTER_ALIGNMENT);
            btn5.setAlignmentX(JPanel.CENTER_ALIGNMENT);

            //this couldve been just setBorder but I like making my life harder
            centerPanel.add(Box.createVerticalGlue());
            centerPanel.add(btn1);
            centerPanel.add(Box.createVerticalStrut(25));
            centerPanel.add(btn2);
            centerPanel.add(Box.createVerticalStrut(25));
            centerPanel.add(btn3);
            centerPanel.add(Box.createVerticalStrut(25));
            centerPanel.add(btn4);
            centerPanel.add(Box.createVerticalStrut(25));
            centerPanel.add(btn5);
            centerPanel.add(Box.createVerticalGlue());

            JPanel mainPanel = new JPanel();
            mainPanel.setLayout(new BorderLayout());
            mainPanel.add(topPanel, BorderLayout.NORTH);
            mainPanel.add(centerPanel, BorderLayout.CENTER);

            mainPanel.setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, Color.lightGray));
    
            add(mainPanel);
            setLocationRelativeTo(parent);
    
            // this.disposeWindow = parent;
    }

    public void display(boolean visible){
        this.setVisible(visible);
    }

    public void enableLevel(int level) {
        btn1.setEnabled(false); //this thing isnt permanently disabling if ion put this here 
        switch (level) {
            case 2 -> btn2.setEnabled(true);
            case 3 -> btn3.setEnabled(true);
            case 4 -> btn4.setEnabled(true);
            case 5 -> btn5.setEnabled(true);
            default -> {
            }
        }
    }

    // this is lowkey useless, all this should just do is dispose this window and the effect is still the same, but ive decided to 
    // give it some use and let it change the icons and picture using methods even though picpuzzle could do this just perfectly fine.
    // actually realized this too late, but I'm too lazy to change it back LOL dw Ill be cleaning and refactoring this code ...in my dreams <3
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btn1) {
            PicPuzzle p1 = new PicPuzzle();
            p1.getClass();
            display(false);
        } else if (e.getSource() == btn2) {
            p.changeToLevel2();
            dispose();
        } else if (e.getSource() == btn3) {
            p.changeToLevel3();
            dispose();
        } else if (e.getSource() == btn4) {
            p.changeToLevel4();
            dispose();
        } else if (e.getSource() == btn5) {
            p.changeToLevel5();
            dispose();
        }
    }
}


import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class GameDifficulty extends JDialog implements ActionListener{

    JButton btn1, btn2, btn3, close;
    JPanel topPanel, centerPanel;
    // private JFrame disposeWindow;
    
        public GameDifficulty(JFrame parent) {
            super(parent, "Game Difficulty", true);
    
            setUndecorated(true); 
            setLayout(new BorderLayout());
            setSize(350, 420);
    
            close = new JButton("X");
            close.setFont(new Font("Comic Sans",Font.BOLD,15));
            close.setSize( 30, 30);
            close.setFocusPainted(false);
            close.addActionListener(e -> this.dispose());
            // close.setVisible(false); 
    
            topPanel = new JPanel(new BorderLayout());
            topPanel.setBorder(BorderFactory.createEmptyBorder(5, 0, 0, 5));
            topPanel.add(close, BorderLayout.EAST);
    
            btn1 = new JButton("    Easy    ");
            btn1.setFont(new Font("Comic Sans",Font.BOLD,20));
            btn1.setPreferredSize(new Dimension(70, 30));
            btn1.addActionListener(this);
            btn1.setFocusable(false);
    
            btn2 = new JButton(" Medium ");
            btn2.setFont(new Font("Comic Sans",Font.BOLD,20));
            btn2.setPreferredSize(new Dimension(70, 30));
            btn2.addActionListener(this);
            btn2.setFocusable(false);
    
            btn3 = new JButton("   Hard   ");
            btn3.setFont(new Font("Comic Sans",Font.BOLD,20));
            btn3.setPreferredSize(new Dimension(70, 30));
            btn3.addActionListener(this);
            btn3.setFocusable(false);
    
            centerPanel = new JPanel();
            centerPanel.setLayout(new BoxLayout(centerPanel, BoxLayout.Y_AXIS));
            btn1.setAlignmentX(JPanel.CENTER_ALIGNMENT);
            btn2.setAlignmentX(JPanel.CENTER_ALIGNMENT);
            btn3.setAlignmentX(JPanel.CENTER_ALIGNMENT);
    
            centerPanel.add(Box.createVerticalGlue());
            centerPanel.add(btn1);
            centerPanel.add(Box.createVerticalStrut(40));
            centerPanel.add(btn2);
            centerPanel.add(Box.createVerticalStrut(40));
            centerPanel.add(btn3);
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

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==btn1){
            PicPuzzle p = new PicPuzzle();
            p.getClass();
            display(false);
        } else if(e.getSource()==btn2){
            PicPuzzle2 p2 = new PicPuzzle2();
            p2.getClass();
            display(false);
        }
        //TO DO: Hard Game
    }
}

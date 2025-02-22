import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class GameMenu extends JFrame implements ActionListener{

    JButton btn, btn2, btn3, info;
    JPanel centerPanel, topPanel;
    JLabel label;

    GameMenu() {

        setTitle("PicPuzzle");

        //info button
        info = new JButton("!");
        info.setFont(new Font("Comic Sans",Font.BOLD,15));
        info.setSize( 30, 30);
        info.setToolTipText("About");
        info.setFocusPainted(false);
        info.addActionListener(this);

        //top panel para sa info button
        topPanel = new JPanel(new BorderLayout());
        topPanel.add(info, BorderLayout.EAST);
        topPanel.setBorder(BorderFactory.createEmptyBorder(5, 0, 0, 5));


        //Game Title
        label = new JLabel("PicPuzzle");
        label.setFont(new Font("Comic Sans",Font.BOLD,50));
        label.setSize(300, 50);

        //Play Game Button
        btn = new JButton(" Play Game ");
        btn.setPreferredSize(new Dimension(190, 30));
        btn.setFocusable(false);
        btn.setFont(new Font("Comic Sans",Font.BOLD,20));
        btn.addActionListener(this);

        //How to Play Button
        btn2 = new JButton("How to Play");
        btn2.setPreferredSize(new Dimension(190, 30));
        btn2.setFocusable(false);
        btn2.setFont(new Font("Comic Sans",Font.BOLD,20));
        btn2.addActionListener(this);

        //Settings Button
        btn3 = new JButton("   Settings   ");
        btn3.setPreferredSize(new Dimension(190, 30));
        btn3.setFocusable(false);
        btn3.setFont(new Font("Comic Sans",Font.BOLD,20));
        btn3.addActionListener(this);

        //Center Panel
        centerPanel = new JPanel();
        centerPanel.setLayout(new BoxLayout(centerPanel, BoxLayout.Y_AXIS)); //para nasa center yung label at button
        label.setAlignmentX(JPanel.CENTER_ALIGNMENT);
        btn.setAlignmentX(JPanel.CENTER_ALIGNMENT);
        btn2.setAlignmentX(JPanel.CENTER_ALIGNMENT);
        btn3.setAlignmentX(JPanel.CENTER_ALIGNMENT);

        //add components to center panel
        centerPanel.add(Box.createVerticalGlue()); //para nasa center yung label
        centerPanel.add(label);
        centerPanel.add(Box.createVerticalStrut(60)); //para may space yung label sa button
        centerPanel.add(btn);
        centerPanel.add(Box.createVerticalStrut(30)); //para may space yung Game at how to play button
        centerPanel.add(btn2);
        centerPanel.add(Box.createVerticalStrut(30)); //para may space yung how to play at settings button
        centerPanel.add(btn3);
        centerPanel.add(Box.createVerticalGlue()); //para nasa center yung button

        //add components to frame
        add(topPanel, BorderLayout.NORTH);
        add(centerPanel, BorderLayout.CENTER);
        setSize(1150,760);
        setLocation(190, 35);
        setResizable(true);
        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        setVisible(true);

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                int result = JOptionPane.showConfirmDialog(e.getWindow(), "Are you sure you want to close the game?", "Confirm Exit", JOptionPane.YES_NO_OPTION);
                if (result == JOptionPane.YES_OPTION) {
                    dispose();
                }
            }
        });

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==btn){
            Levels g = new Levels(this, null); 
            g.display(true);
            this.setVisible(false);
        } else if (e.getSource()==btn2){
            HowToPlay h = new HowToPlay(this);
            h.display();
        }else if (e.getSource()==btn3){
            Settings s = new Settings(this, this);
            s.display();
        }
    }

    // still in progress

    // Set background color to dark
    public void theme() {
        getContentPane().setBackground(Color.decode("#2f2f2f"));
        topPanel.setBackground(Color.decode("#2f2f2f"));
        centerPanel.setBackground(Color.decode("#2f2f2f"));
    
        label.setForeground(Color.decode("#ffffff"));
        btn.setForeground(Color.decode("#ffffff"));
        btn2.setForeground(Color.decode("#ffffff"));
        btn3.setForeground(Color.decode("#ffffff"));
        info.setForeground(Color.decode("#ffffff"));
    
        btn.setBackground(Color.decode("#4f4f4f"));
        btn2.setBackground(Color.decode("#4f4f4f"));
        btn3.setBackground(Color.decode("#4f4f4f"));
        info.setBackground(Color.decode("#4f4f4f"));
    
        btn.setBorder(BorderFactory.createLineBorder(Color.decode("#ffffff")));
        btn2.setBorder(BorderFactory.createLineBorder(Color.decode("#ffffff")));
        btn3.setBorder(BorderFactory.createLineBorder(Color.decode("#ffffff")));
        info.setBorder(BorderFactory.createLineBorder(Color.decode("#ffffff")));
    }

    public void lightTheme() {
        getContentPane().setBackground(Color.decode("#f2f2f2"));
        topPanel.setBackground(Color.decode("#f2f2f2"));
        centerPanel.setBackground(Color.decode("#f2f2f2"));

        label.setForeground(Color.decode("#333333"));
        btn.setForeground(Color.decode("#333333"));
        btn2.setForeground(Color.decode("#333333"));
        btn3.setForeground(Color.decode("#333333"));
        info.setForeground(Color.decode("#333333"));

        btn.setBackground(Color.decode("#ffffff"));
        btn2.setBackground(Color.decode("#ffffff"));
        btn3.setBackground(Color.decode("#ffffff"));
        info.setBackground(Color.decode("#ffffff"));

        btn.setBorder(BorderFactory.createLineBorder(Color.decode("#333333")));
        btn2.setBorder(BorderFactory.createLineBorder(Color.decode("#333333")));
        btn3.setBorder(BorderFactory.createLineBorder(Color.decode("#333333")));
        info.setBorder(BorderFactory.createLineBorder(Color.decode("#333333")));
    }
}

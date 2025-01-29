// // package main;
// import javax.swing.*;
// import java.awt.*;
// import java.awt.event.*;

// public class MainMenu extends JFrame implements ActionListener{
//     JButton btn1, btn2, btn3, info;
//     JPanel centerPanel, topPanel; 
//     JLabel label;

//     MainMenu() {

//         this.setTitle("PicPuzzle");
        
//         info = new JButton("!");
//         info.setFont(new Font("Comic Sans",Font.BOLD,15));
//         info.setSize(30,30);
//         info.setFocusPainted(false);
//         info.addActionListener(this);

//         //top panel
//         topPanel = new JPanel(new BorderLayout());
//         topPanel.add(info, BorderLayout.EAST);
//         topPanel.setBorder(BorderFactory.createEmptyBorder(5, 0, 0 ,5));

//         //Game Title
//         label = new JLabel("PicPuzzle");
//         label.setFont(new Font("Comic Sans",Font.BOLD,20));
//         label.setSize(300,50);

//         //Play game button
//         btn = new JButton("  Play Game  ");
//         btn.setFont(new Font("Comic Sans",Font.BOLD,20));
//         btn.addActionListener(this);

//         //How to play button
//         btn2 = new JButton("How To Play");
//         btn2.setFocusable(false);
//         btn2.setFont(new Font("Comic Sans",Font.BOLD,20));
//         btn2.addActionListener(this);   

//         //Settings Button
//         btn3 = new JButton("   Settings   ");
//         btn3.setPrefferedSize(new Dimension(190,30));
//         btn3.setFocusable(false);
//         btn3.setFont(new Font("Comic Sans",Font.BOLD,20));
//         btn3.addActionListener(this);   

//         //Center Panel
//         centerPanel = new Jpanel();
//         centerPanel.setLayout(new BoxLayout(centerPanel, BoxLayout.Y_AXIS));    
//         label.setAlignmentX(JPanel.CENTER_ALIGNMENT);
//         btn.setAlignmentX(JPanel.CENTER_ALIGNMENT); 
//         btn2.setAlignmentX(JPanel.CENTER_ALIGNMENT);
//         btn3.setAlignmentX(JPanel.CENTER_ALIGNMENT);

//         //add components to the center panel
//         centerPanel.add(Box.createVerticalGlue());
//         centerPanel.add(label); 
//         centerPanel.add(Box.createVerticalStrut(55));
//         centerPanel.add(btn);
//         centerPanel.add(Box.createVerticalStrut(30));
//         centerPanel.add(btn2);
//         centerPanel.add(Box.createVerticalStrut(30));
//         centerPanel.add(btn3);
//         centerPanel.add(Box.createVerticalSGlue());

//         this.add(topPanel, BorderLayout.NORTH);
//         this.add(centerPanel, BorderLayout.CENTER);

//         this.Size(1100,770);
//         this.setLocation(150,25);
//         this.setResizable(true);
//         this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//         this.setVisible(true);

//     }

//     @Override
//     public void actionPerformed(ActionEvent e) {
//         if(e.getSource() == btn){
//             // new Game(); 
//         }
//     }
// }

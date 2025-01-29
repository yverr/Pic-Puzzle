// package main;

import javax.swing.*;
import java.awt.*;

public class PicPuzzle{
    JFrame frm = new JFrame();
    JLabel lbl1, lbl2;
    JPanel mainPanel, topPanel, centerPanel, leftPanel, rightPanel, bottomPanel;
    JButton icon, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, picture;

    Icon s;
    Icon sami0 = new ImageIcon(".src/res/images/sami.jpg");
    Icon icon1 = new ImageIcon("./src/res/images/1.jpg");
    Icon icon2 = new ImageIcon("./src/res/images/2.jpg");
    Icon icon3 = new ImageIcon("./src/res/images/3.jpg");
    Icon icon4 = new ImageIcon("./src/res/images/4.jpg");
    Icon icon5 = new ImageIcon("./src/res/images/5.jpg");
    Icon icon6 = new ImageIcon("./src/res/images/6.jpg");
    Icon icon7 = new ImageIcon("./src/res/images/7.jpg");
    Icon icon8 = new ImageIcon("./src/res/images/8.jpg");
    Icon icon9 = new ImageIcon("./src/res/images/9.jpg");
    Icon pic = new ImageIcon("./src/res/images/flowercat.jpg");


    public PicPuzzle(){

        //top panel, center panel container: main panel 
        mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout());    
        // mainPanel.setSize(1950, 1200);
        mainPanel.setBackground(Color.RED);

        //Label 1 & 2
        lbl1 = new JLabel("Click for change icon ->");
        lbl2 = new JLabel("Click for change picture ↑                                "); //kung ayaw mag center edi im doing ts my own way LOL
        //tinatamad ako mag layout para sa lbl2 kaya ganito na lang 

        //Right Icon
        icon = new JButton();
        icon.setIcon(icon8);
        icon.setPreferredSize(new Dimension(90, 90));   

        //Wrap the text para hindi siya mag compress sa west
        JPanel topWrapper = new JPanel(new GridBagLayout());
        topWrapper.add(lbl1);

        //lbl1 and icon container: top panel
        topPanel = new JPanel(new BorderLayout());
        topPanel.setBorder(BorderFactory.createEmptyBorder(15,50,0,50));
        topPanel.add(topWrapper, BorderLayout.CENTER);
        topPanel.add(icon, BorderLayout.EAST);
        
        //buttons
        btn1 = new JButton(icon1);
        btn2 = new JButton(icon2);
        btn3 = new JButton(icon3);
        btn4 = new JButton(icon4);
        btn5 = new JButton(icon5);
        btn6 = new JButton(icon6);
        btn7 = new JButton(icon7);
        btn8 = new JButton(icon8);
        btn9 = new JButton(icon9);
        picture = new JButton();

        int w = icon1.getIconWidth();
        int h = icon1.getIconHeight();

        btn1.setPreferredSize(new Dimension(w, h));
        btn2.setPreferredSize(new Dimension(w, h));
        btn3.setPreferredSize(new Dimension(w, h)); 
        btn4.setPreferredSize(new Dimension(w, h));
        btn5.setPreferredSize(new Dimension(w, h));
        btn6.setPreferredSize(new Dimension(w, h));
        btn7.setPreferredSize(new Dimension(w, h));
        btn8.setPreferredSize(new Dimension(w, h));
        btn9.setPreferredSize(new Dimension(w, h));

        //buttons container: left panel
        leftPanel = new  JPanel();
        leftPanel.setLayout(new GridLayout(3, 3, -2, -2));
        leftPanel.setPreferredSize(new Dimension(200, 200));        
        leftPanel.setBorder(BorderFactory.createEmptyBorder(35,50,45,50));

        //add to left panel
        leftPanel.add(btn1);
        leftPanel.add(btn2);
        leftPanel.add(btn3);
        leftPanel.add(btn4);
        leftPanel.add(btn5);
        leftPanel.add(btn6);
        leftPanel.add(btn7);
        leftPanel.add(btn8);
        leftPanel.add(btn9);

        //picture    
        picture = new JButton(pic);
        picture.setPreferredSize(new Dimension(pic.getIconWidth(), pic.getIconHeight()));  

        //picture container: right panel 
        rightPanel = new JPanel();  
        rightPanel.setLayout(new BorderLayout());
        rightPanel.setBorder(BorderFactory.createEmptyBorder(35,50,45,50));  
        rightPanel.add(picture, BorderLayout.CENTER);   
                
        //wrapping the text para hindi siya mag compress sa taas(idk ayaw niya mapunta sa taas pag wala wrapper and gridbaglayout)
        JPanel leftWrapper = new JPanel(new GridBagLayout());

        //lbl2 container: bottom right panel
        bottomPanel = new JPanel(); 
        bottomPanel = new JPanel(new BorderLayout());
        leftWrapper.add(lbl2);
        bottomPanel.add(leftWrapper, BorderLayout.EAST);   
        bottomPanel.setBorder(BorderFactory.createEmptyBorder(0,0,30,50));   

        //left panel, right panel, bottom panel container: center panel    
        centerPanel = new JPanel();
        centerPanel.setLayout(new GridLayout(1, 2));
        centerPanel.add(leftPanel);
        centerPanel.add(rightPanel);
        centerPanel.add(bottomPanel);

        //add to main panel
        mainPanel.add(topPanel, BorderLayout.NORTH); 
        mainPanel.add(centerPanel, BorderLayout.CENTER);
        mainPanel.add(bottomPanel, BorderLayout.SOUTH);
           
        //add to frame
        frm.add(mainPanel);

        //frame properties  
        frm.setTitle("PicPuzzle");
        // frm.setSize(1150, 750);
        frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frm.setResizable(false);    
        frm.setLocation(150, 35);
        frm.pack();
        frm.setVisible(true);
    }
}
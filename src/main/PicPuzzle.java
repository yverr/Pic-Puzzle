package main;

import javax.swing.*;
import java.awt.*;

public class PicPuzzle{
    JFrame frm = new JFrame();
    JLabel lbl1, lbl2;
    JPanel mainPanel, topPanel, centerPanel, leftPanel, rightPanel, bottomPanel;
    JButton icon, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, picture;

    public PicPuzzle(){

        //top panel, center panel container: main panel 
        mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout());    
        mainPanel.setSize(950, 700);
        mainPanel.setBackground(Color.RED);

        //Label 1 & 2
        lbl1 = new JLabel("Click for change icon ->");
        lbl2 = new JLabel("Click for change picture ↑                                "); //kung ayaw mag center edi im doing ts my own way LOL
        //tinatamad ako mag layout para sa lbl2 kaya ganito na lang 

        //Right Icon
        icon = new JButton();
        icon.setPreferredSize(new Dimension(30, 30));   

        //Wrap the text para hindi siya mag compress sa west
        JPanel topWrapper = new JPanel(new GridBagLayout());
        topWrapper.add(lbl1);

        //lbl1 and icon container: top panel
        topPanel = new JPanel(new BorderLayout());
        topPanel.setBorder(BorderFactory.createEmptyBorder(15,50,0,50));
        topPanel.add(topWrapper, BorderLayout.WEST);
        topPanel.add(icon, BorderLayout.EAST);

        //buttons
        btn1 = new JButton();
        btn2 = new JButton();
        btn3 = new JButton();
        btn4 = new JButton();
        btn5 = new JButton();
        btn6 = new JButton();
        btn7 = new JButton();
        btn8 = new JButton();
        btn9 = new JButton();
        picture = new JButton();

        //buttons container: left panel
        leftPanel = new  JPanel();
        leftPanel.setLayout(new GridLayout(3, 3));
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
        picture = new JButton();
        picture.setPreferredSize(new Dimension(200, 200));  

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
        frm.setSize(1150, 750);
        frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frm.setResizable(true);    
        frm.setLocation(300, 80);
        frm.setVisible(true);
    }
}
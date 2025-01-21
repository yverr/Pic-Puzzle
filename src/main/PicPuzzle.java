package main;

import javax.swing.*;
import java.awt.*;

public class PicPuzzle{
    JFrame frm = new JFrame();
    JLabel lbl1, lbl2;
    JPanel mainPanel, topPanel, centerPanel, leftPanel, rightPanel, bottomLeftPanel, bottomRightPanel;
    JButton icon, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, picture;

    public PicPuzzle(){

        //top panel, center panel container: main panel 
        mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout());    
        mainPanel.setSize(750, 700);
        mainPanel.setBackground(Color.RED);

        //Label 1 & 2
        lbl1 = new JLabel("Click for change icon ->");
        lbl2 = new JLabel("Click for change picture ↑");

        //Right Icon
        icon = new JButton();
        icon.setPreferredSize(new Dimension(30, 30));   

        //Wrap the text para hindi siya mag compress sa west
        JPanel topWrapper = new JPanel(new GridBagLayout());
        topWrapper.add(lbl1);

        //lbl1 and icon container: top panel
        topPanel = new JPanel(new BorderLayout());
        topPanel.setBorder(BorderFactory.createEmptyBorder(15,30,0,30));
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
        leftPanel.setBorder(BorderFactory.createEmptyBorder(20,30,20,30));

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
        rightPanel.setBorder(BorderFactory.createEmptyBorder(20,30,20,30));  
        rightPanel.add(picture, BorderLayout.CENTER);   
        
        //bottom left panel(empty)
        bottomLeftPanel = new JPanel(); 

        //wrapping the text para hindi siya mag compress sa taas(idk ayaw niya mapunta sa taas pag wala wrapper and gridbaglayout)
        JPanel centerWrapper = new JPanel(new GridBagLayout());

        //lbl2 container: bottom right panel
        bottomRightPanel = new JPanel(new BorderLayout());
        centerWrapper.add(lbl2);
        bottomRightPanel.add(centerWrapper, BorderLayout.NORTH);   

        //left panel, right panel, bottom left panel, bottom right panel container: center panel    
        centerPanel = new JPanel();
        centerPanel.setLayout(new GridLayout(2, 2));
        centerPanel.add(leftPanel);
        centerPanel.add(rightPanel);
        centerPanel.add(bottomLeftPanel);
        centerPanel.add(bottomRightPanel);

        //add to main panel
        mainPanel.add(topPanel, BorderLayout.NORTH); 
        mainPanel.add(centerPanel, BorderLayout.CENTER);    

        //add to frame
        frm.add(mainPanel);

        //frame properties  
        frm.setTitle("PicPuzzle");
        frm.setSize(750, 700);
        frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frm.setResizable(false);    
        frm.setLocation(300, 80);
        frm.setVisible(true);
    }
}
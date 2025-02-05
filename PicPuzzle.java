import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class PicPuzzle implements ActionListener{
    JFrame frm = new JFrame();
    JLabel lbl1, lbl2;
    JPanel mainPanel, topPanel, centerPanel, leftPanel, rightPanel, bottomPanel;
    JButton icon, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, picture;

    Icon star;

    Icon icon1 = new ImageIcon("./src/images/Flower/1.jpg");
    Icon icon2 = new ImageIcon("./src/images/Flower/2.jpg");
    Icon icon3 = new ImageIcon("./src/images/Flower/3.jpg");
    Icon icon4 = new ImageIcon("./src/images/Flower/4.jpg");
    Icon icon5 = new ImageIcon("./src/images/Flower/5.jpg");
    Icon icon6 = new ImageIcon("./src/images/Flower/6.jpg");
    Icon icon7 = new ImageIcon("./src/images/Flower/7.jpg");
    Icon icon8 = new ImageIcon("./src/images/Flower/8.jpg");
    Icon icon9 = new ImageIcon("./src/images/Flower/9.jpg");
    Icon pic = new ImageIcon("./src/images/Flower/cropped2.jpg");

    Icon icon11 = new ImageIcon("./src/images/Pikachu/11.jpg");
    Icon icon12 = new ImageIcon("./src/images/Pikachu/12.jpg");
    Icon icon13 = new ImageIcon("./src/images/Pikachu/13.jpg");
    Icon icon14 = new ImageIcon("./src/images/Pikachu/14.jpg");
    Icon icon15 = new ImageIcon("./src/images/Pikachu/15.jpg");
    Icon icon16 = new ImageIcon("./src/images/Pikachu/16.jpg");
    Icon icon17 = new ImageIcon("./src/images/Pikachu/17.jpg");
    Icon icon18 = new ImageIcon("./src/images/Pikachu/18.jpg");
    Icon icon19 = new ImageIcon("./src/images/Pikachu/19.jpg");
    Icon pic2 = new ImageIcon("./src/images/Pikachu/pikachu.jpg");

    Icon icon20 = new ImageIcon("./src/images/Guy/20.jpg");
    Icon icon21 = new ImageIcon("./src/images/Guy/21.jpg");
    Icon icon22 = new ImageIcon("./src/images/Guy/22.jpg");
    Icon icon23 = new ImageIcon("./src/images/Guy/23.jpg");
    Icon icon24 = new ImageIcon("./src/images/Guy/24.jpg");
    Icon icon25 = new ImageIcon("./src/images/Guy/25.jpg");
    Icon icon26 = new ImageIcon("./src/images/Guy/26.jpg");
    Icon icon27 = new ImageIcon("./src/images/Guy/27.jpg");
    Icon icon28 = new ImageIcon("./src/images/Guy/28.jpg");
    Icon pic3 = new ImageIcon("./src/images/Guy/guy.jpg");

    Icon icon29 = new ImageIcon("./src/images/Killua/29.jpg");
    Icon icon30 = new ImageIcon("./src/images/Killua/30.jpg");
    Icon icon31 = new ImageIcon("./src/images/Killua/31.jpg");
    Icon icon32 = new ImageIcon("./src/images/Killua/32.jpg");
    Icon icon33 = new ImageIcon("./src/images/Killua/33.jpg");
    Icon icon34 = new ImageIcon("./src/images/Killua/34.jpg");
    Icon icon35 = new ImageIcon("./src/images/Killua/35.jpg");
    Icon icon36 = new ImageIcon("./src/images/Killua/36.jpg");
    Icon icon37 = new ImageIcon("./src/images/Killua/37.jpg");
    Icon pic4 = new ImageIcon("./src/images/Killua/killua2.jpg");

    Icon icon38 = new ImageIcon("./src/images/yuu/38.jpg");
    Icon icon39 = new ImageIcon("./src/images/yuu/39.jpg");
    Icon icon40 = new ImageIcon("./src/images/yuu/40.jpg");
    Icon icon41 = new ImageIcon("./src/images/yuu/41.jpg");
    Icon icon42 = new ImageIcon("./src/images/yuu/42.jpg");
    Icon icon43 = new ImageIcon("./src/images/yuu/43.jpg");
    Icon icon44 = new ImageIcon("./src/images/yuu/45.jpg");
    Icon icon45 = new ImageIcon("./src/images/yuu/45.jpg");
    Icon icon46 = new ImageIcon("./src/images/yuu/46.jpg");
    Icon pic5 = new ImageIcon("./src/images/yuu/yuu.jpg");

    public PicPuzzle(){

        //top panel, center panel container: main panel 
        mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout());    
        mainPanel.setSize(1950, 1200);
        mainPanel.setBackground(Color.RED);

        //Label 1 & 2
        lbl1 = new JLabel("Click for change icon ->");
        lbl2 = new JLabel("Click for change picture ↑                                "); //kung ayaw mag center edi im doing ts my own way LOL
        //tinatamad ako mag layout para sa lbl2 kaya ganito na lang 

        //Right Icon
        icon = new JButton(icon9);
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
        picture = new JButton(pic);

       // star = btn6.getIcon();

        //setting preffered size for buttons
        int w = icon1.getIconWidth();
        int h = icon1.getIconHeight();

        //w = getIconWidth, h = getIconHeight
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
        frm.setSize(1150, 750);
        frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frm.setResizable(false);    
        frm.setLocation(150, 35);
        // frm.pack();
        frm.setVisible(true);

        //Action Listener
        btn1.addActionListener(this); btn2.addActionListener(this);
        btn3.addActionListener(this); btn4.addActionListener(this);
        btn5.addActionListener(this); btn6.addActionListener(this);
        btn7.addActionListener(this); btn8.addActionListener(this);
        btn9.addActionListener(this); picture.addActionListener(this);
        icon.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

      if(e.getSource()==btn1){  
        Icon s1=btn1.getIcon();  
          if(btn2.getIcon()==star){  
            btn2.setIcon(s1);  
            btn1.setIcon(star);  
          } else if(btn4.getIcon()==star){  
                        btn4.setIcon(s1);  
                        btn1.setIcon(star);  
                       }  
      }//end of if  
      
    if(e.getSource()==btn2){  
        Icon s1=btn2.getIcon();  
          if(btn1.getIcon()==star){  
            btn1.setIcon(s1);  
            btn2.setIcon(star);  
          } else if(btn5.getIcon()==star){  
                        btn5.setIcon(s1);  
                        btn2.setIcon(star);  
                       }  
             else if(btn3.getIcon()==star){  
                        btn3.setIcon(s1);  
                        btn2.setIcon(star);  
                       }  
      }//end of if  
      
    if(e.getSource()==btn3){  
        Icon s1=btn3.getIcon();  
          if(btn2.getIcon()==star){  
            btn2.setIcon(s1);  
            btn3.setIcon(star);  
          } else if(btn6.getIcon()==star){  
                        btn6.setIcon(s1);  
                        btn3.setIcon(star);  
                       }  
      }//end of if  
      
    if(e.getSource()==btn4){  
        Icon s1=btn4.getIcon();  
          if(btn1.getIcon()==star){  
            btn1.setIcon(s1);  
            btn4.setIcon(star);  
          } else if(btn5.getIcon()==star){  
                        btn5.setIcon(s1);  
                        btn4.setIcon(star);  
                       }  
             else if(btn7.getIcon()==star){  
                        btn7.setIcon(s1);  
                        btn4.setIcon(star);  
                       }  
      }//end of if  
      
    if(e.getSource()==btn5){  
        Icon s1=btn5.getIcon();  
          if(btn2.getIcon()==star){  
            btn2.setIcon(s1);  
            btn5.setIcon(star);  
          } else if(btn4.getIcon()==star){  
                        btn4.setIcon(s1);  
                        btn5.setIcon(star);  
                       }  
             else if(btn6.getIcon()==star){  
                        btn6.setIcon(s1);  
                        btn5.setIcon(star);  
                       }  
              else if(btn8.getIcon()==star){  
                        btn8.setIcon(s1);  
                        btn5.setIcon(star);  
                       }  
      }//end of if  
      
    if(e.getSource()==btn6){  
        Icon s1=btn6.getIcon();  
          if(btn3.getIcon()==star){  
            btn3.setIcon(s1);  
            btn6.setIcon(star);  
          } else if(btn5.getIcon()==star){  
                        btn5.setIcon(s1);  
                        btn6.setIcon(star);  
                       }  
             else if(btn9.getIcon()==star){  
                        btn9.setIcon(s1);  
                        btn6.setIcon(star);  
                       }  
    }//end of if  
      
    if(e.getSource()==btn7){  
        Icon s1=btn7.getIcon();  
          if(btn4.getIcon()==star){  
            btn4.setIcon(s1);  
            btn7.setIcon(star);  
          } else if(btn8.getIcon()==star){  
                        btn8.setIcon(s1);  
                        btn7.setIcon(star);  
                       }  
     }//end of if  
      
       if(e.getSource()==btn8){  
        Icon s1=btn8.getIcon();  
          if(btn7.getIcon()==star){  
            btn7.setIcon(s1);  
            btn8.setIcon(star);  
          } else if(btn5.getIcon()==star){  
                        btn5.setIcon(s1);  
                        btn8.setIcon(star);  
                       }  
             else if(btn9.getIcon()==star){  
                        btn9.setIcon(s1);  
                        btn8.setIcon(star);  
                       }  
      
      }//end of if  
      
     if(e.getSource()==btn9){  
        Icon s1=btn9.getIcon();  
          if(btn8.getIcon()==star){  
            btn8.setIcon(s1);  
            btn9.setIcon(star);  
          } else if(btn6.getIcon()==star){  
                        btn6.setIcon(s1);  
                        btn9.setIcon(star);  
                       }  
      }//end of if  
      
          
      if(e.getSource()==picture){
        Icon s1 = picture.getIcon();   
          if(s1==pic5){
            picture.setIcon(pic);
            btn1.setIcon(icon1);
            btn2.setIcon(icon2);
            btn3.setIcon(icon3);
            btn4.setIcon(icon4);
            btn5.setIcon(icon5);
            btn6.setIcon(icon6);
            btn7.setIcon(icon7);
            btn8.setIcon(icon8);
            btn9.setIcon(icon9);

          }else if(s1==pic){
            picture.setIcon(pic2);
            btn1.setIcon(icon18);
            btn2.setIcon(icon11);
            btn3.setIcon(icon12);
            btn4.setIcon(icon13);
            btn5.setIcon(icon14);
            btn6.setIcon(icon15);
            btn7.setIcon(icon16);
            btn8.setIcon(icon17);
            btn9.setIcon(icon19);

          }else if(s1==pic2){
            picture.setIcon(pic3);
            btn1.setIcon(icon28);
            btn2.setIcon(icon20);
            btn3.setIcon(icon21);
            btn4.setIcon(icon22);
            btn5.setIcon(icon23);
            btn6.setIcon(icon24);
            btn7.setIcon(icon25);
            btn8.setIcon(icon26);
            btn9.setIcon(icon27);

          } else if(s1==pic3){
            picture.setIcon(pic4);
            btn1.setIcon(icon29);
            btn2.setIcon(icon30);
            btn3.setIcon(icon31);
            btn4.setIcon(icon32);
            btn5.setIcon(icon33);
            btn6.setIcon(icon34);
            btn7.setIcon(icon35);
            btn8.setIcon(icon36);
            btn9.setIcon(icon37);
          } else if(s1==pic4){
            picture.setIcon(pic5);
            btn1.setIcon(icon38);
            btn2.setIcon(icon39);
            btn3.setIcon(icon40);
            btn4.setIcon(icon41);
            btn5.setIcon(icon42);
            btn6.setIcon(icon43);
            btn7.setIcon(icon44);
            btn8.setIcon(icon45);
            btn9.setIcon(icon46);
          } 
      }

      if(e.getSource()== icon){
        Icon s2 = icon.getIcon();
          if(s2==icon9){
            star=btn1.getIcon();
            icon.setIcon(star);
          } else if(s2==icon1){
            star=btn2.getIcon();
            icon.setIcon(star);
          } else if(s2==icon2){
            star=btn3.getIcon();
            icon.setIcon(icon3);
          }else if(s2==icon3){
            star=btn4.getIcon();
            icon.setIcon(icon4);
          }else if(s2==icon4){
            star=btn5.getIcon();
            icon.setIcon(icon5); 
          } else if(s2==icon5){
            star=btn6.getIcon();
            icon.setIcon(icon6); 
          } else if(s2==icon6){
            star=btn7.getIcon();
            icon.setIcon(icon7); 
          } else if(s2==icon7){
            star=btn8.getIcon();
            icon.setIcon(icon8); 
          } else if(s2==icon8){
            star=btn9.getIcon();
            icon.setIcon(icon9); 
          } else{
            JOptionPane.showMessageDialog(null, "Wrong Puzzle", "Do you want to repeat again", JOptionPane.YES_NO_OPTION);
          }
      }
    }
}

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
    //puzzle set 1
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

    //puzzle set 2
    Icon icon10 = new ImageIcon("./src/res/images/10.jpg");
    Icon icon11 = new ImageIcon("./src/res/images/11.jpg");
    Icon icon12 = new ImageIcon("./src/res/images/12.jpg");
    Icon icon13 = new ImageIcon("./src/res/images/13.jpg");
    Icon icon14 = new ImageIcon("./src/res/images/14.jpg");
    Icon icon15 = new ImageIcon("./src/res/images/15.jpg");
    Icon icon16 = new ImageIcon("./src/res/images/16.jpg");
    Icon icon17 = new ImageIcon("./src/res/images/17.jpg");
    Icon icon18 = new ImageIcon("./src/res/images/18.jpg");
    Icon pic2 = new ImageIcon("./src/res/images/killua.png");

    //puzzle set 3
    Icon icon19 = new ImageIcon("./src/res/images/19.jpg");
    Icon icon20 = new ImageIcon("./src/res/images/20.jpg");
    Icon icon21 = new ImageIcon("./src/res/images/21.jpg");
    Icon icon22 = new ImageIcon("./src/res/images/22.jpg");
    Icon icon23 = new ImageIcon("./src/res/images/23.jpg");
    Icon icon24 = new ImageIcon("./src/res/images/24.jpg");
    Icon icon25 = new ImageIcon("./src/res/images/25.jpg");
    Icon icon26 = new ImageIcon("./src/res/images/26.jpg");
    Icon icon27 = new ImageIcon("./src/res/images/27.jpg");
    Icon pic3 = new ImageIcon("./src/res/images/yui.jpg");

    //puzzle set 4
    Icon icon28 = new ImageIcon("./src/res/images/28.jpg");
    Icon icon29 = new ImageIcon("./src/res/images/29.jpg");
    Icon icon30 = new ImageIcon("./src/res/images/30.jpg");
    Icon icon31 = new ImageIcon("./src/res/images/31.jpg");
    Icon icon32 = new ImageIcon("./src/res/images/32.jpg");
    Icon icon33 = new ImageIcon("./src/res/images/33.jpg");
    Icon icon34 = new ImageIcon("./src/res/images/34.jpg");
    Icon icon35 = new ImageIcon("./src/res/images/35.jpg");
    Icon icon36 = new ImageIcon("./src/res/images/36.jpg");
    Icon pic4 = new ImageIcon("./src/res/images/pika.jpg");

    //puzzle set 5
    Icon icon37 = new ImageIcon("./src/res/images/37.jpg");
    Icon icon38 = new ImageIcon("./src/res/images/38.jpg");
    Icon icon39 = new ImageIcon("./src/res/images/39.jpg");
    Icon icon40 = new ImageIcon("./src/res/images/40.jpg");
    Icon icon41 = new ImageIcon("./src/res/images/41.jpg");
    Icon icon42 = new ImageIcon("./src/res/images/42.jpg");
    Icon icon43 = new ImageIcon("./src/res/images/43.jpg");
    Icon icon44 = new ImageIcon("./src/res/images/44.jpg");
    Icon icon45 = new ImageIcon("./src/res/images/45.jpg");
    Icon pic5 = new ImageIcon("./src/res/images/cat.jpg");

    //Order of correct puzzle piece
    Icon[] correctIconsPic1 = {icon9, icon8, icon7, icon6, icon5, icon4, icon3, icon2, icon1};
    Icon[] correctIconsPic2 = {icon18, icon17, icon16, icon15, icon14, icon13, icon12, icon11, icon10};
    Icon[] correctIconsPic3 = {icon26, icon24, icon25, icon19, icon21, icon20, icon23, icon27, icon22};
    Icon[] correctIconsPic4 = {icon30, icon28, icon31, icon36, icon29, icon34, icon35, icon32, icon33};
    Icon[] correctIconsPic5 = {icon37, icon40, icon44, icon41, icon39, icon45, icon38, icon43, icon42};

    public PicPuzzle(){

        //assigning a random icon
        star = icon8;

        //top panel, center panel container: main panel 
        mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout());    
        // mainPanel.setSize(1950, 1200);
        mainPanel.setBackground(Color.RED);

        //Label 1 & 2
        lbl1 = new JLabel("Click for change icon ->");
        lbl2 = new JLabel("Click for change picture ↑"); 

        //Right Icon
        icon = new JButton(icon8);
        // icon.setIcon(ic0);
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
        frm.setLocation(250, 75);
        frm.pack();
        frm.setVisible(true);

        
        //action listener 
        icon.addActionListener(this);
        btn1.addActionListener(this); btn2.addActionListener(this);
        btn3.addActionListener(this); btn4.addActionListener(this);
        btn5.addActionListener(this); btn6.addActionListener(this);
        btn7.addActionListener(this); btn8.addActionListener(this);
        btn9.addActionListener(this); picture.addActionListener(this);
    }



    @Override
    public void actionPerformed(ActionEvent e) {

        // NOTE: A button can only switch to its neighbouring buttons/the buttons besides it.
        //switch button 1 to button 2 and 4
        if(e.getSource() == btn1){
            Icon s1 = btn1.getIcon();
                if(btn2.getIcon()==star){
                    btn2.setIcon(s1);
                    btn1.setIcon(star);
                } else if(btn4.getIcon()==star){
                    btn4.setIcon(s1);
                    btn1.setIcon(star);
                }
        }

        //switch button 2 to button 1, 5, 3
        if(e.getSource() == btn2){
            Icon s1 = btn2.getIcon();
                if(btn1.getIcon()==star){
                    btn1.setIcon(s1);
                    btn2.setIcon(star);
                } else if(btn5.getIcon()==star){
                    btn5.setIcon(s1);
                    btn2.setIcon(star);
                } else if(btn3.getIcon()==star){
                    btn3.setIcon(s1);
                    btn2.setIcon(star);
                }
        }

        //switch button 3 to button 2 and 6
        if(e.getSource()==btn3){  
            Icon s1=btn3.getIcon();  
                if(btn2.getIcon()==star){  
                    btn2.setIcon(s1);  
                    btn3.setIcon(star);  
                } else if(btn6.getIcon()==star){  
                    btn6.setIcon(s1);  
                    btn3.setIcon(star);  
                }  
        }

        //switch button 4 to 1, 5, 7
        if(e.getSource()==btn4){  
            Icon s1=btn4.getIcon();  
                if(btn1.getIcon()==star){  
                    btn1.setIcon(s1);  
                    btn4.setIcon(star);  
                } else if(btn5.getIcon()==star){  
                    btn5.setIcon(s1);  
                    btn4.setIcon(star);  
                } else if(btn7.getIcon()==star){  
                    btn7.setIcon(s1);  
                    btn4.setIcon(star);  
                }  
        }

        //switch button 5 to 2, 4, 6, 8
        if(e.getSource()==btn5){  
            Icon s1=btn5.getIcon();  
                if(btn2.getIcon()==star){  
                    btn2.setIcon(s1);  
                    btn5.setIcon(star);  
                } else if(btn4.getIcon()==star){  
                    btn4.setIcon(s1);  
                    btn5.setIcon(star);  
                } else if(btn6.getIcon()==star){  
                    btn6.setIcon(s1);  
                    btn5.setIcon(star);  
                } else if(btn8.getIcon()==star){  
                    btn8.setIcon(s1);  
                    btn5.setIcon(star);  
                }  
        }

        //switch button 6 to 3, 5, 9
        if(e.getSource()==btn6){  
            Icon s1=btn6.getIcon();  
                if(btn3.getIcon()==star){  
                    btn3.setIcon(s1);  
                    btn6.setIcon(star);  
                } else if(btn5.getIcon()==star){  
                    btn5.setIcon(s1);  
                    btn6.setIcon(star);  
                } else if(btn9.getIcon()==star){  
                    btn9.setIcon(s1);  
                    btn6.setIcon(star);  
                }  
        }

        //switch button 7 to 4 and 8
        if(e.getSource()==btn7){  
            Icon s1=btn7.getIcon();  
                if(btn4.getIcon()==star){  
                    btn4.setIcon(s1);  
                    btn7.setIcon(star);  
                } else if(btn8.getIcon()==star){  
                    btn8.setIcon(s1);  
                    btn7.setIcon(star);  
                }  
        } 

        //switch button 8 to 7, 5, 9
        if(e.getSource()==btn8){  
            Icon s1=btn8.getIcon();  
                if(btn7.getIcon()==star){  
                    btn7.setIcon(s1);  
                    btn8.setIcon(star);  
                } else if(btn5.getIcon()==star){  
                    btn5.setIcon(s1);  
                    btn8.setIcon(star);  
                } else if(btn9.getIcon()==star){  
                    btn9.setIcon(s1);  
                    btn8.setIcon(star);  
                }
        }  

        //switch button 9 to 8 and 6
        if(e.getSource()==btn9){  
            Icon s1=btn9.getIcon();  
                if(btn8.getIcon()==star){  
                    btn8.setIcon(s1);  
                    btn9.setIcon(star);  
                } else if(btn6.getIcon()==star){  
                    btn6.setIcon(s1);  
                    btn9.setIcon(star);  
                }  
        }  

        //change puzzle set
        if(e.getSource()==picture){
            Icon s1 = picture.getIcon();   
            if(s1==pic && checkPuzzleSolved()){
                picture.setIcon(pic2);
                btn1.setIcon(icon10);
                btn2.setIcon(icon11);
                btn3.setIcon(icon12);
                btn4.setIcon(icon13);
                btn5.setIcon(icon14);
                btn6.setIcon(icon15);
                btn7.setIcon(icon16);
                btn8.setIcon(icon17);
                btn9.setIcon(icon18);
                icon.setIcon(icon15);
                star = icon.getIcon();
            } else if(s1==pic2 && checkPuzzleSolved()){
                picture.setIcon(pic3);
                btn1.setIcon(icon19);
                btn2.setIcon(icon20);
                btn3.setIcon(icon21);
                btn4.setIcon(icon22);
                btn5.setIcon(icon23);
                btn6.setIcon(icon24);
                btn7.setIcon(icon25);
                btn8.setIcon(icon26);
                btn9.setIcon(icon27);
                icon.setIcon(icon20);
                star = icon.getIcon(); 
            } else if(s1==pic3 && checkPuzzleSolved()){
                picture.setIcon(pic4);
                btn1.setIcon(icon28);
                btn2.setIcon(icon29);
                btn3.setIcon(icon30);
                btn4.setIcon(icon31);
                btn5.setIcon(icon32);
                btn6.setIcon(icon33);
                btn7.setIcon(icon34);
                btn8.setIcon(icon35);
                btn9.setIcon(icon36);
                icon.setIcon(icon32);
                star = icon.getIcon();
            } else if(s1==pic4 && checkPuzzleSolved()){
                picture.setIcon(pic5);
                btn1.setIcon(icon37);
                btn2.setIcon(icon38);
                btn3.setIcon(icon39);
                btn4.setIcon(icon40);
                btn5.setIcon(icon41);
                btn6.setIcon(icon42);
                btn7.setIcon(icon43);
                btn8.setIcon(icon44);
                btn9.setIcon(icon45);
                icon.setIcon(icon44);
                star = icon.getIcon();
            } else if(s1==pic5){
                JOptionPane.showMessageDialog(frm, "You won the entire puzzle!", "Congratulations!", JOptionPane.INFORMATION_MESSAGE);
                //TO DO: add a prompt, back to game menu or restart option.
            } 
        }

        //icon switches from the first icon to the last icon with every click(basically, it's just looping)
        if(e.getSource()== icon ){
            //checking kung alin set ng puzzle icons ang mag display sa icon based sa pic, pic2, pic3, pic4, pic5
            if(picture.getIcon()==pic){
                Icon s2 = icon.getIcon();
                if(s2==icon9){
                    icon.setIcon(icon1); //if the icon(icon9) is clicked, the icon becomes (icon1)
                    star = icon1;// star switches to icon1 as well
                } else if(s2==icon1){
                    icon.setIcon(icon2); //if the icon(icon1) is clicked, the icon becomes (icon2)
                    star = icon2;// star switches to icon2 as well
                } else if(s2==icon2){
                    icon.setIcon(icon3);//repeat
                     star = icon3;   
                }else if(s2==icon3){
                    icon.setIcon(icon4);
                     star = icon4;
                }else if(s2==icon4){
                    icon.setIcon(icon5);
                    star = icon5;
                } else if(s2==icon5){
                    icon.setIcon(icon6);
                    star = icon6;
                } else if(s2==icon6){
                    icon.setIcon(icon7);
                    star = icon7;
                } else if(s2==icon7){
                    icon.setIcon(icon8);
                    star = icon8;
                } else if(s2==icon8){
                    icon.setIcon(icon9); 
                    star = icon9;
                } 
            } else if (picture.getIcon() == pic2){
                Icon s2 = icon.getIcon();
                if (s2==icon18) {
                    icon.setIcon(icon10);
                    star = icon10;
                } else if (s2 == icon10) {
                    icon.setIcon(icon11);
                    star = icon11;
                } else if (s2 == icon11) {
                    icon.setIcon(icon12);
                    star = icon12;
                } else if (s2 == icon12) {
                    icon.setIcon(icon13);
                    star = icon13;
                } else if (s2 == icon13) {
                    icon.setIcon(icon14);
                    star = icon14;
                } else if (s2 == icon14) {
                    icon.setIcon(icon15);
                    star = icon15;
                } else if (s2 == icon15) {
                    icon.setIcon(icon16);
                    star = icon16;
                } else if (s2 == icon16) {
                    icon.setIcon(icon17);
                    star = icon17;
                } else if (s2 == icon17) {
                    icon.setIcon(icon18);
                    star = icon18;
                }
            } else if (picture.getIcon()==pic3){
                Icon s2=icon.getIcon();
                if (s2==icon27) {
                    icon.setIcon(icon19);
                    star = icon19;
                } else if (s2 == icon19) {
                    icon.setIcon(icon20);
                    star = icon20;
                } else if (s2 == icon20) {
                    icon.setIcon(icon21);
                    star = icon21;  
                } else if (s2 == icon21) {
                    icon.setIcon(icon22);
                    star = icon22;
                } else if (s2 == icon22) {
                    icon.setIcon(icon23);
                    star = icon23;
                } else if (s2 == icon23) {
                    icon.setIcon(icon24);
                    star = icon24;
                } else if (s2 == icon24) {
                    icon.setIcon(icon25);
                    star = icon25;
                } else if (s2 == icon25) {
                    icon.setIcon(icon26);
                    star = icon26;
                } else if (s2 == icon26) {
                    icon.setIcon(icon27);
                    star = icon27;
                }
            } else if (picture.getIcon() == pic4){
                Icon s2 = icon.getIcon();
                if (s2==icon36) {
                    icon.setIcon(icon28);
                    star = icon28;
                } else if (s2 == icon28) {
                    icon.setIcon(icon29);
                    star = icon29;
                } else if (s2 == icon29) {
                    icon.setIcon(icon30);
                    star = icon30;
                } else if (s2 == icon30) {
                    icon.setIcon(icon31);
                    star = icon31;
                } else if (s2 == icon31) {
                    icon.setIcon(icon32);
                    star = icon32;
                } else if (s2 == icon32) {
                    icon.setIcon(icon33);
                    star = icon33;
                } else if (s2 == icon33) {
                    icon.setIcon(icon34);
                    star = icon34;
                } else if (s2 == icon34) {
                    icon.setIcon(icon35);
                    star = icon35;
                } else if (s2 == icon35) {
                    icon.setIcon(icon36);
                    star = icon36;
                }
            } else if (picture.getIcon() == pic5) {
                Icon s2 = icon.getIcon();
                if (s2 ==icon45) {
                    icon.setIcon(icon37);
                    star = icon37;
                } else if (s2==icon37) {
                    icon.setIcon(icon38);
                    star = icon38;
                } else if (s2==icon38) {
                    icon.setIcon(icon39);
                    star = icon39;
                } else if (s2==icon39) {
                    icon.setIcon(icon40);
                    star = icon40;
                } else if (s2==icon40) {
                    icon.setIcon(icon41);
                    star = icon41;
                } else if (s2==icon41) {
                    icon.setIcon(icon42);
                    star = icon42;
                } else if (s2==icon42) {
                    icon.setIcon(icon43);
                    star = icon43;
                } else if (s2==icon43) {
                    icon.setIcon(icon44);
                    star = icon44;
                } else if (s2==icon44) {
                    icon.setIcon(icon45);
                    star = icon45;
                }
            }
        }
    }

    private boolean checkPuzzleSolved() {
        Icon[] currentIcons = {
            btn1.getIcon(), btn2.getIcon(), btn3.getIcon(),
            btn4.getIcon(), btn5.getIcon(), btn6.getIcon(),
            btn7.getIcon(), btn8.getIcon(), btn9.getIcon()
        };

        Icon[] correctIcon = null;
        Icon currentPic = picture.getIcon();
        if(currentPic == pic)
            correctIcon = correctIconsPic1;
        else if(currentPic == pic2)
            correctIcon = correctIconsPic2;
        else if(currentPic == pic3)
            correctIcon = correctIconsPic3;
        else if(currentPic == pic4)
            correctIcon = correctIconsPic4;
        else if(currentPic == pic5)
            correctIcon = correctIconsPic5;

        boolean isSolved = true;
        for (int i = 0; i < currentIcons.length; i++) {
            if (currentIcons[i] != correctIcon[i]) {
                isSolved = false;
                break;
            }
        }

        if (isSolved) {
            JOptionPane.showMessageDialog(frm, "You solved the puzzle! Next!", "Congratulations!", JOptionPane.INFORMATION_MESSAGE);
            return true;
        }  else {
            JOptionPane.showMessageDialog(frm, "Not yet. Keep trying!", "Puzzle Incomplete", JOptionPane.WARNING_MESSAGE);
            return false;
        }
    }
}

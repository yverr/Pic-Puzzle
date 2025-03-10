package com.example;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class PicPuzzle implements ActionListener{
    //cry
    JFrame frm = new JFrame();
    JLabel lbl1, lbl2, moveLabel;
    JPanel mainPanel, topPanel, centerPanel, leftPanel, rightPanel, bottomPanel;
    JButton icon, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, picture;
    int moveCount = 0;
    private Timer timer;
    private int secondsElapsed = 0;
    private final JLabel timerLabel;
    private final JButton pauseButton;
    private final JLabel statusLabel;
    private final Levels gameDifficulty;
    

    Icon star;
    //puzzle set 1
    Icon icon1 = new ImageIcon("demo\\src\\resources\\images\\1.jpg"); Icon icon2 = new ImageIcon("demo\\src\\resources\\images\\2.jpg"); Icon icon3 = new ImageIcon("demo\\src\\resources\\images\\3.jpg");
    Icon icon4 = new ImageIcon("demo\\src\\resources\\images\\4.jpg"); Icon icon5 = new ImageIcon("demo\\src\\resources\\images\\5.jpg"); Icon icon6 = new ImageIcon("demo\\src\\resources\\images\\6.jpg");
    Icon icon7 = new ImageIcon("demo\\src\\resources\\images\\7.jpg"); Icon icon8 = new ImageIcon("demo\\src\\resources\\images\\8.jpg"); Icon icon9 = new ImageIcon("demo\\src\\resources\\images\\9.jpg");
    Icon pic = new ImageIcon("demo\\src\\resources\\images\\flowercat.jpg");

    //puzzle set 2
    Icon icon10 = new ImageIcon("demo\\src\\resources\\images\\10.jpg"); Icon icon11 = new ImageIcon("demo\\src\\resources\\images\\11.jpg"); Icon icon12 = new ImageIcon("demo\\src\\resources\\images\\12.jpg");
    Icon icon13 = new ImageIcon("demo\\src\\resources\\images\\13.jpg"); Icon icon14 = new ImageIcon("demo\\src\\resources\\images\\14.jpg"); Icon icon15 = new ImageIcon("demo\\src\\resources\\images\\15.jpg");
    Icon icon16 = new ImageIcon("demo\\src\\resources\\images\\16.jpg"); Icon icon17 = new ImageIcon("demo\\src\\resources\\images\\17.jpg"); Icon icon18 = new ImageIcon("demo\\src\\resources\\images\\18.jpg");
    Icon pic2 = new ImageIcon("demo\\src\\resources\\images\\killua.png");

    //puzzle set 3
    Icon icon19 = new ImageIcon("demo\\src\\resources\\images\\19.jpg"); Icon icon20 = new ImageIcon("demo\\src\\resources\\images\\20.jpg"); Icon icon21 = new ImageIcon("demo\\src\\resources\\images\\21.jpg");
    Icon icon22 = new ImageIcon("demo\\src\\resources\\images\\22.jpg"); Icon icon23 = new ImageIcon("demo\\src\\resources\\images\\23.jpg"); Icon icon24 = new ImageIcon("demo\\src\\resources\\images\\24.jpg");
    Icon icon25 = new ImageIcon("demo\\src\\resources\\images\\25.jpg"); Icon icon26 = new ImageIcon("demo\\src\\resources\\images\\26.jpg"); Icon icon27 = new ImageIcon("demo\\src\\resources\\images\\27.jpg");
    Icon pic3 = new ImageIcon("demo\\src\\resources\\images\\yui.jpg");

    //puzzle set 4
    Icon icon28 = new ImageIcon("demo\\src\\resources\\images\\28.jpg"); Icon icon29 = new ImageIcon("demo\\src\\resources\\images\\29.jpg"); Icon icon30 = new ImageIcon("demo\\src\\resources\\images\\30.jpg");
    Icon icon31 = new ImageIcon("demo\\src\\resources\\images\\31.jpg"); Icon icon32 = new ImageIcon("demo\\src\\resources\\images\\32.jpg"); Icon icon33 = new ImageIcon("demo\\src\\resources\\images\\33.jpg");
    Icon icon34 = new ImageIcon("demo\\src\\resources\\images\\34.jpg"); Icon icon35 = new ImageIcon("demo\\src\\resources\\images\\35.jpg"); Icon icon36 = new ImageIcon("demo\\src\\resources\\images\\36.jpg"); 
    Icon pic4 = new ImageIcon("demo\\src\\resources\\images\\pika.jpg");

    //puzzle set 5
    Icon icon37 = new ImageIcon("demo\\src\\resources\\images\\37.jpg"); Icon icon38 = new ImageIcon("demo\\src\\resources\\images\\38.jpg"); Icon icon39 = new ImageIcon("demo\\src\\resources\\images\\39.jpg");
    Icon icon40 = new ImageIcon("demo\\src\\resources\\images\\40.jpg"); Icon icon41 = new ImageIcon("demo\\src\\resources\\images\\41.jpg"); Icon icon42 = new ImageIcon("demo\\src\\resources\\images\\42.jpg");
    Icon icon43 = new ImageIcon("demo\\src\\resources\\images\\43.jpg"); Icon icon44 = new ImageIcon("demo\\src\\resources\\images\\44.jpg"); Icon icon45 = new ImageIcon("demo\\src\\resources\\images\\45.jpg");
    Icon pic5 = new ImageIcon("demo\\src\\resources\\images\\cat.jpg");

    //Order of correct puzzle pieces
    Icon[] correctIconsPic1 = {icon9, icon8, icon7, icon6, icon5, icon4, icon3, icon2, icon1};
    Icon[] correctIconsPic2 = {icon18, icon17, icon16, icon15, icon14, icon13, icon12, icon11, icon10};
    Icon[] correctIconsPic3 = {icon26, icon24, icon25, icon19, icon21, icon20, icon23, icon27, icon22};
    Icon[] correctIconsPic4 = {icon30, icon28, icon31, icon36, icon29, icon34, icon35, icon32, icon33};
    Icon[] correctIconsPic5 = {icon37, icon40, icon44, icon41, icon39, icon45, icon38, icon43, icon42};

    int currentLevel = 2;
    private PauseMenu pauseMenu;
    
    public PicPuzzle(){
        gameDifficulty = new Levels(frm, this);

        star = icon8;

        mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout());
        mainPanel.setBackground(Color.RED);

        lbl1 = new JLabel("Click for change icon ->");
        lbl1.setFont(new Font("Comic Sans", Font.BOLD, 15));
        lbl2 = new JLabel("Click for change picture ↑");
        lbl2.setFont(new Font("Comic Sans", Font.BOLD, 15));

        icon = new JButton(icon8);
        icon.setPreferredSize(new Dimension(90, 90));

        var topWrapper = new JPanel(new GridBagLayout());
        topWrapper.add(lbl1);

        pauseButton = new JButton("❚❚");
        pauseButton.setFont(new Font("Comic Sans", Font.BOLD, 35));
        pauseButton.setPreferredSize(new Dimension(90, 90));
        pauseButton.addActionListener(e -> showPauseMenu());
        pauseButton.setFocusable(false);

        topPanel = new JPanel(new BorderLayout());
        topPanel.setBorder(BorderFactory.createEmptyBorder(15,50,0,50));
        topPanel.add(topWrapper, BorderLayout.CENTER);
        topPanel.add(pauseButton, BorderLayout.WEST);
        topPanel.add(icon, BorderLayout.EAST);

        //buttons
        btn1 = new JButton(icon1); btn2 = new JButton(icon2); btn3 = new JButton(icon3); btn4 = new JButton(icon4); btn5 = new JButton(icon5);
        btn6 = new JButton(icon6); btn7 = new JButton(icon7); btn8 = new JButton(icon8); btn9 = new JButton(icon9); picture = new JButton(pic);
    
        leftPanel = new JPanel();
        leftPanel.setLayout(new GridLayout(3, 3, -2, -2));
        leftPanel.setPreferredSize(new Dimension(200, 200));
        leftPanel.setBorder(BorderFactory.createEmptyBorder(35,50,45,50));

        leftPanel.add(btn1); leftPanel.add(btn2); leftPanel.add(btn3);
        leftPanel.add(btn4); leftPanel.add(btn5); leftPanel.add(btn6);
        leftPanel.add(btn7); leftPanel.add(btn8); leftPanel.add(btn9);

        //picture
        picture.setPreferredSize(new Dimension(pic.getIconWidth(), pic.getIconHeight()));

        rightPanel = new JPanel();
        rightPanel.setLayout(new BorderLayout());
        rightPanel.setBorder(BorderFactory.createEmptyBorder(35,50,45,50));
        rightPanel.add(picture, BorderLayout.CENTER);

        //wrapping the text para hindi siya mag compress sa baba(idk ayaw niya mapunta sa taas pag wala wrapper and gridbaglayout)
        // var leftWrapper = new JPanel(new GridBagLayout());
        JPanel rightWrapper = new JPanel(new GridBagLayout());

        moveLabel = new JLabel("Moves: 0");
        timerLabel = new JLabel("Time: 00:00");
        timer = new Timer(1000, e -> updateTimer()); 

        statusLabel = new JLabel("Time: 00:00   Moves: 0 ");
        statusLabel.setFont(new Font("Comic Sans", Font.BOLD, 15));

        bottomPanel = new JPanel();
        bottomPanel.setLayout(new BorderLayout());
        rightWrapper.add(lbl2);
        bottomPanel.add(statusLabel, BorderLayout.WEST); bottomPanel.add(rightWrapper, BorderLayout.EAST);
        bottomPanel.setBorder(BorderFactory.createEmptyBorder(0,50,30,50));

        centerPanel = new JPanel();
        centerPanel.setLayout(new GridLayout(1, 2));
        centerPanel.add(leftPanel); centerPanel.add(rightPanel); centerPanel.add(bottomPanel);
        
        mainPanel.add(topPanel, BorderLayout.NORTH); mainPanel.add(centerPanel, BorderLayout.CENTER); mainPanel.add(bottomPanel, BorderLayout.SOUTH);
        
        frm.add(mainPanel);
        frm.setTitle("PicPuzzle");
        frm.setResizable(false);
        frm.setLocation(250, 75);
        frm.pack();
        frm.setVisible(true);

        frm.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        frm.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                int result = JOptionPane.showConfirmDialog(frm, "Are you sure you want to go back? You will lose all your progress.", 
                "Confirm Exit", JOptionPane.YES_NO_OPTION);
                if (result == JOptionPane.YES_OPTION) {
                    timer.stop(); 
                    frm.dispose();
                    GameMenu gameMenu = new GameMenu();
                    gameMenu.setVisible(true);
                }
            }
        });

        btn1.addActionListener(this); btn2.addActionListener(this); btn3.addActionListener(this); btn4.addActionListener(this);
        btn5.addActionListener(this); btn6.addActionListener(this); btn7.addActionListener(this); btn8.addActionListener(this);
        btn9.addActionListener(this); icon.addActionListener(this); picture.addActionListener(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {

        if (!timer.isRunning()) startTheTimer(); 

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
            moveCount();
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
            moveCount();
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
            moveCount();
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
            moveCount();
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
            moveCount();
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
            moveCount();
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
            moveCount();
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
            moveCount();
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
            moveCount();
        }

        // changes the set of puzzle pieces to the next set of pieces.
        if(e.getSource()==picture){
            Icon s1 = picture.getIcon();   
            if(s1==pic && checkPuzzleSolved()){
                currentLevel++;
                picture.setIcon(pic2); icon.setIcon(icon15); star = icon.getIcon();
                btn1.setIcon(icon10); btn2.setIcon(icon11); btn3.setIcon(icon12);
                btn4.setIcon(icon13); btn5.setIcon(icon14); btn6.setIcon(icon15);
                btn7.setIcon(icon16); btn8.setIcon(icon17); btn9.setIcon(icon18);   
            } else if(s1==pic2 && checkPuzzleSolved()){
                currentLevel++;
                picture.setIcon(pic3); icon.setIcon(icon20); star = icon.getIcon(); 
                btn1.setIcon(icon19); btn2.setIcon(icon20); btn3.setIcon(icon21);
                btn4.setIcon(icon22); btn5.setIcon(icon23); btn6.setIcon(icon24);
                btn7.setIcon(icon25); btn8.setIcon(icon26); btn9.setIcon(icon27); 
            } else if(s1==pic3 && checkPuzzleSolved()){
                currentLevel++;
                picture.setIcon(pic4); icon.setIcon(icon32); star = icon.getIcon();
                btn1.setIcon(icon28); btn2.setIcon(icon29); btn3.setIcon(icon30);
                btn4.setIcon(icon31); btn5.setIcon(icon32); btn6.setIcon(icon33);
                btn7.setIcon(icon34); btn8.setIcon(icon35); btn9.setIcon(icon36); 
            } else if(s1==pic4 && checkPuzzleSolved()){
                currentLevel++;
                picture.setIcon(pic5); icon.setIcon(icon44); star = icon.getIcon();
                btn1.setIcon(icon37); btn2.setIcon(icon38); btn3.setIcon(icon39);
                btn4.setIcon(icon40); btn5.setIcon(icon41); btn6.setIcon(icon42);
                btn7.setIcon(icon43); btn8.setIcon(icon44); btn9.setIcon(icon45);
            } else if(s1==pic5){
                stopTimer();
                int minutes = secondsElapsed / 60;
                int seconds = secondsElapsed % 60;
                JOptionPane.showMessageDialog(frm, "You solved all the puzzles!\nFinal Time: " + String.format("%02d:%02d", minutes, seconds) + "\nFinal Moves: " + moveCount, 
                "Congratulations!", JOptionPane.INFORMATION_MESSAGE);
                frm.dispose();
                GameMenu gameMenu = new GameMenu();
                gameMenu.setVisible(true);
            }
        }

        if(e.getSource()== icon){
            if(picture.getIcon()==pic){
                Icon s2 = icon.getIcon();
                if(s2==icon9){
                    icon.setIcon(icon1); 
                    star = icon1;
                } else if(s2==icon1){
                    icon.setIcon(icon2); 
                    star = icon2;
                } else if(s2==icon2){
                    icon.setIcon(icon3);
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
    //when this method is called, it returns a boolean (true or false)
    private boolean checkPuzzleSolved() {
        Icon[] currentIcons = {
            btn1.getIcon(), btn2.getIcon(), btn3.getIcon(),
            btn4.getIcon(), btn5.getIcon(), btn6.getIcon(),
            btn7.getIcon(), btn8.getIcon(), btn9.getIcon()
        }; // fetching the current icons of the buttons, the order of puzzles that the player had done.
    
        Icon[] correctIcon = null; //place holder
        Icon currentPic = picture.getIcon(); // fetching the icon of the picture btn again to see which set of puzzle the player is currently on.
        if(currentPic == pic) correctIcon = correctIconsPic1; // if the currentPic is pic(the 1st set), u put the correct order of the 1st set on 'correctIcon'.
        else if(currentPic == pic2) correctIcon = correctIconsPic2; // if the currentPic is pic2(the 2nd set), u put the correct order of the 2nd set on 'correctIcon'.
        else if(currentPic == pic3) correctIcon = correctIconsPic3; // if the currentPic is pic3(the 3rd set), u put the correct order of the 3rd set on 'correctIcon'.
        else if(currentPic == pic4) correctIcon = correctIconsPic4; // same thing
        else if(currentPic == pic5) correctIcon = correctIconsPic5;
    
        boolean isSolved = true;
        for (int i = 0; i < currentIcons.length; i++) {
            if (currentIcons[i] != correctIcon[i]) {
                isSolved = false;
                break;
            }
        }
    
        if (isSolved) {
            JOptionPane.showMessageDialog(frm, "You solved the puzzle! Next!", "Congratulations!", JOptionPane.INFORMATION_MESSAGE);
            gameDifficulty.enableLevel(currentLevel);  // Reuse the existing Levels instance
            gameDifficulty.setVisible(true);
            return true;
        }  else {
            JOptionPane.showMessageDialog(frm, "Not yet. Keep trying!", "Puzzle Incomplete", JOptionPane.WARNING_MESSAGE);
            return false;
        }
    }

    private void moveCount() {
        moveCount++;
        int minutes = secondsElapsed / 60;
        int seconds = secondsElapsed % 60;
        statusLabel.setText(String.format("Time: %02d:%02d   Moves: %d", minutes, seconds, moveCount));
    }    

    public final void startTheTimer() {
        secondsElapsed = 0;
        timerLabel.setText("Time: 0s");
    
        if (timer != null) timer.stop();
        
        timer = new Timer(1000, e -> updateTimer());  // Initialize timer
        timer.start();
    }

    private void updateTimer() {
        secondsElapsed++;
        int minutes = secondsElapsed / 60;
        int seconds = secondsElapsed % 60;
        statusLabel.setText(String.format("Time: %02d:%02d   Moves: %d", minutes, seconds, moveCount));

        if (secondsElapsed >= 300) {  
            stopTimer();
            JOptionPane.showMessageDialog(frm, "Time's up! You ran out of time!", "Game Over", JOptionPane.WARNING_MESSAGE);
            frm.dispose();
            GameMenu gameMenu = new GameMenu();
            gameMenu.setVisible(true);
        }
    }

    private void enableButtons(boolean enable) {
        btn1.setEnabled(enable); btn2.setEnabled(enable); btn3.setEnabled(enable);
        btn4.setEnabled(enable); btn5.setEnabled(enable); btn6.setEnabled(enable);
        btn7.setEnabled(enable); btn8.setEnabled(enable); btn9.setEnabled(enable);
        icon.setEnabled(enable); picture.setEnabled(enable); pauseButton.setEnabled(enable);
    }
        
    public void setPauseMenu(PauseMenu pauseMenu) {
        this.pauseMenu = pauseMenu;
    }

    private void showPauseMenu() {
        if (timer.isRunning()) stopTimer();
        enableButtons(false);

        pauseMenu = new PauseMenu(frm, this);
        pauseMenu.setVisible(false);
        pauseMenu.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosed(WindowEvent e) {
                resumeGame();
            }
        });
    }

    public void resumeGame() {
        if (pauseMenu != null) pauseMenu.dispose();
        if (!timer.isRunning()) timer.start();
        enableButtons(true);
    }
    
    public void restartGame() {
        secondsElapsed = 0;
        moveCount = 0;
        statusLabel.setText("Time: 00:00   Moves: 0");
        btn1.setIcon(icon1); btn2.setIcon(icon2); btn3.setIcon(icon3);
        btn4.setIcon(icon4); btn5.setIcon(icon5); btn6.setIcon(icon6);
        btn7.setIcon(icon7); btn8.setIcon(icon8); btn9.setIcon(icon9);
        icon.setIcon(icon8); picture.setIcon(pic); star = icon.getIcon();   

        timer.start();
        enableButtons(true);
    }

    public void stopTimer() {
        timer.stop(); //had to make a method because i need to access this in another class
    }
}

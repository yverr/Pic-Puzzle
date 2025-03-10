package com.example;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;


import javax.sound.sampled.*;
import javax.swing.*;

public class Settings extends JDialog implements ActionListener {
    private final JButton close;
    private final JButton volume;
    private final JButton theme;
    private final JPanel panel;
    private final JPanel closePanel;
    private final JPanel topPanel;
    private final JPanel mainPanel;
    private final JLabel title;
    private final JLabel volumeLabel;
    private final JLabel themeLabel;
    private final GameMenu g;

    private Clip currentClip;
    boolean musicPlaying = false;
    

    Settings(JFrame parent, GameMenu gameMenu) {
        super(parent, "Settings", true);
        this.g = gameMenu;

        setUndecorated(true);
        setSize(290, 320);

        title = new JLabel("Settings");
        title.setFont(new Font("Comic Sans", Font.BOLD, 20));

        topPanel = new JPanel();
        topPanel.setLayout(new BoxLayout(topPanel, BoxLayout.Y_AXIS));
        topPanel.setBorder(BorderFactory.createEmptyBorder(10, 0, 0, 0));

        title.setAlignmentX(JPanel.CENTER_ALIGNMENT);
        topPanel.add(title, BorderLayout.CENTER);

        volumeLabel = new JLabel("Volume: ");
        volumeLabel.setBounds(50, 50, 150, 50);

        volume = new JButton("OFF");
        volume.setBounds(160, 60, 100, 30);
        volume.setFocusable(false);
        volume.addActionListener(this);

        themeLabel = new JLabel("Theme: ");
        themeLabel.setBounds(50, 110, 150, 30);

        theme = new JButton("Dark");
        theme.setBounds(160, 110, 100, 30);
        theme.setPreferredSize(new Dimension(100, 30));
        theme.setFocusable(false);
        theme.addActionListener(this);

        panel = new JPanel();
        panel.setLayout(null);
        panel.add(volumeLabel);
        panel.add(volume);
        panel.add(themeLabel);
        panel.add(theme);

        close = new JButton("Close");
        close.setPreferredSize(new Dimension(80, 30));
        close.setFocusPainted(false);
        close.addActionListener(e -> this.dispose());

        closePanel = new JPanel();
        closePanel.add(close);
        closePanel.setBorder(BorderFactory.createEmptyBorder(0, 0, 5, 0));

        mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout());
        mainPanel.add(topPanel, BorderLayout.NORTH);
        mainPanel.add(panel, BorderLayout.CENTER);
        mainPanel.add(closePanel, BorderLayout.SOUTH);
        mainPanel.setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, Color.lightGray));
        add(mainPanel);

        setLocationRelativeTo(parent);
    }

    public void display() {
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == volume) {
            if (volume.getText().equals("OFF")) {
                volume.setText("ON");
                stopMusic();
            } else if (volume.getText().equals("ON")) {
                volume.setText("OFF");
                startMusic();
            }
        }
    }

    public void play(){
        try {
            currentClip = AudioSystem.getClip();
            currentClip.open(AudioSystem.getAudioInputStream(new File("demo\\src\\resources\\tracks\\game-music-teste.wav")));
            currentClip.loop(Clip.LOOP_CONTINUOUSLY);
        }   catch (LineUnavailableException|IOException|UnsupportedAudioFileException e){
            e.printStackTrace();}
    }
    void startMusic() {
        currentClip.start();
    }

    void stopMusic() {
        currentClip.stop();
    }

    


   
}

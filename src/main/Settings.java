import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Settings extends JDialog implements ActionListener{

    private JButton close, volume, theme;
    private JPanel panel, closePanel, topPanel, mainPanel;
    private JLabel title, volumeLabel, themeLabel;
    private GameMenu g;

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
        volumeLabel.setBounds(50, 50, 150, 30);

        volume = new JButton("OFF");
        volume.setBounds(150, 50, 100, 30);
        volume.setFocusable(false);
        volume.addActionListener(this);

        themeLabel = new JLabel("Theme: ");
        themeLabel.setBounds(50, 100, 150, 30);

        theme = new JButton("Dark");
        theme.setBounds(150, 100, 100, 30);
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

    public void darkTheme() {
        // Set dark theme
        getContentPane().setBackground(Color.decode("#2f2f2f"));
        topPanel.setBackground(Color.decode("#2f2f2f"));
        panel.setBackground(Color.decode("#2f2f2f"));
        closePanel.setBackground(Color.decode("#2f2f2f"));

        title.setForeground(Color.decode("#ffffff"));
        volumeLabel.setForeground(Color.decode("#ffffff"));
        themeLabel.setForeground(Color.decode("#ffffff"));

        volume.setBackground(Color.decode("#4f4f4f"));
        volume.setForeground(Color.decode("#ffffff"));
        theme.setBackground(Color.decode("#4f4f4f"));
        theme.setForeground(Color.decode("#ffffff"));
        close.setBackground(Color.decode("#4f4f4f"));
        close.setForeground(Color.decode("#ffffff"));
    }

    public void lightTheme() {
        // Set light theme
        getContentPane().setBackground(Color.decode("#f7f7f7"));
        topPanel.setBackground(Color.decode("#f7f7f7"));
        panel.setBackground(Color.decode("#f7f7f7"));
        closePanel.setBackground(Color.decode("#f7f7f7"));

        title.setForeground(Color.decode("#000000"));
        volumeLabel.setForeground(Color.decode("#000000"));
        themeLabel.setForeground(Color.decode("#000000"));

        volume.setBackground(Color.decode("#e5e5e5"));
        volume.setForeground(Color.decode("#000000"));
        theme.setBackground(Color.decode("#e5e5e5"));
        theme.setForeground(Color.decode("#000000"));
        close.setBackground(Color.decode("#e5e5e5"));
        close.setForeground(Color.decode("#000000"));
    }


    // ISSUE: the size of the buttons change when the color changes. Needs fix.
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==theme){
            if(theme.getText().equals("Dark")){
                g.theme();
                darkTheme();
                theme.setText("Light");
            } else if(theme.getText().equals("Light")) {
                g.lightTheme();
                lightTheme();
                theme.setText("Dark");

            }
        }
    }
}
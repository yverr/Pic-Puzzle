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


    //deleting theme feature, volume has no function yet.
    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
  
}
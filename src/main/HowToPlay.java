import java.awt.*;
import javax.swing.*;
import javax.swing.border.Border;


public class HowToPlay extends JDialog{

    //hell

    JLabel label, title;
    JPanel panel, topPanel, closePanel, mainPanel;
    JButton close;

    HowToPlay(JFrame parent) {
        super(parent, "How to Play", true);

        setUndecorated(true); //on everyones soul this dialog box looked like ass without this sht
        setLayout(new BorderLayout());
        setSize(390, 420);

        title = new JLabel("How To Play");
        title.setFont(new Font("Comic Sans", Font.BOLD, 20));

        topPanel = new JPanel();
        topPanel.setLayout(new BoxLayout(topPanel, BoxLayout.Y_AXIS));
        topPanel.setBorder(BorderFactory.createEmptyBorder(10, 0, 0, 0));

        title.setAlignmentX(JPanel.CENTER_ALIGNMENT);
        topPanel.add(title, BorderLayout.CENTER);

        String instructions = """
                              <b>Instructions:</b>
                                1. Click the Play Game button and proceed to 
                                level 1 to start the game.
                                2. Click the top right icon button to switch between
                                puzzle piece
                                3. Using the reference picture on the right, solve 
                                the puzzle
                                4. Solve the puzzle with less moves as much as 
                                possible.
                                5. Goodluck and have fun!
                              
                              <b>Navigation:</b>
                                - Click the '<b>!</b>' button in the Game menu's top right
                               corner to view game information.
                                - Click the '<b>Play Game</b>' button to choose levels:
                               <i>[Level 1], [Level 2], [Level 3], [Level 4], [Level 5]</i>. 
                               Only Level 1 can be unlocked first, so you must 
                               complete it to unlock the other levels!
                                - Click the '<b>Settings</b>' to change [-]""";

        label = new JLabel("<html>" + instructions.replaceAll("\n", "<br>") + "</html>");
        label.setFont(new Font("Arial", Font.PLAIN, 16));
        label.setHorizontalAlignment(SwingConstants.LEFT);

        // this.add(label, BorderLayout.CENTER);

        panel = new JPanel(new BorderLayout());
        panel.add(label, BorderLayout.NORTH);

         
        Border border = BorderFactory.createLineBorder(Color.gray, 2);
        panel.setBorder(border); 

        JScrollPane scrollPane  = new JScrollPane(panel);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);

        close = new JButton("Close");
        close.setPreferredSize(new Dimension(80, 30));
        close.setFocusPainted(false);
        close.addActionListener(e -> this.dispose());

        closePanel = new JPanel();
        closePanel.add(close);

        panel.setBorder(BorderFactory.createEmptyBorder(10, 5, 15, 5));
        closePanel.setBorder(BorderFactory.createEmptyBorder(0, 0, 5, 0));

        mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout());
        mainPanel.setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, Color.lightGray));

        mainPanel.add(topPanel, BorderLayout.NORTH);
        mainPanel.add(scrollPane, BorderLayout.CENTER);
        mainPanel.add(closePanel, BorderLayout.SOUTH);
        add(mainPanel);
        setLocationRelativeTo(parent);
    }

    public void display(){
        this.setVisible(true);
    }

}
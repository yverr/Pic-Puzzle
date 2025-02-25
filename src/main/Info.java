import java.awt.*;
import javax.swing.*;
import javax.swing.border.Border;


public class Info extends JDialog{

    JLabel label, title;
    JPanel panel, topPanel, closePanel, mainPanel;
    JButton close;

    Info(JFrame parent) {
        super(parent, "info", true);

        setUndecorated(true); 
        setLayout(new BorderLayout());
        setSize(390, 420);

        title = new JLabel("Info");
        title.setFont(new Font("Comic Sans", Font.BOLD, 20));

        topPanel = new JPanel();
        topPanel.setLayout(new BoxLayout(topPanel, BoxLayout.Y_AXIS));
        topPanel.setBorder(BorderFactory.createEmptyBorder(10, 0, 0, 0));

        title.setAlignmentX(JPanel.CENTER_ALIGNMENT);
        topPanel.add(title, BorderLayout.CENTER);

        String instructions = """
                              <b>About:</b>
                               This pic-puzzle game was a project created and 
                               collaborated on by Group 10 of ICT 11-A of IETI 
                               College of Science and Technology Inc. in the 
                               year 2025 and was supervised by Mrs. Reynalyn
                               Santos.
                               
                               <b>Our team:</b>
                                - Juan Carlos S. Basco
                                - Juliana Mae G. Bordago
                                - Vimel T. Malquistro
                                - Geoff Lloyd B. Pelejo
                                - Karylle M. Verdadero (Leader)

                                <b>Contact us:</b>
                                picpuzzlecontact@gmail.com

                                Our project is <b>Open Source</b>! You can find the 
                                source code and contribute on our GitHub page 
                                here:
                                https://github.com/yverr/Pic-Puzzle

                                Thank you for playing!

                               """; //hindi pa open source LOL 

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

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainMenu extends JFrame {

    public MainMenu() {
        // Set up the frame
        setTitle("Main Menu");
        setSize(400, 300); // Increased size for better visibility
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Center the frame on the screen

        // Create a panel to hold buttons
        JPanel panel = new JPanel();
        
        // Use BorderLayout for proper button placement
        panel.setLayout(new BorderLayout());

        // Create buttons
        JButton launchButton = new JButton("Launch Internet Adventure");
        JButton quitButton = new JButton("Quit");

        // Add action listener to launch button
        launchButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Launch InternetAdventure in xterm and exit MainMenu
                try {
                    String command = "xterm -e java internetadventure";
                    ProcessBuilder pb = new ProcessBuilder("sh", "-c", command);
                    pb.inheritIO(); // Inherit IO to allow xterm to display output
                    pb.start();
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
                System.exit(0); // Exit MainMenu immediately
            }
        });

        // Add action listener to quit button
        quitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0); // Exit MainMenu immediately
            }
        });

        // Add buttons to the panel
        panel.add(launchButton, BorderLayout.CENTER);
        panel.add(quitButton, BorderLayout.SOUTH);

        // Add panel to frame
        add(panel);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            MainMenu menu = new MainMenu();
            menu.setVisible(true);
        });
    }
}

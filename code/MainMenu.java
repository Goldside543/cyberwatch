import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainMenu extends JFrame {

    public MainMenu() {
        // Set up the frame
        setTitle("Internet Adventure");
        setSize(400, 300); // Adjust size as needed
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Center the frame on the screen

        // Create a panel for the title and buttons
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());

        // Create and style the title label
        JLabel titleLabel = new JLabel("Internet Adventure", SwingConstants.CENTER);
        titleLabel.setFont(new Font("Arial", Font.BOLD, 18)); // Font size and style
        titleLabel.setPreferredSize(new Dimension(400, 50)); // Adjust title panel size
        panel.add(titleLabel, BorderLayout.NORTH);

        // Create a panel for buttons
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new FlowLayout()); // Center the buttons

        // Create and style buttons
        JButton launchButton = new JButton("Play");
        JButton quitButton = new JButton("Quit");

        // Style the buttons
        launchButton.setPreferredSize(new Dimension(200, 40)); // Set size for consistency
        quitButton.setPreferredSize(new Dimension(200, 40));
        launchButton.setBackground(Color.GREEN); // Background color
        quitButton.setBackground(Color.RED);
        launchButton.setForeground(Color.WHITE); // Text color
        quitButton.setForeground(Color.WHITE);
        launchButton.setFont(new Font("Arial", Font.PLAIN, 14)); // Font size and style
        quitButton.setFont(new Font("Arial", Font.PLAIN, 14));
        launchButton.setFocusPainted(false); // Remove focus border
        quitButton.setFocusPainted(false);

        // Add action listeners to buttons
        launchButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Launch internetadventure class from the same JAR and exit MainMenu
                try {
                    String command = "xterm -hold -T 'Internet Adventure' -e java -cp internetadventure.jar internetadventure";
                    ProcessBuilder pb = new ProcessBuilder("sh", "-c", command);
                    pb.inheritIO(); // Inherit IO to allow xterm to display output
                    pb.start();
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
                System.exit(0); // Exit MainMenu immediately
            }
        });

        quitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0); // Exit MainMenu immediately
            }
        });

        // Add buttons to the button panel
        buttonPanel.add(launchButton);
        buttonPanel.add(quitButton);

        // Add button panel to the main panel
        panel.add(buttonPanel, BorderLayout.CENTER);

        // Add main panel to the frame
        add(panel);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            MainMenu menu = new MainMenu();
            menu.setVisible(true);
        });
    }
}

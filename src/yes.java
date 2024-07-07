import java.awt.Color;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class yes {
    JFrame frame;
    JPanel panel;
    
    yes() {
        frame = new JFrame();
        frame.setLocation(100, 100);
        frame.setSize(1000, 600);
        frame.setBackground(Color.PINK);
        
        panel = new JPanel();
        panel.setBounds(100, 100, 800, 400); // Adjust panel size and location as needed
        panel.setBackground(Color.PINK);
        panel.setLayout(null); // Use null layout for absolute positioning
        frame.add(panel); // Add panel to the frame
        
        JLabel gifLabel = gifLoad("main2.gif");
        gifLabel.setBounds(200, 10, 400, 300); // Manually set bounds for the GIF within the panel
        
        panel.add(gifLabel); // Add the GIF label to the panel
        
        JLabel textLabel = new JLabel("I AM COMING!!!!!!!!");
        textLabel.setFont(new Font("Arial", Font.BOLD, 30));
        textLabel.setForeground(Color.RED);
        textLabel.setBounds(300, 350, 200, 100); // Adjust the position and size of the text label
        panel.add(textLabel); // Add the text label to the panel
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    public JLabel gifLoad(String gif) {
        ImageIcon gifIcon = new ImageIcon(getClass().getResource(gif));
        JLabel gifLabel = new JLabel(gifIcon);
        return gifLabel;
    }

    public static void main(String[] args) {
        new yes();
    }
}

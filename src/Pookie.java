import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Pookie {
    JPanel panel3;

    Pookie() {
        JFrame frame = new JFrame();
        frame.setLocation(100, 70);
        frame.setSize(1200, 600);

        // Setting the background color of the content pane
        JPanel contentPane = new JPanel();
        contentPane.setBackground(Color.PINK);
        contentPane.setLayout(null); // Set layout to null
        frame.setContentPane(contentPane);

        // Load and add the GIF
        JLabel pookieLabel = gifLoad("pookie love.gif");
        pookieLabel.setBounds(450, 0, 400, 300); // Manually set bounds for the GIF
        contentPane.add(pookieLabel);

        // Add the question below the GIF
        JLabel questionLabel = new JLabel("WILL YOU BE MY Pookie?");
        questionLabel.setBounds(500, 300, 400, 50); // Manually set bounds for the question
        Font font = new Font("SansSerif", Font.BOLD, 30);
        questionLabel.setFont(font);
        contentPane.add(questionLabel);

        // Add the green panel with restricted size and specific location
        JPanel panel2 = new JPanel();
        panel2.setBackground(Color.GREEN);
        panel2.setBounds(100, 350, 300, 100); // Manually set bounds for the green panel
        panel2.setLayout(new GridLayout(1, 0, 10, 10)); // Use GridLayout for buttons
        contentPane.add(panel2);

        // Add buttons to panel2
        JButton button1 = new JButton("YES");
        button1.setBackground(Color.GREEN);
        button1.setOpaque(true);
        button1.setBorderPainted(false);
        button1.setFont(new Font("Arial", Font.BOLD, 40)); // Increase the font size
        button1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new yes();
            }
        });

        JButton button2 = new JButton("no");
        button2.setBackground(Color.RED);
        button2.setOpaque(true);
        button2.setBorderPainted(false);
        button2.setFont(new Font("Arial", Font.BOLD, 40));
        button2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (button2.getText().equals("no")) {
                    panel3.setSize(300, 100);
                    button2.setSize(600, 200);
                    button2.setLocation(600, 300);
                    button2.setText("Think again");
                    button2.setFont(new Font("Arial", Font.BOLD, 20));
                    button1.setSize(200, 250);
                    panel2.setSize(290, 200);
                } else if (button2.getText().equals("Think again")) {
                    panel3.setSize(300, 300);
                    button2.setSize(150, 50);
                    button2.setText("ARE YOU SURE?");
                    button2.setFont(new Font("Arial", Font.BOLD, 30));
                    button1.setSize(250, 500);
                    panel2.setSize(200, 200);
                    
                } else if (button2.getText().equals("ARE YOU SURE?")) {
                    panel3.setSize(300, 300);
                    button2.setSize(300, 250);
                    button2.setText("Choose yes!");
                    button2.setFont(new Font("Arial", Font.PLAIN, 40));
                    
                    button1.setSize(300, 500);
                    panel2.setSize(250, 250);
                } else if (button2.getText().equals("Choose yes!")) {
                    panel3.setSize(500, 150);
                    button2.setSize(300, 250);
                    button2.setText("be my pookie!!");
                    button2.setFont(new Font("Arial", Font.PLAIN, 30));
                    
                    button1.setSize(350, 500);
                    panel2.setSize(300, 300);
                } else if (button2.getText().equals("be my pookie!!")) {
                    panel3.setSize(300, 100);
                    button2.setSize(300, 250);
                    button2.setText("NO");
                    button2.setFont(new Font("Arial", Font.PLAIN, 20));
                    button1.setSize(450, 500);
                    panel2.setSize(350, 400);
                } else if (button2.getText().equals("NO")) {
                    panel3.setSize(300, 100);
                    button2.setSize(300, 250);
                    button2.setText("SAY YES OR DIE!");
                    button2.setFont(new Font("Arial", Font.PLAIN, 30));
                    button1.setSize(500, 500);
                    panel2.setSize(400, 450);
                } else if (button2.getText().equals("SAY YES OR DIE!")) {
                    new die();
                }
                
                panel3.revalidate();
                panel3.repaint();
                button2.revalidate();
                button2.repaint();
            }
        });

        panel2.add(button1);

        // Add the red panel with restricted size and specific location
        panel3 = new JPanel();
        panel3.setBackground(Color.RED);
        panel3.setBounds(800, 350, 200, 100); // Manually set bounds for the red panel
        panel3.setLayout(new GridLayout(1, 2, 10, 10));
        contentPane.add(panel3);
        panel3.add(button2); // Add button2 to panel3

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    public JLabel gifLoad(String gif) {
        ImageIcon gifIcon = new ImageIcon(getClass().getResource(gif));
        JLabel gifLabel = new JLabel(gifIcon);
        return gifLabel;
    }

    public static void main(String[] args) {
        new Pookie();
    }
}

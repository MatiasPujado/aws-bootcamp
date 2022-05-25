package gettingAQuery;

import javax.swing.*;
import java.awt.*;

public class NewWindow {

    JFrame frame = new JFrame();
    JLabel label = new JLabel("Hi there!  \\o/");

    /**
     * No-argument constructor
     */
    public NewWindow() {

        // Asigning a specific place and size for the label
        label.setBounds(45, 35, 160, 30);
        label.setFont(new Font(null, Font.PLAIN, 25));

        // Adding the label to the frame & lastly we define the frame
        frame.add(label);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(700, 500, 240, 140);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}

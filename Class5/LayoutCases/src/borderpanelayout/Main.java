package borderpanelayout;


import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {

        // Creating a frame object
        JFrame frame = new JFrame("Border Layout");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(400, 500, 400, 300);

        // Creating and adding buttons to the frame, one per section
        frame.add(new JButton("NORTH"), BorderLayout.NORTH);
        frame.add(new JButton("SOUTH"), BorderLayout.SOUTH);
        frame.add(new JButton("EAST"), BorderLayout.EAST);
        frame.add(new JButton("WEST"), BorderLayout.WEST);
        frame.add(new JButton("CENTER"), BorderLayout.CENTER);

        frame.setVisible(true);
    }
}

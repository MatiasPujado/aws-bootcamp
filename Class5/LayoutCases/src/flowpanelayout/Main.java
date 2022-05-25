package flowpanelayout;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        // Creating a frame object
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(500, 500, 400, 400);
        frame.setLayout(new FlowLayout());

        // Creating buttons and adding them to the frame
        frame.add(new JButton("1"));
        frame.add(new JButton("2"));
        frame.add(new JButton("3"));
        frame.add(new JButton("4"));
        frame.add(new JButton("5"));
        frame.add(new JButton("6"));
        frame.add(new JButton("7"));
        frame.add(new JButton("8"));
        frame.add(new JButton("9"));
        frame.add(new JButton("10"));

        frame.setVisible(true);
    }
}

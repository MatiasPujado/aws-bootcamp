package boxpanelayout;


import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {

        // Creating a frame object
        JFrame frame = new JFrame("Box Layout");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(500, 400, 400, 300);
        frame.setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.LINE_AXIS));
//        frame.setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.PAGE_AXIS));
//        frame.setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.X_AXIS));
//        frame.setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.Y_AXIS));

        // Creating buttons and adding them to the frame
        frame.add(new Button("1"));
        frame.add(new Button("2"));
        frame.add(new Button("3"));
        frame.add(new Button("4"));
        frame.add(new Button("5"));

        frame.setVisible(true);
    }
}

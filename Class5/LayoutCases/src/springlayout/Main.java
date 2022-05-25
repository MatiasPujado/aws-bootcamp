package springlayout;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {


        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                // Creating a Frame, a Label, a Text Field and a Spring Layout object
                JFrame frame = new JFrame("SpringDemo3");
                JLabel label = new JLabel("Label: ");
                JTextField textField = new JTextField("Text field", 15);
                SpringLayout springLayout = new SpringLayout();
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setBounds(500, 500, 300, 200);

                // Adding the Spring Layout, Label and Text Field to the frame
                frame.setLayout(springLayout);
                frame.add(label);
                frame.add(textField);

                // Setting constraints for each element
                springLayout.putConstraint(SpringLayout.WEST, label, 5, SpringLayout.WEST, frame.getContentPane());
                springLayout.putConstraint(SpringLayout.NORTH, label, 5, SpringLayout.NORTH, frame.getContentPane());
                springLayout.putConstraint(SpringLayout.WEST, textField, 5, SpringLayout.EAST, label);
                springLayout.putConstraint(SpringLayout.NORTH, textField, 5, SpringLayout.NORTH, frame.getContentPane());
                springLayout.putConstraint(SpringLayout.EAST, frame.getContentPane(), 5, SpringLayout.EAST, textField);
                springLayout.putConstraint(SpringLayout.SOUTH, frame.getContentPane(), 5, SpringLayout.SOUTH, textField);

                frame.pack();
                frame.setVisible(true);
            }
        });


    }


}

package grouplayout;

import javax.swing.*;


public class Main {
    public static void main(String[] args) {

        try {
            // Creating a frame and a groupLayout object
            JFrame frame = new JFrame();
            GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setBounds(500, 300, 500, 500);
            frame.setLayout(groupLayout);
            groupLayout.setAutoCreateGaps(true);
            groupLayout.setAutoCreateContainerGaps(true);

            // Creating button objects
            JButton b1 = new JButton("ONE");
            JButton b2 = new JButton("TWO");
            JButton b3 = new JButton("THREE");
            JButton b4 = new JButton("FOUR");

            // Adding buttons to a Horizontal Group
            groupLayout.setHorizontalGroup(
                    groupLayout.createSequentialGroup().addComponent(b1).addComponent(b2)
                            .addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.CENTER).addComponent(b3).addComponent(b4)));

            // Adding buttons to a Vertical Group
            groupLayout.setVerticalGroup(
                    groupLayout.createSequentialGroup().addComponent(b4).addComponent(b3)
                            .addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.TRAILING).addComponent(b1).addComponent(b2)));

            frame.pack();
            frame.setVisible(true);
        } catch (IllegalStateException ise) {
            ise.printStackTrace();
        }

    }
}

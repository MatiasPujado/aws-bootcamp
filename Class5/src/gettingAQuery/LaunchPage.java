package gettingAQuery;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LaunchPage implements ActionListener {

    JFrame frame = new JFrame();
    JButton myButton = new JButton("New Window");

    /**
     * No-argument constructor
     */
    public LaunchPage() {

        // Defining button's dimensions and position
        myButton.setBounds(45, 35, 140, 30);
        myButton.setFocusable(false);
        myButton.addActionListener(this);

        // Adding the button to the frame & we also define the frame
        frame.add(myButton);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(700, 500, 240, 140);
        frame.setLayout(null);
        frame.setVisible(true);
    }

    // By overriding this method we can specify the button's behaviour when is being clicked
    @Override
    public void actionPerformed(ActionEvent actionEvent) {

        if (actionEvent.getSource() == myButton) {
            frame.dispose();
            NewWindow myWindow = new NewWindow();
        }

    }
}

package cardpanelayout;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CreateCard extends JFrame implements ActionListener {
    static JFrame frame;
    static CardLayout cardLayout;
    JButton bttn1, bttn2, bttn3;

    public CreateCard() {
        // Creating frame object
        frame = new JFrame("Card Layout");
        cardLayout = new CardLayout();
        frame.setLayout(cardLayout);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(450, 450, 400, 400);

        // Creating buttons and linking them to an action
        bttn1 = new JButton("Card 1");
        bttn2 = new JButton("Card 2");
        bttn3 = new JButton("Card 3");
        bttn1.addActionListener(this);
        bttn2.addActionListener(this);
        bttn3.addActionListener(this);

        // Adding buttons to the frame
        frame.add("Card 1", bttn1);
        frame.add("Card 2", bttn2);
        frame.add("Card 3", bttn3);

        frame.setVisible(true);
    }

    // Assigning a specific action to the clicked button
    @Override
    public void actionPerformed(ActionEvent e) {
        cardLayout.next(frame.getContentPane());
    }
}

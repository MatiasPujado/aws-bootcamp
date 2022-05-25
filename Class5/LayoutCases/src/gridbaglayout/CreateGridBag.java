package gridbaglayout;

import javax.swing.*;
import java.awt.*;

public class CreateGridBag {
    public CreateGridBag() throws HeadlessException {

        try {

            // Creating a GridConstraints and a Frame object
            GridBagConstraints gridBagConstraints = new GridBagConstraints();
            JFrame frame = new JFrame();
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setBounds(500, 500, 400, 300);
            frame.setLayout(new GridBagLayout());

            // Adding buttons to the frame while setting their constraints up
            gridBagConstraints.fill = GridBagConstraints.HORIZONTAL;
            gridBagConstraints.gridx = 0;
            gridBagConstraints.gridy = 0;
            frame.add(new Button("1"), gridBagConstraints);
            gridBagConstraints.gridx = 1;
            gridBagConstraints.gridy = 0;
            frame.add(new Button("Two"), gridBagConstraints);
            gridBagConstraints.fill = GridBagConstraints.HORIZONTAL;
            gridBagConstraints.ipady = 20;
            gridBagConstraints.gridx = 0;
            gridBagConstraints.gridy = 1;
            frame.add(new Button("Three"), gridBagConstraints);
            gridBagConstraints.gridx = 1;
            gridBagConstraints.gridy = 1;
            frame.add(new Button("4"), gridBagConstraints);
            gridBagConstraints.gridx = 0;
            gridBagConstraints.gridy = 2;
            gridBagConstraints.fill = GridBagConstraints.HORIZONTAL;
            gridBagConstraints.gridwidth = 2;
            frame.add(new Button("5"), gridBagConstraints);

            frame.setVisible(true);

        } catch (HeadlessException he) {
            he.printStackTrace();
        }

    }
}

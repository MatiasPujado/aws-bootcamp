package listeningToAButtn;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * 2 - Muestre un dialogo informativo o de consulta al recibir el evento del mouse.
 */

public class Main {
    public static void main(String[] args) {

        // Creating a frame object
        Frame window = new Frame();
        int width = 400;
        int height = 200;
        window.setTitle("Exercise 2");
        window.setSize(width, height);

        // Creating a Label object
        Label label = new Label("Modify the size of the window");
        label.setBounds(130, 50, 250, 100);
        window.add(label);

        // Creating Button1
        Button button1 = new Button("Increase");
        button1.addActionListener(actionEvent -> {

            if (actionEvent.getSource() == button1) {
                label.setText("Increasing width and height");
                window.setSize((width + 20), (height + 20));
            }

        });
        button1.setBounds(30, 150, 100, 30);
        window.add(button1);

        // Creating Button2
        Button button2 = new Button("Decrease");
        button2.addActionListener(actionEvent -> {
            if (actionEvent.getSource() == button2) {
                label.setText("Decreasing width and height");
                window.setSize((width - 10), (height - 10));
            }
        });
        button2.setBounds(150, 150, 100, 30);
        window.add(button2);

        // Creating Button3
        Button button3 = new Button("Reset");
        button3.addActionListener(actionEvent -> {
            if (actionEvent.getSource() == button3) {
                label.setText("Resetting to default size");
                JOptionPane.showConfirmDialog(null, "Window's size has been reset", "Exercise 2", JOptionPane.DEFAULT_OPTION);
                window.setSize(400, 200);

            }
        });
        button3.setBounds(270, 150, 100, 30);
        window.add(button3);

        window.setLayout(null);
        window.setLocationRelativeTo(null);
        window.setVisible(true);
        window.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                super.windowClosing(e);
                window.dispose();
            }
        });
    }
}

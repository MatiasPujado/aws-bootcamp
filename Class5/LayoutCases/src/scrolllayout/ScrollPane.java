package scrolllayout;

import javax.swing.*;

public class ScrollPane {

    public ScrollPane() {

        // Creating a Frame, TextArea and a Scroll Pane object
        JFrame frame = new JFrame("Scroll Pane");
        JTextArea textArea = new JTextArea(20, 50);
        JScrollPane scrollPane = new JScrollPane(textArea);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(400, 400, 300, 300);
        frame.getContentPane().add(scrollPane);
        scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        frame.setVisible(true);

    }
}

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class SimpleButtonDemo {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Button Demo");

        JButton button = new JButton("Click me!");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frame, "Button clicked!");
            }
        });

        JPanel panel = new JPanel();
        panel.add(button);

        frame.add(panel);
        frame.pack(); // Adjusts frame size to fit its contents
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}


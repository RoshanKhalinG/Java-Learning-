import java.awt.*;
import javax.swing.*;
public class Jframee {
    public static void main(String[] args) {
        JFrame frame = new JFrame("JFrame Example");
        JPanel Panel = new JPanel();
        JLabel label = new  JLabel("This is a label");
        JButton button = new JButton();
        button.setText("Click");
        Panel.add(label);
        Panel.add(button);
        frame.add(Panel);
        frame.setSize(500,600);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}



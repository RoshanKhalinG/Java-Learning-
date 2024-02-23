import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Assignment implements ActionListener {
    JFrame f1;
    javax.swing.JTextField t1, t2, t3;
    JLabel l1, l2, l3;
    JButton b1, b2;

    Assignment() {
        f1 = new JFrame("Calculator");
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f1.setSize(400, 400);
        f1.setLayout(new GridLayout(4, 2, 5,5));

        t1 = new javax.swing.JTextField(20);
        t2 = new javax.swing.JTextField(20);
        t3 = new javax.swing.JTextField(20);

        l1 = new JLabel("num1");
        l2 = new JLabel("num2");
        l3 = new JLabel("result");

        b1 = new JButton("add");
        b2 = new JButton("subtract");

        f1.add(l1);
        f1.add(t1);
        f1.add(l2);
        f1.add(t2);
        f1.add(l3);
        f1.add(t3);
        f1.add(b1);
        f1.add(b2);
        f1.setVisible(true);

    }

    public static void main(String[] args) {
        new Assignment();
    }

    public void actionPerformed(ActionEvent e){
        t1.setText("Hello world");
    }

}
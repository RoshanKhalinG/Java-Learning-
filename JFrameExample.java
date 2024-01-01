import java.awt.*;
import javax.swing.*;
public class JFrameExample {
    static JFrame f;
    static JButton b1,b2,b3;
    static JLabel l;
    public static void main(String[] args) {
        f=new JFrame("Panel");
        l=new JLabel("panel Label");
        b1=new JButton("button1");
        b2=new JButton("button2");
        b3=new JButton("button3");
        JPanel p = new JPanel();
        p.add(b1);
        p.add(b2);
        p.add(b3);
        p.add(l);
        p.setBackground(Color.red);
        f.add(p);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

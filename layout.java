import javax.swing.*;
import java.awt.*;
public class layout
{
    JFrame f1;
    JButton b1,b2,b3,b4,b5;
    layout()
    {
        f1 = new JFrame();
        f1.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        f1.setSize(400,480);
        f1.setLayout(new FlowLayout(0,15,15));
        b1 = new JButton("Button 1");
        b2 = new JButton("Button 2");
        b3 = new JButton("Button 3");
        b4 = new JButton("Button 4");
        b5 = new JButton("Button 5");
        
        f1.add(b1);
        f1.add(b2);
        f1.add(b3);
        f1.add(b4);
        f1.add(b5);

        f1.setVisible(true);
    }
    public static void main(String args[])
    {
        new layout();
    }
}
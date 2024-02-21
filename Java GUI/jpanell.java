import java.awt.*;
import javax.swing.*;
class PanelDemo extends JFrame
{
 static JFrame f;
 static JButton b1,b2,b3;
 static JLabel l;
 public static void main(String args[])
 {
 f = new JFrame("Panel");
 l = new JLabel("Panel Label");
 b1 = new JButton("Button 1");
 b2 = new JButton("Button 2");
 b3 = new JButton("Button 3");
 JPanel p = new JPanel();
 p.add(b1);
 p.add(b2);
 p.add(b3);
 p.add(l);
 p.setBackground(Color.red);
 f.add(p);
 f.setSize(500, 500);
 f.show();
 }
}

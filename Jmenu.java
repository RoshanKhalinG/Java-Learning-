import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
class MenuDemo extends JFrame{
    static JFrame f;
    static JLabel l;
    static JMenuBar mb;
    static JMenu x1, x2;
    static JMenuItem m1,m2,m3,s1,s2;
    
    public static void main(String args[])
    {
        f = new JFrame("Menu demo");
        l = new JLabel("This is just a demo");
        mb = new JMenuBar();
        x1 = new JMenu("Menu");
        x2 = new JMenu("SubMenu");
        m1 = new JMenuItem("MenuItem1");
        m2 = new JMenuItem("MenuItem2");
        m3 = new JMenuItem("MenuItem3");
        s1 = new JMenuItem("SubMenuItem1");
        s2 = new JMenuItem("SubMenuItem2");
        x1.add(m1);
        x1.add(m2);
        x1.add(m3);
        x2.add(s1);
        x2.add(s2);
        x1.add(x2);
        x1.add(m2);
        mb.add(x1);
        f.setJMenuBar(mb);
        f.add(l);
        f.setSize(500, 50);
        f.setVisible(true);
    }
}
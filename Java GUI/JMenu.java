// JMenu
// The JMenuBar class is used to display menubar on the window or frame. It may
// have several menus.
// The object of JMenu class is a pull down menu component which is displayed
// from the menu bar. It inherits the JMenuItem class.
// The object of JMenuItem class adds a simple labeled menu item. The item used
// in a menu must belong to the JMenuItem or any of its subclass.
// JMenuBar mb = new JMenuBar();
// JMenu menu1 = new JMenu(“Courses”);
// JMenuItem item1 = new JMenuItem(“BCA”);
// JMenuItem item2 = new JMenuItem(“BBA”);
// menu1.add(item1);
// menu1.add(item2);
// mb.add(menu1);

// Example:
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
class MenuDemo extends JFrame
{
 static JFrame f;
 static JLabel l;
 static JMenuBar mb;
 static JMenu x1, x2;
 static JMenuItem m1, m2, m3, s1, s2;
 public static void main(String args[]) {
 f = new JFrame("Menu demo");
 l = new JLabel(" This is just a demo");
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
 mb.add(x1);
 f.setJMenuBar(mb);
 f.add(l);
 f.setSize(500, 500);
 f.setVisible(true);
 }
}

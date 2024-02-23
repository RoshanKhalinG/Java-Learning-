// JList:
// JList is a component that displays a list of objects. It allows the user to select one
// or more items.
// String arr[] = {“BCA”, “BBA”, “BBS”, “BSC”};
// JList cb = new JList(arr);
// Example:

import java.awt.*;
import javax.swing.*;
class MyJlist extends JFrame
{
 static JFrame f;
 static JList l;
 public static void main(String args[])
 {
 f = new JFrame("Nist College");
 // solve s = new solve();
 JPanel p = new JPanel();
 JLabel lb = new JLabel("Select the day of the week");
 String week[] = {"Sunday", "Monday", "Tuesday", "Wednesday",
"Thursday", "Friday", "Saturday"};
 l = new JList(week);
 l.setSelectedIndex(0);
 p.add(l);
 f.add(p);
 f.setSize(400,400);
 f.setVisible(true);
 }
}

// Border Layout:
// A BorderLayout lays out a container, arranging its components to fit into five regions: NORTH,
// SOUTH, EAST, WEST and CENTER. For each region, it may contain no more than one
// component. When adding different components, we need to specify the orientation of it to
// be the one of the five region.
// For BorderLayout, it can be constructed like below
// • BorderLayout(): Construct a border lauout with no gaps between components.
// • BorderLayout(int hgap, int vgap): Construct a border layout with specified gaps between
// components.
// For example:

import javax.swing.*;
import java.awt.*;
class BorderLayoutDemo
{
 JFrame f1;
 JButton b1,b2,b3,b4,b5;
 BorderLayoutDemo()
 {
 f1 = new JFrame();
 f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 f1.setSize(300,300);
 f1.setLayout(new BorderLayout(10,10));
 b1 = new JButton("Button 1");
 b2 = new JButton("Button 2");
 b3 = new JButton("Button 3");
 b4 = new JButton("Button 4");
 b5 = new JButton("Button 5");
 f1.add(b1, BorderLayout.NORTH);
 f1.add(b2, BorderLayout.SOUTH);
 f1.add(b3, BorderLayout.WEST);
 f1.add(b4, BorderLayout.CENTER);
 f1.add(b5, BorderLayout.EAST);
 f1.setVisible(true);
 }
 public static void main(String args[])
 {
 new BorderLayoutDemo();
 }
}
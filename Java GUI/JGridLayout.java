// GridLayout
// The GridLayout manager is used to lay out the components in a rectangle grid,
// which has been divided into equal – sized rectangles and one component is
// placed in each rectangle.
// It can constructed with following methods
// • GridLayout(): Construct a grid layout with one column per component in a
// single row.
// • GridLayout(int row, int col): Construct a grid layout with specified numbers
// of rows and columns.
// • GridLayout(int row, int col, int hgap, int vgap): Construct a grid layout with
// specified rows, columns and gaps between components.
// Example

import javax.swing.*;
import java.awt.*;
 class GridLayoutDemo
{
 JFrame f1;
 JLabel l1,l2;
 JButton b1,b2;
 JTextField t1,t2;
 JPasswordField p1,p2;
 GridLayoutDemo()
 {
 f1 = new JFrame(" grid layout");
 f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 f1.setSize(400,400);
 f1.setLayout(new GridLayout(4,2,5,5));
 l1 = new JLabel(" Username");
 l2 = new JLabel(" Password");
 b1 = new JButton("OK");
 b2 = new JButton("Cancel");
 t1 = new JTextField();
 t2 = new JTextField();
 p1 = new JPasswordField();
 p2 = new JPasswordField();
 f1.add(l1);
 f1.add(l2);
 f1.add(b1);
 f1.add(b2);
 f1.add(t1);
 f1.add(p1);
 f1.add(t2);
 f1.add(p2);
 f1.setVisible(true);
 }
 public static void main(String args[])
 {
 new GridLayoutDemo();
 }
}

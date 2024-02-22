// Layout Management
// FlowLayout
// The FlowLayout arranges the components in a directional flow, either from left
// to right or from right to left. Normally all components are set to one row,
// according to the order of different components, if all components cannot be fit
// into one row, it will start a new row and fit the rest in.
// To construct a FlowLayout, three options could be chosen:
// • FlowLayout(): Construct a new FlowLayout object with center alignment and
// horizontal and vertical gap to be default size of 5 pizel.
// • FlowLayout(int align): Construct similar object with different settings on
// alignment.
// • FLowLayout(int align, int hgap, int vgap): Construct similar object with
// different settings on alignment and gaps between components.
// Example:

import javax.swing.*;
import java.awt.*;
 class FlowLayoutDemo
{
 JFrame f1;
 JButton b1,b2,b3,b4,b5;
 FlowLayoutDemo()
 {
 f1 = new JFrame();
 f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 f1.setSize(400,400);
 f1.setLayout(new FlowLayout(3,15,15));
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
 new FlowLayoutDemo();
 }
}
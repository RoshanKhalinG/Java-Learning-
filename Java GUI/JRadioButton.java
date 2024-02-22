// JRadio Button
// JRadioButton allows the user to select a single exclusive choice from a group of
// options. It is used with the ButtonGroup Component.
// JRadioButton rb1 = new JRadioButton(“Male”);
// JRadioButton rb2 = new JRadioButton(“Female”);
// ButtonGroup bg = new ButtonGroup();
// bg.add(rb1);
// bg.add(rb2);


import java.awt.*;
import javax.swing.*;
class MyRadioButton extends JFrame
{
 MyRadioButton() // Use the class name for the constructor
 {
 JRadioButton jb = new JRadioButton("Male"); // CreatingJRadioButton
 add(jb); //adding JRadioButton to frame
 jb = new JRadioButton("Female"); //creating JRadioButton
 add(jb); //adding JRadioButton to frame
 jb = new JRadioButton("Other"); //creating JRadioButton
 add(jb); //adding JRadioButton to frame
 setLayout(new FlowLayout());
 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 setSize(400,400);
 setVisible(true);
 }
 public static void main(String args[])
 {
 {
 new MyRadioButton(); // Create an instance of your class
 }
 }
}

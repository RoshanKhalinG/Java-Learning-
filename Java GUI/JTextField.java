// JLabel
// Label is a simple component for displaying text, images or both. It doesnot react
// to input events.
// JLabel lb = new Label(“This is a label”);

// JTextField
// JTextField is a text component that allows editing of a single line of non –
// formatted text.
// JTextField txt = new JTextField();

// Example:

import java.awt.*;
import javax.swing.*;
class MyTextField extends JFrame
{
 public MyTextField() // Use the class name for the constructor
 {
 JTextField tf = new JTextField(20); // creating JTextField
 add(tf);
 setLayout(new FlowLayout());
 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 setSize(400, 400);
 setVisible(true);
 }
 public static void main(String args[])
 {
 {
 new MyTextField(); // Create an instance of your class
 };
 }
}



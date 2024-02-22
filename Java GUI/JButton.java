// JButton is in implementation of a push button. It is used to trigger an action if
// the user clicks on it. JButton can display a text, an icon or both.
// JButton bt = new jButton(“Click Me”);

//EXAMPLE:


import java.awt.*;
import javax.swing.*;

class MyButtonFrame extends JFrame {

    public static void main(String args[]) {
        JFrame frame = new JFrame("MyButtonFrame");
        JButton bt1 = new JButton("Yes");
        JButton bt2 = new JButton("NO");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());
        frame.setSize(400, 400);
        frame.add(bt1);
        frame.add(bt2);
        frame.setVisible(true);
    }
}
// import java.awt.*;
// import javax.swing.*;
// class MyButtonFrame extends JFrame
// {
//  MyButtonFrame() // Use the class name for the constructor
//  {
//  JButton bt1 = new JButton("Yes"); // Creating yes button
//  JButton bt2 = new JButton("NO"); // Creating No button
//  setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//  setLayout(new FlowLayout());
//  setSize(400, 400); // Setting size of JFrame
//  add(bt1); // adding yes button to frame
//  add(bt2); // adding No button to frame
//  setVisible(true);
//  }
//  public static void main(String args[])
//  {
//  {
//  new MyButtonFrame(); // Create an instance of your class
//  }
//  }
// }

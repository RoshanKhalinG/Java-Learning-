import javax.swing.*;
class SimpleDialog
{
 public static void main(String args[])
 {
 JFrame frame = new JFrame("Main Window");
 JOptionPane.showMessageDialog(frame, "Message for the dialogbox goes here.","Error", JOptionPane.ERROR_MESSAGE);
 frame.setSize(350,350);
 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 frame.setVisible(true);
 }
}

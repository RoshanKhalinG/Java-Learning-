// JComboBox
// JComboBox is a component that combiles a button or editable ield and drip –
// down list. The user can select a value from the drop – down list, which appears
// at the user’s request. If you make the combo box editable, then the combo box
// includes an editable filed into which the user can type a value.
// String arr[] = {“BCA”, “BBA”, ”BBS”, “BSC”};
// JComboBox cb = new JComboBox(arr);
// Or
// JComboBox<String> cb = new JComboBox<String>();
// cb.addItem(“BCA”);
// cb.addItem(“BBA);
// cb.addItem(“BBS”);
// cb.addItem(“BSC”);

// Example:
import java.awt.*;
import javax.swing.*;
class MyComboBox extends JFrame
{
 String faculty[] = {"BBA", "BCA", "Bsc", "BBS","Sushan"};
 MyComboBox()
 {
 JComboBox cb = new JComboBox(faculty);
 add(cb); // adding JComboBox to frame
 setLayout(new FlowLayout());
 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 setSize(400,400);
 setVisible(true);
 }
 public static void main(String args[])
 {
 {
 new MyComboBox(); // Create an instance of your class
 }
 }
}
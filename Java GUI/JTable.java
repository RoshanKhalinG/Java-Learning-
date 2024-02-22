// JTextArea
// A JTextArea is a multiline text area that displays plain text. It is lightweight
// component for working with text. The component does not handle scrolling. For
// this task, we use JScrollPane component.
// JTextArea txt = new JTextArea();
// JTable
// The JTable class is a part of java Swing Package and is generally used to display
// or edit two dimensional data that is having both rows and columns. It is similar
// to a spreadsheet. This arranges data in a tabular form.
// Example:

import java.awt.*;
import javax.swing.*;
class Jtable1 {
 JFrame f;
 JTable j;
 String[] columnNames = {"Name", "Year", "Course"};
 Jtable1() {
 f = new JFrame();
 f.setTitle("JTable Example");
 String data[][] = {{"Keshab", "2021", "BCA"}, {"Nishant",
"2022", "BBS"}, {"Sudip", "2019", "+2"}};
 j = new JTable(data, columnNames);
 j.setBounds(30, 40, 400, 300);
 JScrollPane sp = new JScrollPane(j);
 f.add(sp);
 f.setSize(500, 400);
 f.setVisible(true);
 }
 public static void main(String args[]) {
 new Jtable1();
 }
}

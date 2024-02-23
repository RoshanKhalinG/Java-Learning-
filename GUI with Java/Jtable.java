import java.awt.*;
import javax.swing.*;

  class java4
  
{
   static JFrame f;
   static JTable j;
    String[] columnNames = {"Names", "Year", "Course"};
    java4()
{
f = new JFrame("Citizen College");
f.setTitle("JTable Example");
String data[][]={{"Keshab","2021","BCA"} , {"Manish","2022","BCA"}};
j = new JTable(data, columnNames);
JScrollPane sp = new JScrollPane(j);
f.add(sp);
f.setSize(500, 50);

f.setVisible(true);
}

public static void main(String [] args){
    new java4();
}
}

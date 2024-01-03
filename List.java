import java.awt.*;
import javax.swing.*;
public class Mylist extends JFrame{
    static JFrame f;
    static JList l;
    public static void main(String args[])
    {
        f = new JFrame("Citizen College");
        JPanel p = new JPanel();
        JLabel lb = new JLabel("Select the day of the week");
        String week[] = {"Sunday","Monday","Tuesday"};
        l = newJList(week);
        l.setSelectedIndex(3);
        p.add(lb);
        p.add(l);
        p.add(p);
        f.setVisible(true);
    }
}
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
        l = new JList(week);
        l.setSelectedIndex(3);
        p.add(lb);
        p.add(l);
        p.add(p);
        f.setSize(400,400);
        f.setVisible(true);
    }
}

// import javax.swing.*;

// public class Mylist extends JFrame {
//     static JFrame f;
//     static JList<String> l;

//     public static void main(String args[]) {
//         f = new JFrame("Citizen College");
//         JPanel p = new JPanel();
//         JLabel lb = new JLabel("Select the day of the week");
//         String week[] = {"Sunday", "Monday", "Tuesday"};
//         l = new JList<>(week);
//         l.setSelectedIndex(0);  // Select the first element
//         p.add(lb);
//         p.add(l);
//         f.add(p);  // Add the panel to the frame
//         f.setSize(300, 200);
//         f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  // Set default close operation
//         f.setVisible(true);
//     }
// }

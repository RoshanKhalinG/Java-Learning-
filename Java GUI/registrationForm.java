

import java.awt.*;
// import java.awt.event.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.*;

public class registrationForm implements ActionListener{
    JLabel l1,l2,l3,l4,l5;
    JTextField t1,t2,t3,t4;
    JRadioButton r1,r2;
    JButton b1;
    JComboBox cb;

    
    ButtonGroup bg = new ButtonGroup();
 
       registrationForm(){

       
        GridBagLayout g1 = new GridBagLayout();
        JFrame f1 = new JFrame();
        f1.setLayout(g1);
        GridBagConstraints gbc = new GridBagConstraints();
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f1.setVisible(true);
        f1.setSize(500,500);

        l1= new JLabel("Name");
        gbc.gridx=0;
        gbc.gridy=0;
        g1.setConstraints(l1, gbc);
        f1.add(l1);

        
        l2= new JLabel("Registration no");
        gbc.gridx=0;
        gbc.gridy=1;
        g1.setConstraints(l2, gbc);
        f1.add(l2);

        l3= new JLabel("Address");
        gbc.gridx=0;
        gbc.gridy=2;
        g1.setConstraints(l3, gbc);
        f1.add(l3);

        l4= new JLabel("Department");
        gbc.gridx=0;
        gbc.gridy=3;
        g1.setConstraints(l4, gbc);
        f1.add(l4);

        l5= new JLabel("Sex");
        gbc.gridx=0;
        gbc.gridy=4;
        g1.setConstraints(l5, gbc);
        f1.add(l5);

        t1 = new JTextField(10);
        gbc.gridx=1;
        gbc.gridy=0;
        g1.setConstraints(t1, gbc);
        f1.add(t1);

        t2 = new JTextField(10);
        gbc.gridx=1;
        gbc.gridy=1;
        g1.setConstraints(t2, gbc);
        f1.add(t2);

        t3 = new JTextField(10);
        gbc.gridx=1;
        gbc.gridy=2;
        g1.setConstraints(t3, gbc);
        f1.add(t3);

        String faculty[] = {"BBA", "BCA", "Bsc", "BBS"};
        cb= new JComboBox<>(faculty);
        gbc.gridx=1;
        gbc.gridy=3;
        g1.setConstraints(cb, gbc);
        f1.add(cb);

        r1 = new JRadioButton("Male");
        gbc.gridx=1;
        gbc.gridy=4;
        g1.setConstraints(r1, gbc);
        f1.add(r1);   
        
        
        r2 = new JRadioButton("Female");
        gbc.gridx=2;
        gbc.gridy=4;
        g1.setConstraints(r2, gbc);
        f1.add(r2); 

        bg= new ButtonGroup();
        bg.add(r1);
        bg.add(r2);
    
        

        
        b1 = new JButton("Submit");
        gbc.gridx=1;
        gbc.gridy=5;
        g1.setConstraints(b1, gbc);
        f1.add(b1);

        
        t4 = new JTextField(50);
        gbc.gridx=0;
        gbc.gridy=6;
        gbc.gridheight=10;
        gbc.gridwidth=5;
        g1.setConstraints(t4, gbc);
        f1.add(t4);

        b1.addActionListener(this);
        
       }

       public static void main(String[] args) {
        new registrationForm();
       }

       public void actionPerformed(ActionEvent e)
 {
          String name = t1.getText();
          String regis = t2.getText();
          String Add = t3.getText();
          String faculty = (String) cb.getSelectedItem();
          String sex = r1.isSelected() ? "Male" : "Female";
        
          t4.setText("Name : "+name+" \nResistration No: "+regis+" \nAddress :"+Add+" \nFaculty :"+faculty+" \nSex :"+sex);

 }

    
}

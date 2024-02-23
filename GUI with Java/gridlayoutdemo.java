// import java.awt.*;
// import javax.swing.*;
// public class Gridbagdemo{
// JFrame f1;
// jbuttton b1,b2,b3,b4,b5,b6,b7;

// Gridbagdemo()
// {
//     f1=new jframe{};
// f1.setDefaultCloseOperation(jframe.EXIT_ON_CLOSE);
// f1.setSize(width:400,height:400);

// Gridbaglayout g1= new grid
// }
// }
import javax.swing.*;
import java.awt.*;

public class gridlayoutdemo {
    JFrame f1;
    JButton b1,b2,b3,b4,b5,b6,b7;
    gridlayoutdemo(){
    f1= new JFrame();
    f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    f1.setSize(400,400);
    GridBagLayout g1= new GridBagLayout();
    f1.setLayout(g1);
    GridBagConstraints gbc= new GridBagConstraints();
     b1= new JButton("BUtton1 ");
    gbc.gridx=0;
    gbc.gridy=0;
    g1.setConstraints(b1,gbc);
    f1.add(b1);


    b2= new JButton("BUtton2 ");
    gbc.gridx=1;
    gbc.gridy=0;
    g1.setConstraints(b2,gbc);
    f1.add(b2);

    b3= new JButton("BUtton3");
    gbc.gridx=2;
    gbc.gridy=0;
    g1.setConstraints(b3,gbc);
    f1.add(b3);

    b4= new JButton("BUtton4 ");
    gbc.gridx=0;
    gbc.gridy=1;
    gbc.gridwidth=2;
    gbc.gridheight=2;
    gbc.fill=   GridBagConstraints.BOTH;
    g1.setConstraints(b3,gbc);
    f1.add(b4);

    b5= new JButton("BUtton5 ");
    gbc.gridx=3;
    gbc.gridy=0;
    g1.setConstraints(b5,gbc);
    f1.add(b5);

    b6= new JButton("BUtton6 ");
    gbc.gridx=2;
    gbc.gridy=1;
    g1.setConstraints(b6,gbc);
    f1.add(b6);
    b7= new JButton("BUtton7 ");
    gbc.gridx=3;
    gbc.gridy=2;
    g1.setConstraints(b7,gbc);
    f1.add(b7);
    f1.setVisible(true);
    
}
  public static void main(String[] args) {
    new gridlayoutdemo();
  }  
}
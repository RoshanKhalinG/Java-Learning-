import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

class Form implements ActionListener {
    JLabel l1, l2, l3, l4;
    JTextField t1, t2, t3;
    JButton b1;

    Form() {
        GridBagLayout g1 = new GridBagLayout();
        JFrame f1 = new JFrame();
        f1.setLayout(g1);
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f1.setSize(1000, 1000);
        f1.setVisible(true);
        GridBagConstraints gbc = new GridBagConstraints();

        l1 = new JLabel("Registration Form");
        gbc.gridx = 1;
        gbc.gridy = 0;
        g1.setConstraints(l1, gbc);
        f1.add(l1);

        l2 = new JLabel("Full Name :");
        gbc.gridx = 0;
        gbc.gridy = 1;
        g1.setConstraints(l2, gbc);
        f1.add(l2);

        l3 = new JLabel("Email ID :");
        gbc.gridx = 0;
        gbc.gridy = 2;
        g1.setConstraints(l3, gbc);
        f1.add(l3);

        l4 = new JLabel("Password :");
        gbc.gridx = 0;
        gbc.gridy = 3;
        g1.setConstraints(l4, gbc);
        f1.add(l4);

        t1 = new JTextField(20);
        gbc.gridx = 1;
        gbc.gridy = 1;
        g1.setConstraints(t1, gbc);
        f1.add(t1);

        t2 = new JTextField(20);
        gbc.gridx = 1;
        gbc.gridy = 2;
        g1.setConstraints(t2, gbc);
        f1.add(t2);

        t3 = new JTextField(20);
        gbc.gridx = 1;
        gbc.gridy = 3;
        g1.setConstraints(t3, gbc);
        f1.add(t3);

        b1 = new JButton("Submit");
        gbc.gridx = 1;
        gbc.gridy = 4;
        g1.setConstraints(b1, gbc);
        f1.add(b1);

        b1.addActionListener(this);
    }

    public static void main(String[] args) {
        new Form();
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b1) {
            String fullName = t1.getText();
            String emailId = t2.getText();
            String password= t3.getText();

            // Perform actions with the collected data, e.g., validation, saving to database, etc.

            JOptionPane.showMessageDialog(null, "Registration successful!\nFull Name: " + fullName + "\nEmail ID: " + emailId + "\nPassword : "+password);

            t1.setText("");
            t2.setText("");
            t3.setText("");
        }
    }
}








// import java.awt.*;
// import java.awt.event.*;
// import javax.swing.*;

// public class RegistrationForm extends JFrame implements ActionListener {

//     private JLabel fullNameLabel, emailIdLabel;
//     private JTextField fullNameTextField, emailIdTextField;
//     private JButton submitButton;

//     public RegistrationForm() {
//         super("Registration Form");

//         // Create labels
//         fullNameLabel = new JLabel("Full Name:");
//         emailIdLabel = new JLabel("Email ID:");

//         // Create text fields
//         fullNameTextField = new JTextField(20);
//         emailIdTextField = new JTextField(20);

//         // Create submit button
//         submitButton = new JButton("Submit");
//         submitButton.addActionListener(this);

//         // Add components to the frame
//         JPanel panel = new JPanel(new GridBagLayout());
//         GridBagConstraints c = new GridBagConstraints();

//         c.fill = GridBagConstraints.HORIZONTAL;
//         c.gridx = 0;
//         c.gridy = 0;
//         panel.add(fullNameLabel, c);

//         c.gridx = 1;
//         panel.add(fullNameTextField, c);

//         c.gridy = 1;
//         c.gridx = 0;
//         panel.add(emailIdLabel, c);

//         c.gridx = 1;
//         panel.add(emailIdTextField, c);

//         c.gridy = 2;
//         c.gridx = 0;
//         c.gridwidth = 2;
//         panel.add(submitButton, c);

//         add(panel);

//         pack();
//         setLocationRelativeTo(null);
//         setVisible(true);
//     }

//     @Override
//     public void actionPerformed(ActionEvent e) {
//         if (e.getSource() == submitButton) {
//             String fullName = fullNameTextField.getText();
//             String emailId = emailIdTextField.getText();

//             // Perform actions with the collected data, e.g., validation, saving to database, etc.

//             JOptionPane.showMessageDialog(this, "Registration successful!\nFull Name: " + fullName + "\nEmail ID: " + emailId);

//             fullNameTextField.setText("");
//             emailIdTextField.setText("");
//         }
//     }

//     public static void main(String[] args) {
//         new RegistrationForm();
//     }
// }

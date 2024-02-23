import javax.swing.*;
 class MyPanel extends JPanel {
    public MyPanel() {
        // Add components to the panel
        add(new JLabel("Hello, JPanel!"));
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("My Frame");
            frame.setSize(400, 300);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            MyPanel panel = new MyPanel();
            frame.add(panel);

            frame.setVisible(true);
        });
    }
}

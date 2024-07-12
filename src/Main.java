import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        JFrame frame = new JFrame("LOGIN");
        frame.setContentPane(new login().mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setSize(500, 400);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
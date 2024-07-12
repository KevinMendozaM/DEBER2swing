import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FOTO {
    public JPanel panel1;
    private JLabel fenomeno;
    public JButton button1;


    public FOTO() {
        ImageIcon icon = new ImageIcon("src/imagen1.jpg");
        icon = new ImageIcon(icon.getImage().getScaledInstance(75, 75, java.awt.Image.SCALE_SMOOTH));
        fenomeno.setIcon(icon);


        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                JFrame frame = new JFrame("hobbie");
                frame.setContentPane(new BIO().mainPanel);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.pack();
                frame.setSize(500, 400);
                frame.setLocationRelativeTo(null);
                frame.setVisible(true);

            }
        });
    }
}

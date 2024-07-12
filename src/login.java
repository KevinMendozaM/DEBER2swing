import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class login

{
    public JPanel mainPanel;
    private JTextField USUARIO;
    private JTextField NOMBRE;
    private JTextField CORREO;
    private JTextField CONTRASENIA;
    public JButton CONFIRMARButton;

    public login() {
        CONFIRMARButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String usuario = USUARIO.getText();
                String nombre = NOMBRE.getText();
                String correo = CORREO.getText();
                String contrasenia = new String(CONTRASENIA.getText());
                if (correo.equals("kevin.mendoza01@epn.edu.ec") && contrasenia.equals("shakaDEvirgo"))
                {
                    JFrame frame = new JFrame("Biografía");
                    frame.setContentPane(new BIO().mainPanel);
                    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    frame.pack();
                    frame.setLocationRelativeTo(null);
                    frame.setVisible(true);

                    JFrame login_frame = (JFrame) SwingUtilities.getWindowAncestor(mainPanel);
                    login_frame.dispose();

                }
                else
                {
                    JOptionPane.showMessageDialog(null, "Credenciales incorrectas");
                }

            }
        });
    }
}

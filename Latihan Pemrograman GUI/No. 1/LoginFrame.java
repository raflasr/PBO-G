import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class LoginFrame extends JFrame {
    // Komponen GUI
    private JTextField txtUsername;
    private JPasswordField txtPassword;
    private JButton btnLogin, btnCancel;

    public LoginFrame() {
        // Judul frame
        setTitle("Login User");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Panel utama
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3, 2, 10, 10));

        // Menambahkan komponen
        panel.add(new JLabel("Username:"));
        txtUsername = new JTextField();
        panel.add(txtUsername);

        panel.add(new JLabel("Password:"));
        txtPassword = new JPasswordField();
        panel.add(txtPassword);

        btnLogin = new JButton("Login");
        btnCancel = new JButton("Cancel");

        // Menambahkan tombol
        panel.add(btnLogin);
        panel.add(btnCancel);

        // Menambahkan panel ke frame
        add(panel);

        // Event Listener untuk tombol Login
        btnLogin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username = txtUsername.getText();
                String password = new String(txtPassword.getPassword());

                // Login sederhana (hardcoded)
                if (username.equals("admin") && password.equals("12345")) {
                    JOptionPane.showMessageDialog(null, "Login berhasil!");
                } else {
                    JOptionPane.showMessageDialog(null, "Username atau password salah!", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        // Event Listener untuk tombol Cancel
        btnCancel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtUsername.setText("");
                txtPassword.setText("");
            }
        });
    }

    public static void main(String[] args) {
        // Menjalankan frame
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new LoginFrame().setVisible(true);
            }
        });
    }
}

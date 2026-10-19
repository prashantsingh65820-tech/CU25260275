import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class StudentLoginform extends JFrame implements ActionListener {
    JTextField username;
    JPasswordField password;
    JButton login, reset;

    StudentLoginform() {
        setTitle("Student Login");
        setSize(350, 200);
        setLayout(new GridLayout(3, 2, 10, 10));

        add(new JLabel("Username:"));
        username = new JTextField();
        add(username);

        add(new JLabel("Password:"));
        password = new JPasswordField();
        add(password);

        login = new JButton("Login");
        reset = new JButton("Reset");

        add(login);
        add(reset);

        login.addActionListener(this);
        reset.addActionListener(this);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == login) {
            String user = username.getText();
            String pass = new String(password.getPassword());

            if (user.equals("student") && pass.equals("1234"))
                JOptionPane.showMessageDialog(this, "Login Successful!");
            else
                JOptionPane.showMessageDialog(this, "Invalid Username or Password!");
        } else {
            username.setText("");
            password.setText("");
        }
    }

    public static void main(String[] args) {
        new StudentLoginform();
    }
}
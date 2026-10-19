import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class MiniBankingApplication extends JFrame implements ActionListener {
    JTextField account, name, balance, amount;
    JButton deposit, withdraw, check, clear;

    MiniBankingApplication() {
        setTitle("Mini Banking Application");
        setSize(400, 350);
        setLayout(new GridLayout(6, 2, 10, 10));

        add(new JLabel("Account Number:"));
        account = new JTextField();
        add(account);

        add(new JLabel("Customer Name:"));
        name = new JTextField();
        add(name);

        add(new JLabel("Current Balance:"));
        balance = new JTextField("1000");
        balance.setEditable(false);
        add(balance);

        add(new JLabel("Amount:"));
        amount = new JTextField();
        add(amount);

        deposit = new JButton("Deposit");
        withdraw = new JButton("Withdraw");
        check = new JButton("Check Balance");
        clear = new JButton("Clear");

        add(deposit);
        add(withdraw);
        add(check);
        add(clear);

        deposit.addActionListener(this);
        withdraw.addActionListener(this);
        check.addActionListener(this);
        clear.addActionListener(this);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == clear) {
            account.setText("");
            name.setText("");
            amount.setText("");
            return;
        }

        try {
            double currentBalance = Double.parseDouble(balance.getText());

            if (e.getSource() == check) {
                JOptionPane.showMessageDialog(this,
                    "Current Balance: " + currentBalance);
                return;
            }

            double value = Double.parseDouble(amount.getText());

            if (value <= 0) {
                JOptionPane.showMessageDialog(this,
                    "Amount must be greater than zero.");
                return;
            }

            if (e.getSource() == deposit) {
                currentBalance += value;
                balance.setText(String.valueOf(currentBalance));

                JOptionPane.showMessageDialog(this,
                    "Deposit successful!");

            } else if (e.getSource() == withdraw) {
                if (value <= currentBalance) {
                    currentBalance -= value;
                    balance.setText(String.valueOf(currentBalance));

                    JOptionPane.showMessageDialog(this,
                        "Withdrawal successful!");
                } else {
                    JOptionPane.showMessageDialog(this,
                        "Insufficient balance!");
                }
            }

        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this,
                "Please enter a valid amount.");
        }
    }

    public static void main(String[] args) {
        new MiniBankingApplication();
    }
}
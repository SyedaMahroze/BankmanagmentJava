package view;

import controller.AccountController;
import model.Account;
import model.Customer;

import javax.swing.*;
import java.awt.*;
import java.util.List;

public class AccountView extends JFrame {
    private JTextField txtCustomerId = new JTextField(15);
    private JTextField txtAccountType = new JTextField(15);
    private JButton btnAdd = new JButton("Add Account");
    private JButton btnShow = new JButton("Show Accounts");
    private JComboBox<Account> cbAccounts = new JComboBox<>();

    private AccountController controller = new AccountController();

    public AccountView() {
        setTitle("Account Management");
        setSize(400, 250);
        setLayout(new GridLayout(4, 2));

        add(new JLabel("Customer ID:"));
        add(txtCustomerId);
        add(new JLabel("Account Type:"));
        add(txtAccountType);
        add(btnAdd);
        add(btnShow);
        add(new JLabel("Accounts:"));
        add(cbAccounts);

        btnAdd.addActionListener(e -> {
            try {
                int customerId = Integer.parseInt(txtCustomerId.getText());
                String accountType = txtAccountType.getText();
                controller.addAccount(customerId, accountType);
                JOptionPane.showMessageDialog(this, "Account added successfully!");
                txtCustomerId.setText("");
                txtAccountType.setText("");
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, "Customer ID must be a number");
            }
        });

        btnShow.addActionListener(e -> {
            cbAccounts.removeAllItems();
            List<Account> accounts = controller.getAllAccounts();
            for (Account a : accounts) {
                cbAccounts.addItem(a);
            }
        });

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }
}

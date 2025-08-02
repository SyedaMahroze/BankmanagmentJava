package view;

import controller.ATMCardController;
import model.ATMCard;

import javax.swing.*;
import java.awt.*;
import java.util.List;

public class ATMCardView extends JFrame {
    private JTextField txtAccountId = new JTextField(15);
    private JTextField txtCardNumber = new JTextField(15);
    private JButton btnAdd = new JButton("Add ATM Card");
    private JButton btnShow = new JButton("Show ATM Cards");
    private JComboBox<ATMCard> cbCards = new JComboBox<>();

    private ATMCardController controller = new ATMCardController();

    public ATMCardView() {
        setTitle("ATM Card Management");
        setSize(400, 250);
        setLayout(new GridLayout(4, 2));

        add(new JLabel("Account ID:"));
        add(txtAccountId);
        add(new JLabel("Card Number:"));
        add(txtCardNumber);
        add(btnAdd);
        add(btnShow);
        add(new JLabel("ATM Cards:"));
        add(cbCards);

        btnAdd.addActionListener(e -> {
            try {
                int accountId = Integer.parseInt(txtAccountId.getText());
                String cardNumber = txtCardNumber.getText();
                controller.addATMCard(accountId, cardNumber);
                JOptionPane.showMessageDialog(this, "ATM Card added successfully!");
                txtAccountId.setText("");
                txtCardNumber.setText("");
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, "Account ID must be a number");
            }
        });

        btnShow.addActionListener(e -> {
            cbCards.removeAllItems();
            List<ATMCard> cards = controller.getAllATMCards();
            for (ATMCard c : cards) {
                cbCards.addItem(c);
            }
        });

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }
}

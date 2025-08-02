import java.awt.GridLayout;
import javax.swing.*;
import view.*;

public class MainApp {
    public static void main(String[] args) {
        // Create Main Frame
        JFrame frame = new JFrame("🏦 Bank Management System");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 300);

        // Create Panel
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3, 3, 10, 10)); // 3x3 layout

        // Create Buttons
        JButton btnCustomer = new JButton("Customer");
        JButton btnATMCard = new JButton("ATM Card");
        JButton btnAccount = new JButton("Account");
        JButton btnTransaction = new JButton("Bank Transaction");
        JButton btnAuditLog = new JButton("Audit Log");
        JButton btnLoan = new JButton("Loan");
        JButton btnLoanRepayment = new JButton("Loan Repayment");
        JButton btnBranch = new JButton("Branch");
        JButton btnEmployee = new JButton("Employee");

        // Add Button Listeners
        btnCustomer.addActionListener(e -> new CustomerView());
        btnATMCard.addActionListener(e -> new ATMCardView());
        btnAccount.addActionListener(e -> new AccountView());
        btnTransaction.addActionListener(e -> new BankTransactionView());
        btnAuditLog.addActionListener(e -> new AuditLogView());
        btnLoan.addActionListener(e -> new LoanView());
        btnLoanRepayment.addActionListener(e -> new LoanRepaymentView());
        btnBranch.addActionListener(e -> new BranchView());
        btnEmployee.addActionListener(e -> new EmployeeView());

        // Add Buttons to Panel
        panel.add(btnCustomer);
        panel.add(btnATMCard);
        panel.add(btnAccount);
        panel.add(btnTransaction);
        panel.add(btnAuditLog);
        panel.add(btnLoan);
        panel.add(btnLoanRepayment);
        panel.add(btnBranch);
        panel.add(btnEmployee);

        // Add Panel to Frame
        frame.add(panel);
        frame.setVisible(true);
    }
}

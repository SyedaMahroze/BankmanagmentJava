package view;

import controller.AuditLogController;
import model.AuditLog;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.List;

public class AuditLogView extends JFrame {
    private JTextField txtAction = new JTextField(15);
    private JTextField txtEmployeeId = new JTextField(15);
    private JButton btnAdd = new JButton("Add Log");
    private JButton btnShow = new JButton("Show Logs");
    private JComboBox<AuditLog> cbLogs = new JComboBox<>();

    private AuditLogController controller = new AuditLogController();

    public AuditLogView() {
        setTitle("Audit Log");
        setSize(400, 250);
        setLayout(new GridLayout(4, 2));

        add(new JLabel("Action:"));
        add(txtAction);
        add(new JLabel("Employee ID:"));
        add(txtEmployeeId);
        add(btnAdd);
        add(btnShow);
        add(new JLabel("Logs:"));
        add(cbLogs);

        btnAdd.addActionListener(e -> {
            controller.addAuditLog(txtAction.getText(), Integer.parseInt(txtEmployeeId.getText()));
            JOptionPane.showMessageDialog(this, "Audit log added!");
            txtAction.setText("");
            txtEmployeeId.setText("");
        });

        btnShow.addActionListener(e -> {
            cbLogs.removeAllItems();
            List<AuditLog> logs = controller.getAllAuditLogs();
            for (AuditLog l : logs) cbLogs.addItem(l);
        });

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    } 
}

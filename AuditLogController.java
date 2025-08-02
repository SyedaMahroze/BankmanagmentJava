package controller;

import dao.AuditLogDAO;
import model.AuditLog;
import java.util.List;

public class AuditLogController {
    private AuditLogDAO dao = new AuditLogDAO();

    public List<AuditLog> getAllAuditLogs() {
        return dao.getAllAuditLogs();
    }

    public void addAuditLog(String action, int employeeId) {
        AuditLog log = new AuditLog(0, action, employeeId, null);
        dao.addAuditLog(log);
    }
}

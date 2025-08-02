package model;

import java.time.LocalDateTime;

public class AuditLog {
    private int auditLogId;
    private String action;
    private int employeeId;
    private LocalDateTime actionDate;

    public AuditLog() {}

    public AuditLog(int auditLogId, String action, int employeeId, LocalDateTime actionDate) {
        this.auditLogId = auditLogId;
        this.action = action;
        this.employeeId = employeeId;
        this.actionDate = actionDate;
    }

    public int getAuditLogId() {
        return auditLogId;
    }

    public void setAuditLogId(int auditLogId) {
        this.auditLogId = auditLogId;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public LocalDateTime getActionDate() {
        return actionDate;
    }

    public void setActionDate(LocalDateTime actionDate) {
        this.actionDate = actionDate;
    }

    @Override
    public String toString() {
        return auditLogId + " - " + action + " by EmployeeID: " + employeeId + " on " + actionDate;
    }
}

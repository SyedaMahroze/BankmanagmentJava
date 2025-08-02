package dao;

import model.AuditLog;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class AuditLogDAO {
    public List<AuditLog> getAllAuditLogs() {
        List<AuditLog> logs = new ArrayList<>();
        try (Connection conn = DBConnection.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery("SELECT * FROM AuditLog")) {

            while (rs.next()) {
                AuditLog log = new AuditLog();
                log.setAuditLogId(rs.getInt("AuditLogID"));
                log.setAction(rs.getString("Action"));
                log.setEmployeeId(rs.getInt("EmployeeID"));
                log.setActionDate(rs.getTimestamp("ActionDate").toLocalDateTime());
                logs.add(log);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return logs;
    }

    public void addAuditLog(AuditLog log) {
        String sql = "INSERT INTO AuditLog (Action, EmployeeID) VALUES (?, ?)";
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setString(1, log.getAction());
            pstmt.setInt(2, log.getEmployeeId());
            pstmt.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

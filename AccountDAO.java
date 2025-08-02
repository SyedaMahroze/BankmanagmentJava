package dao;

import model.Account;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class AccountDAO {

    public List<Account> getAllAccounts() {
        List<Account> accounts = new ArrayList<>();
        String sql = "SELECT * FROM Account";
        try (Connection conn = DBConnection.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                Account account = new Account();
                account.setAccountId(rs.getInt("AccountID"));
                account.setCustomerId(rs.getInt("CustomerID"));
                account.setAccountType(rs.getString("AccountType"));
                accounts.add(account);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return accounts;
    }

    public void addAccount(Account account) {
        String sql = "INSERT INTO Account (CustomerID, AccountType) VALUES (?, ?)";
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setInt(1, account.getCustomerId());
            pstmt.setString(2, account.getAccountType());
            pstmt.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

package dao;

import model.ATMCard;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ATMCardDAO {

    public List<ATMCard> getAllATMCards() {
        List<ATMCard> cards = new ArrayList<>();
        String sql = "SELECT * FROM ATMCard";
        try (Connection conn = DBConnection.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                ATMCard card = new ATMCard();
                card.setCardId(rs.getInt("CardID"));
                card.setAccountId(rs.getInt("AccountID"));
                card.setCardNumber(rs.getString("CardNumber"));
                cards.add(card);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return cards;
    }

    public void addATMCard(ATMCard card) {
        String sql = "INSERT INTO ATMCard (AccountID, CardNumber) VALUES (?, ?)";
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setInt(1, card.getAccountId());
            pstmt.setString(2, card.getCardNumber());
            pstmt.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

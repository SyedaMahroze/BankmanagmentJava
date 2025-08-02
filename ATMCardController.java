package controller;

import dao.ATMCardDAO;
import model.ATMCard;
import java.util.List;

public class ATMCardController {
    private ATMCardDAO atmCardDAO = new ATMCardDAO();

    public List<ATMCard> getAllATMCards() {
        return atmCardDAO.getAllATMCards();
    }

    public void addATMCard(int accountId, String cardNumber) {
        ATMCard card = new ATMCard(0, accountId, cardNumber);
        atmCardDAO.addATMCard(card);
    }
}

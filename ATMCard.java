package model;

public class ATMCard {
    private int cardId;
    private int accountId;
    private String cardNumber;

    public ATMCard() {}

    public ATMCard(int cardId, int accountId, String cardNumber) {
        this.cardId = cardId;
        this.accountId = accountId;
        this.cardNumber = cardNumber;
    }

    public int getCardId() {
        return cardId;
    }
    public void setCardId(int cardId) {
        this.cardId = cardId;
    }
    public int getAccountId() {
        return accountId;
    }
    public void setAccountId(int accountId) {
        this.accountId = accountId;
    }
    public String getCardNumber() {
        return cardNumber;
    }
    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    @Override
    public String toString() {
        return cardId + " - AccountID: " + accountId + " Card#: " + cardNumber;
    }
}

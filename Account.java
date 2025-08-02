package model;

public class Account {
    private int accountId;
    private int customerId;
    private String accountType;

    public Account() {}

    public Account(int accountId, int customerId, String accountType) {
        this.accountId = accountId;
        this.customerId = customerId;
        this.accountType = accountType;
    }

    public int getAccountId() {
        return accountId;
    }
    public void setAccountId(int accountId) {
        this.accountId = accountId;
    }
    public int getCustomerId() {
        return customerId;
    }
    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }
    public String getAccountType() {
        return accountType;
    }
    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    @Override
    public String toString() {
        return accountId + " - CustomerID: " + customerId + " (" + accountType + ")";
    }

    
}

package controller;

import dao.AccountDAO;
import model.Account;
import java.util.List;

public class AccountController {
    private AccountDAO accountDAO = new AccountDAO();

    public List<Account> getAllAccounts() {
        return accountDAO.getAllAccounts();
    }

    public void addAccount(int customerId, String accountType) {
        Account account = new Account(0, customerId, accountType);
        accountDAO.addAccount(account);
    }
}

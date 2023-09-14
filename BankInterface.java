package sbsCode;
import java.util.HashMap;
import java.util.Map;

public class BankInterface {
    private Map<Integer, BankAccount> accounts;

    public BankInterface() {
        accounts = new HashMap<>();
    }

    public void addAccount(BankAccount account) {
        accounts.put(account.getAccountNumber(), account);
    }

    public BankAccount getAccount(int accountNumber) {
        return accounts.get(accountNumber);
    }

}

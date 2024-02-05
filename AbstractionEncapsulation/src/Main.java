public class Main {
    public static void main(String[] args) {
        // Abstraction (verb): the process of hiding your design decisions, and bringing to the front
        //   the important functionality.
        // Abstraction (noun): the explicitly defined interface for working with an object

        // Encapsulation: private everything
        BankAccount account = new BankAccount();

    }
}

enum AccountType {
    Checking,
    Savings
}



class BankAccount {
    private String accountNumber;
    private int routingNumber;

    private String password;

    private double balance;

    private double interestRate;

    private AccountType type; // Checking, Savings

    public BankAccount(long accountNumber, int routingNumber, String password) {
        this.accountNumber = ""+accountNumber;
        this.routingNumber = routingNumber;
        boolean success = changePassword(password);
        // ignore this for now :)
        if (!success) throw new RuntimeException("Password should be better!");
    }

    public long getAccountNumber() {
        return Long.parseLong(accountNumber);
    }

    public int getRoutingNumber() {
        return routingNumber;
    }

    public boolean changePassword(String newPassword)  {
        if (newPassword.equals(password)) return false;
        if (newPassword.length() < 12) return false;
        password = newPassword;
        return true;
    }

    private void checkPassword(String password) {
        if (!this.password.equals(password)) throw new RuntimeException("Something went wrong");
    }

    public double getBalance(String password) {
        checkPassword(password);
        return balance;
    }

    public double withdraw(String password, double amount) {
        checkPassword(password);
        if(balance - amount <= 0) throw new RuntimeException("Something went wrong");
    }

}

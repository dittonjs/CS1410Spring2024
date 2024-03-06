public class Main {
    public static void main(String[] args) {
        Account account = new RothIRA();
        System.out.println(account.getBalance());
    }
}

class Account {
    private double balance;

    public Account() {
        this(0);
    }
    public Account(double balance) {
        System.out.println("Account Constructed");
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }
}

class InterestBearingAccount extends Account {
    public InterestBearingAccount(double balance) {
        super(balance);
        System.out.println("Interest Bearing Account Constructed");
    }
}

class SavingsAccount extends InterestBearingAccount {
    public SavingsAccount() {
        super(0);
        System.out.println("Savings Account Constructed");
    }
}

class RothIRA extends InterestBearingAccount{
    public RothIRA() {
        super(0);
        System.out.println("Roth IRA Constructed");
    }
}


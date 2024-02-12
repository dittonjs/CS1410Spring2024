import com.sun.tools.jconsole.JConsoleContext;

public class Main {
    public static void main(String[] args) {
        CheckingAccount checkingAccount = new CheckingAccount();
        IRA ira = new IRA();
        SavingsAccount savings = new SavingsAccount();
        savings.deposit(4000);
        checkingAccount.deposit(4000);
        ira.deposit(4000);
        makeWithdraw(checkingAccount, 3800);
        System.out.println(checkingAccount.checkBalance());
        makeWithdraw(ira, 3800);
        System.out.println(ira.checkBalance());
        makeWithdraw(savings, 100);
        makeWithdraw(savings, 100);
        makeWithdraw(savings, 100);
        makeWithdraw(savings, 100);
        makeWithdraw(savings, 100);
        makeWithdraw(savings, 100);
        System.out.println(savings.checkBalance());
        if (savings.checkNumWithdraws() < 6) {
            makeWithdraw(savings, 100);
        } else {
            System.out.println("Not withdrawing");
        }
    }

    public static double makeWithdraw(Account account, double amount) {
        return account.withdraw(amount);
    }
}

class Account {

    private int accountNumber = 12323;

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    private double balance = 0.0;

    public void deposit(double amount) {
        balance += amount;
    }

    public double withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            return amount;
        }
        throw new RuntimeException("Not enough balance!");
    }

    public double checkBalance() {
        return balance;
    }

    protected void setBalance(double newBalance) {
        if (newBalance >= 0) {
            balance = newBalance;
        }
    }
}

class CheckingAccount extends Account {

}

class IRA extends Account {

    @Override
    public double withdraw(double amount) {
        double penalty = amount * .1;
        if (amount + penalty <= checkBalance()) {
            setBalance(checkBalance() - (amount + penalty));
            return amount;
        }
        throw new RuntimeException("Not enough balance!");
    }
}

class RothIRA extends Account {
    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}

class SavingsAccount extends Account {
    private int numWithdraws = 0;
    @Override
    public double withdraw(double amount) {
        if (numWithdraws < 6) {
            double withdrawnAmount = super.withdraw(amount);
            numWithdraws ++;
            return withdrawnAmount;
        }
        throw new RuntimeException("You have withdrawn too many times!");
    }

    public int checkNumWithdraws() {
        return numWithdraws;
    }
}

class CDAccount extends SavingsAccount {
}



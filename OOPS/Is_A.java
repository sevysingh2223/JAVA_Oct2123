package OOPS;

class Account {
    double balance;

    Account() {
        System.out.println("Account Class :: Constructor....");
    }

    void deposit() {
        System.out.println("Account Class :: Deposit....");
    }

    void withdraw() {
        System.out.println("Account Class :: WithDraw..");
    }
}

class SavingAccount extends Account {
    // No need for super.deposit() here

    SavingAccount(){
        System.out.println("Saving Class :: Constructor....");
    }

    @Override
    void deposit() {
        System.out.println("SavingAccount Class :: Deposit....");
    }

    void limitOfTrans() {
        System.out.println("SavingAccount Class :: limitOfTrans..");
    }
}

class CurrentAccount extends Account {
    CurrentAccount(){
        System.out.println("CurrentClass Class :: Constructor....");
    }
    @Override
    void deposit(){
        System.out.println("CurrentAccount Class :: Deposit");
    }
    void odLimit() {
        System.out.println("CurrentAccount Class :: odLimit..");
    }
}

public class Is_A {
    public static void main(String[] args) {
        // SavingAccount sa = new SavingAccount();
        // sa.deposit();
        // System.out.println("----------------------");
        // sa.withdraw();
        // System.out.println("----------------------");
        // sa.limitOfTrans();

        Account sa = new SavingAccount();
        sa.deposit();
        System.out.println("----------------------");
        sa.withdraw();
        System.out.println("----------------------");
        // sa.limitOfTrans();
        Account ca = new CurrentAccount();
        ca.deposit();
        System.out.println("----------------------");
        ca.withdraw();
        System.out.println("----------------------");
        // ca.odLimit;

        // SavingAccount sa2 = new Account();
    }
}

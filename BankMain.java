abstract class BankAccount{
    public int balance;
    BankAccount(int balance){
        this.balance=balance;
    }
    public abstract void calculateInterest();
    public void deposit(int amount){
        balance+=amount;
        System.out.println("Deposited: "+amount);
    }
}

class SavingsAccount extends BankAccount{
    SavingsAccount(int balance){
        super(balance);
    }
    @Override
    public void calculateInterest(){
        System.out.println("interest:"+(balance*0.04));
    }
}

class CurrentAccount extends BankAccount{
    CurrentAccount(int balance){
        super(balance);
    }
    @Override
    public void calculateInterest(){
        System.out.println("interest:"+(balance*0.02));
    }
}

public class BankMain {
    public static void main(String [] args){
        BankAccount b = new SavingsAccount(1000);
        b.calculateInterest();
        BankAccount c = new CurrentAccount(2000);
        c.calculateInterest();
        b.deposit(500);
        c.deposit(1000);
    }
}

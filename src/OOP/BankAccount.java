package OOP;

public class BankAccount {
    public String accountHolderName;
    public String accountNumber;
    private double balance;

    public BankAccount(String accountHolderName, String accountNumber,double balance ){
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void withdraw(double amount){
        if(amount > balance){
            System.out.println("Not enough money");
        }
        else{
            balance = balance - amount;
            System.out.println("Balance agter withdraw:" + balance);
        }
    }
    public  void deposit(double amount){
        if(amount < 0){
            System.out.println("you cant deposit negative amount");
        }
        else{
            balance = balance + amount;
            System.out.println("Balance agter deposit:" + amount);

        }
    }

    public void setBalance(double newBalance){
        if (newBalance < 0){
            System.out.println("invalid bal;ance value, the value will not be set");
        }
        else{
            balance = newBalance;
        }
    }
}

package pc2;

public class BankAccount {
    String owner;
    int balance;

    BankAccount(String newOwner, int newBalance){
        this.owner = newOwner;
        this.balance = newBalance;
    }

    String getOwner(){
        return owner;
    }

    int getBalance(){
        return balance;
    }

    void setOwner(String newOwner){
        owner = newOwner;
    }

    public void deposit(int amount){
        balance += amount;
    }

    public void withdraw(int amount){
        balance -= amount;
    }

    public void printBalance(){
        System.out.println("Баланс: " + this.balance);
    }
}

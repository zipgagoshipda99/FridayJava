package Question27;

public class BankAccount {
    String owner;
    int balance;

    BankAccount(String owner, int balance){
        this.owner = owner;
        this.balance = balance;
    }
    
    int transferMoney(BankAccount targetAccount, int amount){
        this.balance -= amount;
        return (targetAccount.balance += this.balance);
    }
}

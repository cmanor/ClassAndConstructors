public class BankAccount {
    private float balance;
    private String name;

    public BankAccount(float balance, String name){
        this.balance = balance;
        this.name = name;
    }

    public void deposit(float amount){
        this.balance += amount;
    }

    public void withdrawal(float amount){
        this.balance -= amount;
    }

    public void details(){
        System.out.println(name + "'s account balance is: " + balance);
    }
}

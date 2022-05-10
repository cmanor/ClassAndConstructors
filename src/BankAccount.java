public class BankAccount {
    private float balance;
    private String name;

    public BankAccount(float balance, String name){
        this.setBalance(balance);
        this.setName(name);
    }

    public void deposit(float amount){
        this.setBalance(this.balance + amount);
    }

    public void withdrawal(float amount){
        this.setBalance(this.balance - amount);
    }

    public void details(){
        System.out.println(name + "'s account balance is: " + balance);
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    public void setName(String name) {
        if (name.equals(""))
            throw new IllegalArgumentException("Please enter a name");
        this.name = name;

    }
}

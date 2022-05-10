public class BankTransfer {
    public static void main(String[] args) {
        var bankAccount = new BankAccount(5000, "Deez");
        var bankAccount2 = new BankAccount(300, "Nuts");
        bankAccount.withdrawal(100);
        bankAccount2.deposit(100);
        bankAccount.details();
        bankAccount2.details();
    }
}

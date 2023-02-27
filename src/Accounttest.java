public class Accounttest {
    public static void main(String[] args) {
        Account account = new Account(1234, 1000, 5);
        CheckingAccount checkingAccount = new CheckingAccount(5678, 2000, 4.5, 500);
        SavingsAccount savingsAccount = new SavingsAccount(9012, 5000, 3.5);

        System.out.println("Account Details:");
        System.out.println(account.toString());


        System.out.println("\nChecking Account Details:");
        System.out.println(checkingAccount.toString());

        System.out.println("\nSavings Account Details:");
        System.out.println(savingsAccount.toString());
    }
}

public class User{
    private String accountNum;
    private double balance;

    public void introduce() {
        System.out.println("Account Number: " + accountNum + " Balance: " + balance);
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposit Successful! Current Balance: " + balance);
    }


    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient Balance!");
        } else {
            balance -= amount;
            System.out.println("Withdraw Successful! Current Balance: " + balance);
        }
    }


    public String getAccountNum() {
        return accountNum;
    }

    public void setAccountNum(String accountNum) {
        this.accountNum = accountNum;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
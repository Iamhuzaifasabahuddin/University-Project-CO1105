import java.util.Date;

public class Account {
    private int accountNumber;
    private double balance;
    private double annualInterestRate;
    private Date dateCreated;

    public Account(int accountNumber, double balance, double annualInterestRate) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.annualInterestRate = annualInterestRate;
        this.dateCreated = new Date();
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        balance -= amount;
    }

    public double getMonthlyInterest() {
        return balance * (annualInterestRate / 12) / 100;
    }

    public String toString() {
        return "Account Number: " + accountNumber + "\nBalance: $" + balance + "\nAnnual Interest Rate: " + annualInterestRate + "%" + "\nDate Created: " + dateCreated;
    }
}

class SavingsAccount extends Account {
    public SavingsAccount(int accountNumber, double balance, double annualInterestRate) {
        super(accountNumber, balance, annualInterestRate);
    }

    public void withdraw(double amount) {
        if (this.getBalance() - amount >= 0) {
            super.withdraw(amount);
        } else {
            System.out.println("Withdrawal amount exceeds overdraft limit.");
        }
    }

    public String toString() {
        return super.toString() + "\nAccount Type: Savings";
    }
}


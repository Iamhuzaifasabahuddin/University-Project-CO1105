class CheckingAccount extends Account {
    private double overdraftLimit;

    public CheckingAccount(int accountNumber, double balance, double annualInterestRate, double overdraftLimit) {
        super(accountNumber, balance, annualInterestRate);
        this.overdraftLimit = overdraftLimit;
    }

    public double getOverdraftLimit() {
        return overdraftLimit;
    }

    public void setOverdraftLimit(double overdraftLimit) {
        this.overdraftLimit = overdraftLimit;
    }

    public void withdraw(double amount) {
        if (this.getBalance() - amount >= -this.overdraftLimit) {
            super.withdraw(amount);
        } else {
            System.out.println("Withdrawal amount exceeds overdraft limit.");
        }
    }


    public String toString() {
        return super.toString() + "\nOverdraft Limit: $" + overdraftLimit;
    }
}

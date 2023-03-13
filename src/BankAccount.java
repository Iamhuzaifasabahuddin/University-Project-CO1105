import java.util.Scanner;

public class BankAccount {
    private String customerId;
    private int accountNumber;
    private double balance;

    public BankAccount() {
        this.customerId = "";
        this.accountNumber = 0;
        this.balance = 0;
    }

    public void addAccount() {
        Scanner input = new Scanner(System.in);
        boolean validCustomerId = false;
        boolean validAccountNumber = false;
        boolean validInitialBalance = false;
        while (!validCustomerId) {
            System.out.print("Enter customer ID (must start with a letter and be followed by three digits): ");
            try {
                String id = input.nextLine();
                if (!id.matches("[A-Za-z]\\d{3}")) {
                    throw new Exception("Invalid customer ID.");
                }
                this.customerId = id;
                validCustomerId = true;
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
        while (!validAccountNumber) {
            System.out.print("Enter account number (must be five digits): ");
            try {
                int number = input.nextInt();
                if (number < 10000 || number > 99999) {
                    throw new Exception("Invalid account number.");
                }
                this.accountNumber = number;
                validAccountNumber = true;
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
                input.nextLine();
            }
        }
        while (!validInitialBalance) {
            System.out.print("Enter initial balance (must be above $1000): ");
            try {
                double balance = input.nextDouble();
                if (balance <= 1000) {
                    throw new Exception("Initial balance must be above $1000.");
                }
                this.balance = balance;
                validInitialBalance = true;
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
                input.nextLine();
            }
        }
        System.out.println("Account created successfully.");
    }

    public String getCustomerId() {
        return this.customerId;
    }

    public int getAccountNumber() {
        return this.accountNumber;
    }

    public double getBalance() {
        return this.balance;
    }

    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        account.addAccount();
    }
}

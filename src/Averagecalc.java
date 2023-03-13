import java.util.Scanner;

public class Averagecalc {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = 0;
        boolean validN = false;
        while (!validN) {
            System.out.print("Enter the value for N: ");
            try {
                N = input.nextInt();
                if (N <= 0) {
                    throw new Exception("N must be positive.");
                }
                validN = true;
            } catch (Exception e) {
                System.out.println("Invalid input. " + e.getMessage());
                input.nextLine();
            }
        }
        int sum = 0;
        int count = 0;
        while (count < N) {
            System.out.print("Enter integer #" + (count + 1) + ": ");
            try {
                int num = input.nextInt();
                sum += num;
                count++;
            } catch (Exception e) {
                System.out.println("Invalid input. Please enter an integer.");
                input.nextLine();
            }
        }
        double average = (double) sum / N;
        System.out.println("The average of the " + N + " integers is " + average);
    }
}

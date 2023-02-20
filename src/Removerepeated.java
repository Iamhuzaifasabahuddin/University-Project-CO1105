import java.util.Scanner;

public class Removerepeated {
    public static void main(String[] args) {
        // Prompt the user to enter a string
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = input.nextLine();

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (sb.indexOf(String.valueOf(c)) == -1) {
                sb.append(c);
            }
        }

        // Display the new string without any repeating characters
        System.out.println("New String: " + sb.toString());
    }
}

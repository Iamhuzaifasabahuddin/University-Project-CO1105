import java.util.Scanner;

public class Genericmain {
    public static void main(String[] args) {
        Genericclass<String> stack = new Genericclass<>();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter five strings:");
        for (int i = 0; i < 5; i++) {
            String str = input.nextLine();
            stack.push(str);
        }
        System.out.println("The strings in reverse order are:");
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }
}

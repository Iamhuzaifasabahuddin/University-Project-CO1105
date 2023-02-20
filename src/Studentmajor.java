import java.util.Scanner;

public class Studentmajor {
    public static void main(String[] args) {
        // Prompt the user to enter two characters
        Scanner input = new Scanner(System.in);
        System.out.print("Enter two characters: ");
        String inputStr = input.nextLine();

        // Extract the major and status from the input
        char majorChar = inputStr.charAt(0);
        char statusChar = inputStr.charAt(1);

        // Define a dictionary mapping major characters to their corresponding majors
        String[] majorArray = {"Mathematics", "Computer Science", "Information Technology"};
        char[] majorCharArr = {'M', 'C', 'I'};

        // Define a dictionary mapping status characters to their corresponding statuses
        String[] statusArray = {"Freshman", "Sophomore", "Junior", "Senior"};
        char[] statusCharArr = {'1', '2', '3', '4'};

        // Look up the major and status from the arrays
        String major = "";
        String status = "";
        for (int i = 0; i < majorCharArr.length; i++) {
            if (majorChar == majorCharArr[i]) {
                major = majorArray[i];
                break;
            }
        }
        for (int i = 0; i < statusCharArr.length; i++) {
            if (statusChar == statusCharArr[i]) {
                status = statusArray[i];
                break;
            }
        }

        // Display the major and status
        if (major.equals("") || status.equals("")) {
            System.out.println("Invalid Input");
        } else {
            System.out.println("Major: " + major);
            System.out.println("Status: " + status);
        }
    }
}

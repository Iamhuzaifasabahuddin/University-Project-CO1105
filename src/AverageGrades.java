import java.util.Scanner;

public class AverageGrades {
    public static double average(int[] grades) {
        int sum = 0;
        for (int grade : grades) {
            sum += grade;
        }
        return (double) sum / grades.length;
    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] grades = new int[20];
        int index = 0;
        System.out.print("Enter a grade (negative number to quit): ");
        int grade = input.nextInt();
        while (grade >= 0 && index < 20) {
            grades[index++] = grade;
            System.out.print("Enter a grade (negative number to quit): ");
            grade = input.nextInt();
        }
        int[] newArray = new int[index];
        for(int i = 0; i < index; i++) {
            newArray[i] = grades[i];
        }
        System.out.println("The average grade is: " + average(newArray));
    }
}

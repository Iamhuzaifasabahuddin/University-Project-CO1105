import java.util.Scanner;
public class XX007 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        // checks if the input is an int
        if(scan.hasNextInt()) {
            // get the number of students
            int numOfStudents = scan.nextInt();
            Student[] students = new Student[numOfStudents];

            for (int i = 0; i < numOfStudents; i++) {
                students[i] = new Student();
                students[i].setId(i + 1);
                // fills the array with the students and their designated id
                System.out.print("Enter first name of student " + (i + 1) + ": ");
                String firstName = scan.next();
                System.out.print("Enter last name of student " + (i + 1) + ": ");
                String lastName = scan.next();
                students[i].setName(firstName, lastName);

                System.out.println("Enter marks for 5 homeworks of student " + (i + 1) + ": ");
                // fills out an array of homework for each student
                int[] homeworks = new int[5];
                for (int j = 0; j < 5; j++) {
                    if (scan.hasNextInt()) {
                        homeworks[j] = scan.nextInt();
                    } else {
                        System.out.println("Enter a valid mark for homework " + (j + 1) + " for student " + (i + 1));
                        scan.next();
                        j--;
                    }
                }
                students[i].setHomeworkMarks(homeworks);
                System.out.print("Enter mark for interim test of student " + (i + 1) + ": ");
                // gets the interim mark of a student
                if (scan.hasNextInt()) {
                    int interimTestMark = scan.nextInt();
                    students[i].setInterimTestMark(interimTestMark);

                    System.out.print("Enter mark for exam of student " + (i + 1) + ": ");
                    // gets the exam marks for the student
                    if (scan.hasNextInt()) {
                        int examMark = scan.nextInt();
                        students[i].setExamMark(examMark);

                        students[i].calculateCourseworkMark();
                        students[i].calculateFinalMark();
                    } else {
                        System.out.println("Enter a valid mark for the exam of student " + (i + 1));
                        scan.next();
                        i--;
                    }
                } else {
                    System.out.println("Enter a valid mark for the interim test of student " + (i + 1));
                    scan.next();
                    i--;
                }
            }
            // prints the students and their details in a tabular format
            System.out.println("ID\tName\tSurname\t Coursework\tExam\tFinalMark");
            for (int i = 0; i < numOfStudents; i++) {
                System.out.println(students[i].getId() + "\t" +
                        students[i].getFirstName() + "\t " + students[i].getLastName() + "\t  "  +
                        Math.round(students[i].getCourseworkMark()) + "%\t\t "  +
                        Math.round(students[i].getExamMark()) + "%\t  " +  Math.round(students[i].getFinalMark()) + "%");

            }

        }else {
            System.out.println("Enter a valid input i.e integer");
        }
    }

    //  input checks have been done hence any wrong type data wll send the user back to resubmit the table/info
}

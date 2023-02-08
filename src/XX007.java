import java.util.Scanner;
public class XX007 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        if(scan.hasNextInt()) {
            int numOfStudents = scan.nextInt();
            Student[] students = new Student[numOfStudents];

            for (int i = 0; i < numOfStudents; i++) {
                students[i] = new Student();
                students[i].setId(i + 1);

                System.out.print("Enter first name of student " + (i + 1) + ": ");
                String firstName = scan.next();
                System.out.print("Enter last name of student " + (i + 1) + ": ");
                String lastName = scan.next();
                students[i].setName(firstName, lastName);

                System.out.println("Enter marks for 5 homeworks of student " + (i + 1) + ": ");
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
                if (scan.hasNextInt()) {
                    int interimTestMark = scan.nextInt();
                    students[i].setInterimTestMark(interimTestMark);

                    System.out.print("Enter mark for exam of student " + (i + 1) + ": ");
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
            System.out.println("ID\tName\tSurname\tCoursework\tExam\tFinalMark");
            for (int i = 0; i < numOfStudents; i++) {
                System.out.println(students[i].getId() + "\t" +
                        students[i].getFirstName() + "\t " + students[i].getLastName() + "\t " +
                        students[i].getCourseworkMark() + "%\t\t" +
                        students[i].getExamMark() + "%\t " + students[i].getFinalMark() + "%");

            }

        }else {
            System.out.println("Enter a valid input i.e integer");
        }
    }

}

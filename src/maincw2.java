
import java.util.InputMismatchException;
import java.util.Scanner;


public class maincw2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter the number of students: ");
            int numStudents = scanner.nextInt();
            Studentcw2[] students = new Studentcw2[numStudents];
            for (int i = 0; i < numStudents; i++) {
                System.out.println("\nStudent " + (i + 1) + ":");
                System.out.print("ID: ");
                int id = scanner.nextInt();
                System.out.print("First Name: ");
                String firstName = scanner.next();
                System.out.print("Last Name: ");
                String lastName = scanner.next();
                System.out.print("CW001 Name: ");
                String cw001Name = scanner.next();
                System.out.print("Homework 1 Mark: ");
                double hw1 = scanner.nextDouble();
                System.out.print("Homework 2 Mark: ");
                double hw2 = scanner.nextDouble();
                System.out.print("Homework 3 Mark: ");
                double hw3 = scanner.nextDouble();
                System.out.print("Final Project Mark: ");
                double fp = scanner.nextDouble();
                Courseworkcw2 cw001 = new Courseworkcw2(cw001Name, hw1, hw2, hw3, fp);
                System.out.print("EX002 Name: ");
                String ex002Name = scanner.next();
                System.out.print("Exam Mark: ");
                double exam = scanner.nextDouble();
                Examscw2 ex002 = new Examscw2(ex002Name, exam);
                System.out.print("CE003 Name: ");
                String ce003Name = scanner.next();
                System.out.print("Homework 1 Mark: ");
                double hw1ec = scanner.nextDouble();
                System.out.print("Homework 2 Mark: ");
                double hw2ec = scanner.nextDouble();
                System.out.print("Homework 3 Mark: ");
                double hw3ec = scanner.nextDouble();
                System.out.print("Homework 4 Mark: ");
                double hw4ec = scanner.nextDouble();
                System.out.print("Exam Mark: ");
                double ex = scanner.nextDouble();
                Examsandcourseworkcw2 ce003 = new Examsandcourseworkcw2(ce003Name, hw1ec, hw2ec, hw3ec, hw4ec, ex);
                students[i] = new Studentcw2(id, firstName, lastName, cw001, ex002, ce003);
            }

            boolean exit = false;
            while (!exit) {
                System.out.print("Enter module code (CW001, EX002, CE003) or 'ALL' or EXIT': ");
                String moduleCode = scanner.next().toUpperCase();
                switch (moduleCode) {
                    case "EXIT" -> exit = true;
                    case "ALL" -> {
                        System.out.println("\nFirst Name\tLast Name\tCW001 Mark\tEX002 Mark\tCE003 Mark");
                        for (Studentcw2 student : students) {
                            System.out.print(student.getFirstName() + "\t\t");
                            System.out.print(student.getLastName() + "\t\t\t");
                            student.printAllMarks();

                        }
                    }
                    case "CW001", "EX002", "CE003" -> {
                        System.out.println("\nFirst Name\tLast Name\t" + moduleCode + " Mark");
                        for (Studentcw2 student : students) {
                            System.out.print(student.getFirstName() + "\t\t");
                            System.out.print(student.getLastName() + "\t\t\t");
                            student.printModuleMark(moduleCode);
                        }
                    }
                    default -> System.out.print("\n\t\t\t\tInvalid module code\n".toUpperCase());
                }
            }
            System.out.print("exiting the program".toUpperCase());
        }
        catch (InputMismatchException e){
            System.out.println("Wrong data type entered");
            System.out.println("Try again perhaps");
        }
        catch (Exception e){
            System.out.println("Uh-oh something went wrong");
            System.out.println("Try again perhaps");
        }
    }
}

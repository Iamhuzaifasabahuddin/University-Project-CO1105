import java.util.Date;

public class Lab6test {
    public static void main(String[] args) {
        // create a Person object
        personpt2 person = new personpt2("John Smith", "123 Main St", "555-1234", "john.smith@example.com");
        System.out.println(person.toString());

        // create a Student object
        studentpt2 student = new studentpt2("Jane Smith", "456 Oak St", "555-5678", "jane.smith@example.com", studentpt2.SOPHOMORE);
        System.out.println(student.toString());

        // create an Employee object
        Date dateHired = new Date(121, 8, 1); // September 1, 2021
        Employee employee = new Employee("Bob Johnson", "789 Maple St", "555-9012", "bob.johnson@example.com", "Admin Building, Room 201", 60000.0, dateHired);
        System.out.println(employee.toString());

        // create a Faculty object
        faculty faculty = new faculty("Mary Williams", "345 Pine St", "555-3456", "mary.williams@example.com", "Science Building, Room 301", 90000.0, dateHired, "Tue 2-3pm, Thu 10-11am", "Professor");
        System.out.println(faculty.toString());

        // create a Staff object
        Staff staff = new Staff("Tom Davis", "678 Elm St", "555-7890", "tom.davis@example.com", "Library, Room 102", 45000.0, dateHired, "Librarian");
        System.out.println(staff.toString());
    }
}


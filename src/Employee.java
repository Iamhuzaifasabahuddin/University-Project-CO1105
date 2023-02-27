import java.util.Date;
class Employee extends personpt2 {
    private String office;
    private double salary;
    private Date dateHired;

    public Employee(String name, String address, String phoneNumber, String emailAddress, String office, double salary, Date dateHired) {
        super(name, address, phoneNumber, emailAddress);
        this.office = office;
        this.salary = salary;
        this.dateHired = dateHired;
    }

    public String getOffice() {
        return office;
    }

    public double getSalary() {
        return salary;
    }

    public Date getDateHired() {
        return dateHired;
    }

    @Override
    public String toString() {
        return super.toString() + ", office: " + office + ", salary: " + salary + ", date hired: " + dateHired;
    }
}

import java.util.Date;
class faculty extends Employee {
    private String officeHours;
    private String rank;

    public faculty(String name, String address, String phoneNumber, String emailAddress, String office, double salary, Date dateHired, String officeHours, String rank) {
        super(name, address, phoneNumber, emailAddress, office, salary, dateHired);
        this.officeHours = officeHours;
        this.rank = rank;
    }

    public String getOfficeHours() {
        return officeHours;
    }

    public String getRank() {
        return rank;
    }

    @Override
    public String toString() {
        return super.toString() + ", office hours: " + officeHours + ", rank: " + rank;
    }
}

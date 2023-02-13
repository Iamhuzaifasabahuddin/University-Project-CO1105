public class Contact {
    private String name;
    private String address;
    private String phoneNumber;
    public Contact(String nam, String num) {
        this.name = nam;
        this.phoneNumber = num;
    }
    public Contact(String nam, String add, String num) {
        this.name = nam;
        this.phoneNumber = num;
        this.address = add;
    }
    public void printDetails() {
        System.out.println(this.name);
        System.out.println(this.address);
        System.out.println(this.phoneNumber);

    }
}
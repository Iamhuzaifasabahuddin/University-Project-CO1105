public class Contactdetails {
    public static void main(String[] args) {
        Contact contact1 = new Contact("Claudio De Sio Cesari", "13","Java Street");
        Contact contact2 = new Contact("Stevie Wonder", "10 Music Avenue", "1010101010");
        Contact contact3 = new Contact("Gennaro Capuozzo", "1,Four Days of Naples Square", "1111111111");

        System.out.println("Contacts List: ");
        contact1.printDetails();
        System.out.println();
        contact2.printDetails();
        System.out.println();
        contact3.printDetails();

    }
}
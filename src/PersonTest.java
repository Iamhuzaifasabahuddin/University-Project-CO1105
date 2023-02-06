public class PersonTest {
    public static void main(String args[]) {
        Person person1 = new Person();
        person1.setName("John");
        person1.setSurname("Doe");
        person1.setAge(30);

        Person person2 = new Person();
        person2.setName("Jane");
        person2.setSurname("Doe");
        person2.setAge(25);

        Person person3 = person1;

        System.out.println("Person 1 details: " + person1.details());
        System.out.println("Person 2 details: " + person2.details());
        System.out.println("Person 3 details: " + person3.details());
    }
}



public class Studentcw2 {
    private int id;
    private String firstName;
    private String lastName;
    private Courseworkcw2 cw001;
    private Examscw2 ex002;
    private Examsandcourseworkcw2 ce003;

    public Studentcw2(int id, String firstName, String lastName, Courseworkcw2 cw001, Examscw2 ex002, Examsandcourseworkcw2 ce003) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.cw001 = cw001;
        this.ex002 = ex002;
        this.ce003 = ce003;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Courseworkcw2 getCW001() {
        return cw001;
    }

    public void setCW001(Courseworkcw2 cw001) {
        this.cw001 = cw001;
    }

    public Examscw2 getEX002() {
        return ex002;
    }

    public void setEX002(Examscw2 ex002) {
        this.ex002 = ex002;
    }

    public Examsandcourseworkcw2 getCE003() {
        return ce003;
    }

    public void setCE003(Examsandcourseworkcw2 ce003) {
        this.ce003 = ce003;
    }

    public double getCW001Mark() {
        return cw001.calculateFinalMark();
    }

    public double getEX002Mark() {
        return ex002.calculateFinalMark();
    }

    public double getCE003Mark() {
        return ce003.calculateFinalMark();
    }

    public void printAllMarks() {
        System.out.println((Math.round(getCW001Mark())) + "%\t\t\t" + (Math.round(getEX002Mark()) + "%\t\t\t" + Math.round(getCE003Mark())) + "%");

    }

    public void printModuleMark(String moduleCode) {
        switch (moduleCode) {
            case "CW001" -> System.out.println(Math.round(getCW001Mark()) + "%");
            case "EX002" -> System.out.println(Math.round(getEX002Mark()) + "%");
            case "CE003" -> System.out.println(Math.round(getCE003Mark()) + "%");
            default -> System.out.println("Invalid module code");
        }
    }
}

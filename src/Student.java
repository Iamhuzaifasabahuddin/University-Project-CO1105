import java.util.Arrays;
public class Student {
    private int id;
    private String firstName;
    private String surname;
    private int[] homeworkMarks = new int[5];
    private int interimTestMark;
    private double courseworkMark;
    private int examMark;
    private double finalMark;

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String firstName, String surname) {

        this.firstName = firstName;
        this.surname = surname;
    }

    public void setHomeworkMarks(int[] homeworkMarks) {
        this.homeworkMarks = homeworkMarks;
    }

    public void setInterimTestMark(int interimTestMark) {
        this.interimTestMark = interimTestMark;
    }

    public void setExamMark(int examMark) {
        this.examMark = examMark;
    }

    public void calculateCourseworkMark() {
        Arrays.sort(homeworkMarks);
        double sum = 0;
        for (int i = 2; i >=0; i--) {
            sum += i;
        }
        this.courseworkMark =(sum/3) + interimTestMark;
    }

    public void calculateFinalMark() {
        this.finalMark = 0.3*courseworkMark + 0.7 * examMark;
    }

    public int getId() {
        return id;
    }

    public double getFinalMark() {
        return  finalMark;
    }

    public double getCourseworkMark() {
        return courseworkMark;
    }
    public double getExamMark() {
        return examMark;
    }

    public String getName() {
        return firstName + "\t\t" + surname;
    }

    public int getInterimTestMark() {
        return interimTestMark;
    }

    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return surname;
    }
}

import java.util.Arrays;
public class Student {
    private int id;
    private String firstName;
    private String lastName;
    private int[] homeworkMarks = new int[5];
    private int interimTestMark;
    private double courseworkMark;
    private int examMark;
    private double finalMark;

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setName(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setHomeworkMarks(int[] homeworkMarks) {
        this.homeworkMarks = homeworkMarks;
    }

    public int[] getHomeworkMarks() {
        return homeworkMarks;
    }

    public void setInterimTestMark(int interimTestMark) {
        this.interimTestMark = interimTestMark;
    }

    public int getInterimTestMark() {
        return interimTestMark;
    }

    public void setExamMark(int examMark) {
        this.examMark = examMark;
    }

    public int getExamMark() {
        return examMark;
    }

    public double getCourseworkMark() {
        return courseworkMark;
    }

    public double getFinalMark() {
        return finalMark;
    }

    public void calculateCourseworkMark() {
        // calculates the coursework marks
        Arrays.sort(homeworkMarks);
        // sorts the array and intakes the last three values (index 4 to 2)
        double sum = 0;
        for (int i = 4; i >= 0; i--) {
            if (i < 2) {
                break;
            }
            sum += homeworkMarks[i];
        }
        courseworkMark = (0.10 * sum) + (0.20 * interimTestMark);
    }

    public void calculateFinalMark() {
        // Calculate the final marks
        finalMark = 0.70 * examMark + 0.30 * courseworkMark;
    }
}
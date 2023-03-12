public class Examsandcourseworkcw2 extends Modulecw2 {
    private double homework1Mark;
    private double homework2Mark;
    private double homework3Mark;
    private double homework4Mark;
    private double examMark;

    public Examsandcourseworkcw2(String name, double homework1Mark, double homework2Mark, double homework3Mark, double homework4Mark, double examMark) {
        super(name, 2, 0.0);
        this.homework1Mark = homework1Mark;
        this.homework2Mark = homework2Mark;
        this.homework3Mark = homework3Mark;
        this.homework4Mark = homework4Mark;
        this.examMark = examMark;
    }

    public double getHomework1Mark() {
        return homework1Mark;
    }

    public double getHomework2Mark() {
        return homework2Mark;
    }

    public double getHomework3Mark() {
        return homework3Mark;
    }



    public double getHomework4Mark() {
        return homework4Mark;
    }

    public double getExamMark() {
        return examMark;
    }

    public double getaverage(){
        double averageHomeworkMark = (homework1Mark + homework2Mark + homework3Mark + homework4Mark) / 4.0;
        return averageHomeworkMark;
    }
    @Override
    public double calculateFinalMark() {

        return  getaverage()*0.4 + (examMark * 0.6);
    }

}

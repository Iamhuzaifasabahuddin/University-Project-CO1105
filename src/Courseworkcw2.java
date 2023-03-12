public class Courseworkcw2 extends Modulecw2 {
    private double homework1Mark;
    private double homework2Mark;
    private double homework3Mark;
    private double finalProjectMark;

    public Courseworkcw2(String name, double homework1Mark, double homework2Mark, double homework3Mark, double finalProjectMark) {
        super(name, 0, 0.0);
        this.homework1Mark = homework1Mark;
        this.homework2Mark = homework2Mark;
        this.homework3Mark = homework3Mark;
        this.finalProjectMark = finalProjectMark;
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

    public double getFinalProjectMark() {
        return finalProjectMark;
    }

    public double gethomeworkavg(){
        double averageHomeworkMark = (homework1Mark + homework2Mark + homework3Mark) / 3.0;
        return averageHomeworkMark;
    }

    @Override
    public double calculateFinalMark() {
        return gethomeworkavg()*0.5 + (finalProjectMark * 0.5);
    }


}



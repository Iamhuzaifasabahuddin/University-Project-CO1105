public class Examscw2 extends Modulecw2 {
    private double examMark;

    public Examscw2(String name, double examMark) {
        super(name, 1, 0.0);
        this.examMark = examMark;
    }

    public double getExamMark() {
        return examMark;
    }

    @Override
    public double calculateFinalMark() {
        return examMark;
    }


}

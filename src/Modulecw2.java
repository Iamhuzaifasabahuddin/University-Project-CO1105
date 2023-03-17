public abstract class Modulecw2 {
    private String name;
    private int status;
    private double finalMark;

    public Modulecw2(String name, int status, double finalMark) {
        this.name = name;
        this.status = status;
        this.finalMark = finalMark;
    }
    public String getName() {
        return name;
    }

    public int getStatus() {
        return status;
    }

    public double getFinalMark() {
        return finalMark;
    }
    public abstract double calculateFinalMark();

    public void displayModuleInfo() {
        System.out.println("Module Name: " + name);
        System.out.println("Status: " + getStatusString());
        System.out.println("Final Mark: " + finalMark);
    }

    private String getStatusString() {
        return switch (status) {
            case 0 -> "Coursework Only";
            case 1 -> "Exam Only";
            case 2 -> "Coursework and Exam";
            default -> "Unknown";
        };
    }
}

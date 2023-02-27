public class Trianglepttest {
    public static void main(String[] args){
        Trianglept2 triangle = new Trianglept2();
        triangle.setSide1(10);
        triangle.setSide2(5);
        triangle.setSide3(15);
        triangle.setColor("Red");
        triangle.setfilled(true);
        System.out.println(triangle.toString());
    }
}

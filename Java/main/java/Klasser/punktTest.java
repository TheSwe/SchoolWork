package Klasser;

public class punktTest {
    public static void main(String[] args) {
        Punkt punkt1 = new Punkt(2,2);
        System.out.println(punkt1.ToString());
        punkt1.setX(4);
        System.out.println(punkt1.ToString());
        System.out.println(punkt1.getX());
    }
}

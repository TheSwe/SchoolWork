package main.java.Klasser;

import Klasser.*;

public class rektangelTest {
    public static void main(String[] args) {
        FillableRectangle test = new FillableRectangle();
        System.out.println(test.toString());
        FillableRectangle test2 = new FillableRectangle(1, 2 , 4, 5);
        System.out.println(test2.toString());
        System.out.println(test2.area());
    }
}

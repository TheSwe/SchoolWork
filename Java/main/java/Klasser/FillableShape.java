package main.java.Klasser;

public abstract class FillableShape {
    boolean isFilled;
    abstract float area();
    abstract float circumference();
    abstract void fill();
    abstract boolean isFilled();
}

package Klasser;

import Klasser.*;

public class FillableRectangle extends FillableShape {
    //Gör en klass Fyrkant. 
    //En Fyrkant har två punkter. 
    //Gör en konstrukrtor, get/set för startpoint, endpoint, toString samt metoden Area
    private Punkt startPoint;
    private Punkt endPoint;
    public FillableRectangle(Punkt startPoint,Punkt endPoint) {
        this.startPoint = startPoint;
        this.endPoint = endPoint;
    }
    public FillableRectangle(){
        this.startPoint = new Punkt();
        this.endPoint = new Punkt();
    }
    public FillableRectangle(int startX,int startY,int endX,int endY){
        this.startPoint = new Punkt(startX,startY);
        this.endPoint = new Punkt(endX,endY);
    }
    public int getStartPoint() {
        return startPoint;
    }
    public int getEndPoint() {
        return endPoint;
    }
    public void setStartPoint(int x, int y) {
        this.startPoint.Punkt(x, y);
    }
    public void setEndPoint(int x, int y) {
        this.endPoint.Punkt(x, y);
    }
    public String toString() {
        return "Startpoint: " + startPoint.toString() + ", endPoint: " + endPoint.toString();
    }
    @Override
    public float area() {
        int side1 = startPoint.getX()-endPoint.getX();
        int side2 = startPoint.getY()-endPoint.getY();
        return side1 * side2;
    }

}


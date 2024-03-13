package main.java.Klasser;

import Klasser.*;

public class Rektangel {
    //Gör en klass Fyrkant. 
    //En Fyrkant har två punkter. 
    //Gör en konstrukrtor, get/set för startpoint, endpoint, toString samt metoden Area
    private Punkt startPoint;
    private Punkt endPoint;
    public Rektangel(Punkt startPoint,Punkt endPoint) {
        this.startPoint = startPoint;
        this.endPoint = endPoint;
    }
    public Rektangel(){
        this.startPoint = new Punkt();
        this.endPoint = new Punkt();
    }
    public Rektangel(int startX,int startY,int endX,int endY){
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
}

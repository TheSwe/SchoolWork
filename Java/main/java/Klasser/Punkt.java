package Klasser;

public class Punkt {
    private int x;
    private int y;

    public Punkt(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public Punkt(){
        this.x = 0;
        this.y = 0;
    }
    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }
    public void setX(int x) {
        this.x = x;
    }
    public void setY(int y) {
        this.y = y;
    }
    public String toString(){
        String str = "(" + x + ", " + y + ")";
        return str;
        }
    public float distans(Punkt p){
        int xdist = this.x - p.x;
        int ydist = this.y - p.y;
        float dist = (float)Math.sqrt(Math.pow(xdist, 2) + Math.pow(ydist, 2));
        return dist;
    }
}

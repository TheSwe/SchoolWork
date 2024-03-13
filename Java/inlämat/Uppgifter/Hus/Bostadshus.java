package main.java.Hus;

//Arvid Kågedal
//Te21A

public abstract class Bostadshus extends Hus{
    /*Bostadshus är en typ av hus. För alla bostadshus finns ett antal inneboende samt bostadsyta. */
    private int antalInneboende;
    private float bostadsyta;

    //super beskriver att metoden som kallas är från klassen den aktuella klassen förlänger, i detta fallet hus
    public Bostadshus(String kommun, String adress, int antalInneboende, int bostadsyta){
        super(kommun, adress);
        this.antalInneboende = antalInneboende;
        this.bostadsyta = bostadsyta; 
    }
    
    //toString som kan användas av subklasser och som också kallar superklassens toString för att inkludera de variablerna som kommer ifrån superklassen
    public String toString(){
        String line1 = super.toString();
        String line2 = "Antal inneboende: " + antalInneboende + ", bostadsyta: " + bostadsyta;
        return line1 + System.lineSeparator() + line2;
    }
    //basic get och set metoder som kan förändras för ökad funktionalitet
    public int getAntalInneboende() {
        return antalInneboende;
    }

    public float getBostadsyta() {
        return bostadsyta;
    }

    public void setAntalInneboende(float antalInneboende) {
        this.antalInneboende = antalInneboende;
    }

    public void setBostadsyta(float bostadsyta) {
        this.bostadsyta = bostadsyta;
    }
}

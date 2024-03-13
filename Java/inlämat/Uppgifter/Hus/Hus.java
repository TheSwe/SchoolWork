package main.java.Hus;

//Arvid Kågedal
//Te21A

public abstract class Hus {
    /*Alla hus har som land sverige och kan inte byta land, har en kommun och har en adress.
    Alla Hus har även en driftskostnad.  */
    //public gör att varibeln är tillgänglig för alla filer, eftersom det är samma för alla hus finns ingen anledning att skydda, 
    //static gör att värdet är samma för alla instanser av klassen och final gör att värdet inte kan ändras på
    //de vaiabler som är private är det för att inte vem som helst ska kunna ha tillgång till dem då det är privat information
    public static final String LAND = "Sverige";
    private String kommun;
    private String adress;

    //tvingar klasser som inte är abstrakta och förlänger denna att skapa metoden getDriftskostnad 
    public abstract float getDriftskostnad();

    //gör en konstukor för klassen hus som subklasser kan använda när de instansieras
    public Hus(String kommun, String adress) {
        this.kommun = kommun;
        this.adress = adress;
    }

    //gör en tostring för klassen vilken kan användas av subklasser när de ska printas
    public String toString() {
        return "Land: "+LAND+", adress: "+ adress+", kommun: "+kommun+".";
    }

    //get och set metoder för att andra klasser ska kunna ändra och få tillgång till värdena, i en verklig implemenering skulle man kunna kolla vem det är som vill ändra värdena och sedan bara låta de med tillgång ändra och läsa värdena
    public String getkommun() {
        return kommun;
    }

    public String getadress() {
        return adress;
    }

    public void setkommun(String kommun) {
        this.kommun = kommun;
    }

    public void setadress(String adress) {
        this.adress = adress;
    }
}

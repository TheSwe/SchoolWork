package main.java.Hus;

//Arvid Kågedal
//Te21A

public class Lagenhet extends Bostadshus{
    /*Lagenhet   är en typ av bostadshus. 
    varje lagenhet har en hyra. Kostnaden för en lägenhet är hyran/(antal inneboende) + 100*bostadsytan; */
    private int hyra;

    //@override gör att metoden skriver över den motod som kapades i den abstracta klassen hus
    @Override
    public float getDriftskostnad(){
        float kostnad = hyra/super.getAntalInneboende() + 100*super.getBostadsyta();
        return kostnad;
    }
    public Lagenhet(int hyra, int antalInneboende, int bostadsyta, String kommun, String adress){
        super(kommun, adress, antalInneboende, bostadsyta);
        this.hyra = hyra;
    }
    public String toString() {
        String line1 = "Lagehet:";
        String line2 = "Hyra: "+hyra;
        String line3 = super.toString();
        return line1 + System.lineSeparator() + line2 + System.lineSeparator() + line3;
    }

    public int getHyra(){
        return hyra;
    }
    
    public void setHyra(int hyra) {
        this.hyra = hyra;
    }
}

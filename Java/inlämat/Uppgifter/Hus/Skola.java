package main.java.Hus;

//Arvid Kågedal
//Te21A

public class Skola extends Hus{
    /*En skola är ett typ av hus och har ett antal klassrum och en boolean aula. 
    Kostnaden är 2000kr för en aula + antal klassrum * 250 kr */
    private int klassrum;
    private boolean aula = false;

    Skola(int klassrum, boolean aula, String kommun, String adress){
        super(kommun, adress);
        this.klassrum = klassrum;
        this.aula = aula;
    }
    Skola(int klassrum, String kommun, String adress){
        super(kommun, adress);
        this.klassrum = klassrum;
    }

    @Override
    public float getDriftskostnad() {
        float kostnad = (aula) ? 2000 :  0;
        kostnad += klassrum * 250;
        return kostnad;
    }

    public String toString() {
        String line1 = "Skola:";
        String line2 = super.toString();
        String line3 = "Klassrum: " + klassrum + ", aula finns"+((aula)? "":" inte") + ".";
        return line1 + System.lineSeparator() + line2 + System.lineSeparator() + line3;
    }

    public int getKlassrum() {
        return klassrum;
    }

    public boolean getAula() {
        return aula;
    }

    public void setKlassrum(int klassrum) {
        this.klassrum = klassrum;
    }

    public void setAula(boolean aula) {
        this.aula = aula;
    }
}
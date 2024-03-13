package main.java.Hus;

//Arvid Kågedal
//Te21A

public class Villa extends Bostadshus{
    /*Villa är en typ av bostadshus. En villa har eller har inte ett garage, har en tomt yta samt har ett antal plan. 
    kostnaden för en villa är 
    150 * bostadsyta * (antal plan/ antal inneboende ) + 50 * tomt yta 
    dra bort 500 för garage */
    private boolean harGarage = false;
    private float tomtYta;
    private int antalPlan;

    @Override
    public float getDriftskostnad(){
        float kostnad = (harGarage) ? -500 : 0;
        kostnad = kostnad + 150 * super.getBostadsyta() * ((float)antalPlan/super.getAntalInneboende()) + 50 * tomtYta;
        kostnad = (kostnad > 0) ? kostnad : 0;
        return kostnad;
    }

    //två konstruktorer för att kunna ta emot olika inputs
    public Villa(boolean harGarage, int tomtYta, int antalPlan, int antalInneboende, int bostadsyta, String kommun, String adress){
        this(tomtYta, antalPlan, antalInneboende, bostadsyta, kommun, adress);
        this.harGarage = harGarage;
    }

    public Villa(int tomtYta, int antalPlan, int antalInneboende, int bostadsyta, String kommun, String adress){
        super(kommun, adress, antalInneboende, bostadsyta);
        this.tomtYta = tomtYta;
        this.antalPlan = antalPlan;
    }

    //shorthand if för att skriva ut om garage finns eller inte lite snyggare än att säga true eller false
    public String toString(){
        String line1 = "Villa:";
        String line2 = "Garage finns"+((harGarage)? "":"inte")+", tomtYta: "+tomtYta+ ", antalPlan: "+antalPlan;
        String line3 = super.toString();
        return line1 + System.lineSeparator() + line2 + System.lineSeparator() + line3;
    }

    public boolean getHarGarage(){
        return harGarage;
    }

    public float getTomtYta(){
        return tomtYta;
    }

    public int getAntalPlan(){
        return antalPlan;
    }

    public void setAntalPlan(int antalPlan){
        this.antalPlan = antalPlan;
    }

    public void setTomtYta(float tomtYta){
        this.tomtYta = tomtYta;
    }

    public void setHarGarage(boolean harGarage){
        this.harGarage = harGarage;
    }
}

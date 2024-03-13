package main.java.Hus;

//Arvid Kågedal
//Te21A

import java.util.ArrayList;

public class Tia_Hus {

    public static void main(String[] args) {
        ArrayList<Hus> husen = new ArrayList<>();       
        husen.add(new Skola(10,"Staden","Gata 3"));
        husen.add(new Skola(20,true,"Staden","Gata 12"));
        System.out.println("Skolorna kostar: " + getKostnad(husen));
        printaHusen(husen);
        
        //level 2 c+        
        
        System.out.println("--------------- Level 2 ---------------");
        husen.add(new Villa(true, 4,3, 4, 20, "Staden", "Gata 1"));
        husen.add(new Villa(200, 2, 4,25, "Staden", "Gata 2"));
        husen.add(new Lagenhet(400,2, 10, "Staden", "Gata 7"));
        husen.add(new Lagenhet(2000, 4,30, "Staden", "Gata 8"));
        husen.add(new Lagenhet(500, 5,15, "Staden", "Gata 9"));
        System.out.println("Kostnad för skolor samt alla bostadshus: " + getKostnad(husen));
        printaHusen(husen);   
    }

    private static double getKostnad(ArrayList<Hus> husen) {
        double kostnad=0, tmpKost=0;
        for (Hus hus : husen) {
            tmpKost = hus.getDriftskostnad();
            if(tmpKost < 0){
                throw new IllegalArgumentException();
            }
            kostnad+=tmpKost;
        }
        return kostnad;
    }
    
    private static void printaHusen(ArrayList<Hus> husen) {
        for (Hus hus : husen) {
            System.out.println(hus + "\tmed en driftskostnad på "+hus.getDriftskostnad()+" kr");
        }
    }
}
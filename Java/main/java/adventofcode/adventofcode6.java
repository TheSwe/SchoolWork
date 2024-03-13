package main.java.tilprr.tilprr;
import java.util.Scanner;
public class adventofcode6 {
    public static void main(String[] args) {
        double[] times = {54946592};
        double[] dist = {302147610291404.0};
        double takentime = 0;
        double traveldist = 0;
        double traveltime = 0;
        double wins = 0;
        double winsmult = 1;
        
        for (double j=0; j<times[0];j++){
            traveltime = times[0]-j;
            traveldist = j*traveltime;
            if (traveldist>dist[0]){
                wins++;
            }
        }
        System.out.println(wins);
        /* 
        for (int i=0; i<times.length; i++){
            
            for (int j=0; j<times[i];j++){
                traveltime = times[i]-j;
                traveldist = j*traveltime;
                if (traveldist>dist[i]){
                    wins++;
                }
            }
            winsmult = wins*winsmult;
            wins = 0;
            
        }
        System.out.println(winsmult);
        */
    }
}

package practice;
import java.util.*;
import java.lang.Math;

public class AvarageOfMovies {

    public static double calculation (int [] rating){
        int sum = 0;

        for (int i=0; i<rating.length; i++){
            sum += rating[i];
        }

    return (double) sum / rating.length;
    }
    public static void main (String []args){

        int [] MovieA = {1,2,4};
        int [] MovieB = {2,2,4};
        int [] MovieC = {4,4,4};

        double avgA,avgB,avgC;

        avgA = calculation(MovieA);
        avgB = calculation(MovieB);
        avgC = calculation(MovieC);

        System.out.println("avrage for A " + avgA);
        System.out.println("AVrage for B " +avgB );
        System.out.println("avrage for C "+ avgC);

        double highest = Math.max(avgA,Math.max(avgB,avgC));
        double lowest = Math.min(avgA, Math.min(avgB,avgC));

        System.out.println("high avrage " +highest);
        System.out.println("low abrage " +lowest);

    }
    
}

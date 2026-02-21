package practice;
import java.util.*;

public class movie {
    
    public static double calculation (int [] rating){
        int sum = 0;

        for (int i=0; i<rating.length; i++){
            sum += rating[i];
        }

        return (double) sum/rating.length;
    }

    public static void main (String [] args){

        int [][] movie = {{1,1,4},{4,4,1},{3,2,1}};

        double highest = -1;
        double lowest = 100;
        int highestMovie = 0;
        int LowestMovie = 0;

        for (int i=0; i<movie.length; i++){
            double avg = calculation(movie[i]);
            System.out.println("movie : "+(i+1)+" avrage : "+avg);

            if (avg > highest){
                highest = avg;
                highestMovie = (i+1);
            }

            if (avg < lowest){
                lowest = avg;
                LowestMovie = (i+1);
            }
        }

        System.out.println("highest avrage : "+highest +"movie number : "+highestMovie);
        System.out.println("lowest avrage : "+lowest +" movie number : "+LowestMovie);


    }
    
}

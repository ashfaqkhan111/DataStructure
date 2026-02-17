package jobsheet1;

import java.util.*;

public class RepetitionOfNumbers {
    public static void main (String []args){
        
        NumberCounting();

    } 

    public static void NumberCounting(){ // i used another function the i call it in main
    
        // NIM 254107020262

        int n = 62 ;

        if (n < 10){
            n +=10;
        }

        for (int i = 0; i < n; i++){
            if (i==10 || i==15){
                continue;
            }
        
            if (i%3 ==0){
                System.out.print("#"); 
            }
            else if (i%2 ==0){
                System.out.print(i);
            }
            else{
                System.out.print("*");
            }
        }
    }
}

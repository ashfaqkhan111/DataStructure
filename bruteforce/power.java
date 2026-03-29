package bruteforce;
import java.util.*;
public class power {
    public static void main (String [] args){
        Scanner in = new Scanner(System.in);

        System.out.print("Enter base : ");
        int base = in.nextInt();

        System.out.print("Enter wxponent : ");
        int exponent = in.nextInt();

        int result = 1;

        for (int i=0; i<exponent; i++){

            result = result *base;

            System.out.print(result + " ");
        }

        
    }
    
}

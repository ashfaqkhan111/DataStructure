package jobsheet5.factorial;
import java.util.*;

public class FactorialMain {
    public static void main (String [] args){
        Scanner in = new Scanner (System.in);

        System.out.print("Enter number : ");
        int y = in.nextInt();

        Factorial f = new Factorial();

        int resultBF = f.factorialBf(y);

        int resultDC = f.factorialDc(y);

        System.out.println("the result for Brute force : "+resultBF);
        System.out.println("result for Divide and conqurer : "+resultDC);
    }
}

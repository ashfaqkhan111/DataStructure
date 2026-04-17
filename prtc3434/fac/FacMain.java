package prtc3434.fac;
import java.util.*;

import bruteforce.factorial;
public class FacMain {
    public static void main (String[]args){
        Scanner in = new Scanner (System.in);

        System.out.print("enter number : ");
        int n = in.nextInt();

        Fac obj1 = new Fac();
        System.out.println("=====void=====");
        obj1.factorial1(n);

        System.out.println("=====return=====");

       double result = obj1.factorial2(n);
       System.out.println(" "+result);

       System.out.println("=====static====");

       Fac.factorial3(n);
       System.out.println("=====recurion=====");

       double results2 = obj1.factorial4(n);
       System.out.println(results2);
    }
    
}

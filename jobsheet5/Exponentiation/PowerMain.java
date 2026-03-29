package jobsheet5.Exponentiation;
import java.util.*;

public class PowerMain {
    public static void main (String [] args){
        Scanner in = new Scanner (System.in);

        System.out.print("input the element Number : ");
        int element = in.nextInt();

        Power [] power = new Power[element];

        for (int i=0; i<element; i++){
            System.out.print("input base : ");
            int base = in.nextInt();

            System.out.print("input exponent : ");
            int exponent = in.nextInt();

            power[i] = new Power(base, exponent);
        }
        System.out.println("result for brute force");
        for (Power p : power ){
            System.out.println(p.base+"^"+p.exponent +" : "+p.powerBf(p.base, p.exponent));
        }
        System.out.println("result for Divide and conqurer");
        for (Power p : power){
            System.out.println(p.base+"^"+p.exponent+" : "+p.powerDc(p.base, p.exponent));
        }
    }
    
}

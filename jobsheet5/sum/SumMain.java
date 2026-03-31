package jobsheet5.sum;
import java.util.*;

public class SumMain {
    public static void main (String [] args){
        Scanner in = new Scanner(System.in);

        System.out.print("Enter length of array");
        int size = in.nextInt();

        Sum sum = new Sum(size);

        for (int i=0; i<size; i++){
            System.out.print("Enter value element ke- "+(i+1)+ " : ");
            sum.profit[i] = in.nextDouble();

        } 

        System.out.print("BF : "+sum.totalBf());
        System.out.print("DC : "+sum.totalDc(sum.profit, 0, size-1));
    }
    
}

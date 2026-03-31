package ptrc2;
import java.util.*;

public class sumDCmain {
    public static void main (String [] args){
        Scanner in = new Scanner(System.in);

        System.out.print("enter the size : ");
        int size =in.nextInt();

        sumDC sum = new sumDC(size);

        for (int i=0; i<size; i++){
            System.out.print("enter the element");

            sum.arr[i] = in.nextDouble();
        }

        System.out.println(" "+sum.sumbf(sum.arr));

        System.out.println(sum.sumdc(sum.arr, 0, size-1));

    }

}

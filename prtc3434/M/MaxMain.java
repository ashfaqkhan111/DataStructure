package prtc3434.M;
import java.util.*;

public class MaxMain {
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);

    Max arr [] = new Max[2];

    for (int i=0; i<arr.length; i++){
        System.out.print("enter name : ");
        String name = in.nextLine();

        System.out.print("enter score : ");
        int score = in.nextInt();

        in.nextLine();

        arr[i] = new Max(name,score);
    }

    Max obj = new Max();
    // Max parr = obj.pArr(arr);
    // System.out.print(parr);
    // obj.pArr(arr);
    obj.maxfind(arr);

    // Max obj2 = new Max();

    System.out.println("==================");

        Max result = Max.maxDC(arr, 0, arr.length-1);
        System.out.print(result.name);
    
    }
}

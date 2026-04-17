package DivideAndConqurer;
import java.util.*;

public class Maxmain {
    public static void main(String[]args){

        Scanner in = new Scanner(System.in);
        Max arr [] = new Max[3];

        for (int i=0; i<arr.length; i++){
            System.out.print("ENter name");
            String name = in.nextLine();

            System.out.print("Enter your score");
            int score = in.nextInt();

            in.nextLine();

             arr[i] = new Max(name,score);
        }

       

        Max.printArr(arr);
        
    }

    

   
}

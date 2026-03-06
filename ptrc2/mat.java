package ptrc2;
import java.util.*;

class mat{
    int a;
    public static void main (String [] args){
        Scanner in = new Scanner(System.in);
       
        mat[][] arr = new mat[3][3];

        for (int i=0; i<arr.length; i++){
            for (int j=0; j<arr[i].length; j++){
                arr[i][j] = new mat();
            }
        }

          for (int i=0; i<arr.length; i++){
            for (int j=0; j<arr[i].length; j++){
                arr[i][j].a = in.nextInt();
            }
        }

        for (int i=0; i<arr.length; i++){
            for (int j=0; j<arr[i].length; j++){
            System.out.println(arr[i][j].a);
            }
    }
}
}
package phone;
import java.util.*;

public class Main {
    public static void main (String [] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Size of array : ");
        int size = in.nextInt();
        Ph1 arr = new Ph1(size);
        arr.addData();
        arr.display();
        arr.newest();
    }
    
}

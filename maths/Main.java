package maths;
import java.util.*;

public class Main {
    public static void main(String [] args){

        Scanner in = new Scanner(System.in);
        System.out.print("ENter columns and rows ");
        int row = in.nextInt();
        int col = in.nextInt();
        GuassJorden g = new GuassJorden(row,col);
        g.input();
        g.calculation();
        g.display();
        g.showResult();

    }
}

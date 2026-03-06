package ptrc2;
import java.util.*;

public class Circle {
    double r;

    Circle(double r){
        this.r = r;
    }

    double area(){
        return 3.14*r*r;
    }

    public static void main (String [] args){
        Scanner in = new Scanner(System.in);
        Circle [] c = new Circle[5];

        for (int i=0; i<c.length; i++){
            c[i] = new Circle(c.length);
        }

        for (int i=0; i<c.length; i++){
            
            int redious = (i+1);
            c[i] = new Circle(redious);
        }

        for (int i=0; i<c.length; i++){
            System.out.println("area of circle "+(i+1)+" : "+c[i].area());
        }
    }
}

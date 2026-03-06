package practice;
import java.util.*;

public class Ractangle {

    int length;
    int width;

    Ractangle(int length, int width){
        this.length = length;
        this.width = width;
}

    int area (){
        return length*width;
    }

public static void main (String [] args){

   

    // Scanner in = new Scanner(System.in);
    
    Ractangle [] ractangle = new Ractangle[3];

    // for (int i=0; i<ractangle.length; i++){
    // ractangle[i]=new Ractangle();
    // }

    // for (int i=0; i<ractangle.length; i++){
    //     System.out.print("enter length : ");
    //     ractangle[i].length = in.nextInt();
    //     System.out.print("enter width : ");
    //     ractangle[i].width = in.nextInt();
    // }

    // for (int i=0; i<ractangle.length; i++){
    //     System.out.print(" "+ractangle[i].area());
    // }



    // using constructor

    ractangle[0] = new Ractangle(10,12);
    ractangle[1] = new Ractangle(34, 12);
    ractangle[2] = new Ractangle(3, 3);

    for (int i=0; i<ractangle.length; i++){
        System.out.print(" "+ractangle[i].area());
    }
}

}


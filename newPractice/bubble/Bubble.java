package newPractice.bubble;
import java.util.*;

public class Bubble {
    int age,nim;
    String name;
    double gpa;

    Bubble (){}

    Bubble(String name, int age, int nim, double gpa){  
        this.name = name;
        this.age = age;
        this.nim = nim;
        this.gpa = gpa;

    }

    public void print(){
        System.out.printf("\n%-15s %-15s %-15s %-15s",name, nim, age, gpa);
    }

    public static void input(Bubble arrB[], Scanner in){
       for (int i=0; i<arrB.length; i++){

        System.out.print("Enter name :");
        String name = in.nextLine();

        System.out.print("Enter age : ");
        int age = in.nextInt();

        System.out.print("Enter nim : ");
        int nim = in.nextInt();

        System.out.print("Enter gpa : ");
        double gpa = in.nextDouble();

        in.nextLine();

        arrB[i] = new Bubble(name, age, nim, gpa);
       }

    }
}

package newPractice.bubble;
import java.util.*;
import java.io.*;

public class Main {
    public static void main (String [] args){
         Scanner in = new Scanner(System.in);
        Bubble arrB [] = new Bubble[3];

        // arrB[0] = new Bubble("ashfaq khan",14,98012,3.4);
        // arrB[1] = new Bubble("khan",17,98011,3.5);
        // arrB[2] = new Bubble("ashfaq",13,98014,3.2);
        // arrB[3] = new Bubble("afaq",12,98013,3.4);

        Bubble.input(arrB,in);

        System.out.printf("\n%-15s %-15s %-15s %-15s","Name","NIM","age","Gpa");   

        for (int i=0; i<arrB.length; i++){
            arrB[i].print();
            
        }
        Process obj = new Process();
        

        obj.bubbleSort(arrB);

        System.out.printf("\n%-15s %-15s %-15s %-15s","Name","NIM","age","Gpa");

        for (int i=0; i<arrB.length; i++){
            arrB[i].print();
            
        }

        System.out.println("\n===============");

       

        Bubble result = obj.binarySearch(arrB, 98014);
         if (result != null){
              System.out.println("NIM : "+result.nim);
              System.out.println("Name : "+result.name);
              System.out.println("Age : "+result.age);
              System.out.println("Gpa : "+result.gpa);
        }else 
        {
            System.out.print("data not found!");
        }

      
    }
    

}

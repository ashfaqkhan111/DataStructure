package jobsheet7.SequincialSearchMethod;
import java.util.*;

public class Main {
    public static void main (String [] args){
        Scanner in = new Scanner(System.in);
        System.out.println("--------------------------------");
        System.out.print("Enter amount of students : ");
        int size = in.nextInt();
        in.nextLine();

        SearchSrudent search = new SearchSrudent(size);
        
        System.out.println("Enter data from Smallest NIM");

        for (int i=0; i<size; i++){
            System.out.println("=====Student"+(i+1)+"======");
        System.out.print("Enter NIM : ");
        int nim = in.nextInt();
        in.nextLine();

        System.out.print("Enter Name : ");
        String name = in.nextLine();

        System.out.print("Enter Age : ");
        int age = in.nextInt();

        System.out.print("ENter Gpa : ");
        double gpa = in.nextDouble();

        in.nextLine();

        Student std = new Student(nim , name, age, gpa);


        search.add(std);
        }

        System.out.println("------------------------------");
        System.out.println("Students Data");
        search.displayData();

        System.out.println("-------------------------------");
         System.out.println("-------------------------------");

         System.out.print("Search student by NIM :");
         int x = in.nextInt();

         System.out.println("Using Sequnicial Search");
         int pos = search.findSeqSearch(x);
         search.showPosition(x, pos);
         search.showData(x, pos);

         System.out.print("========================");
         System.out.print("Search by sequancial search");
    
    

            int pos1 = search.findBinarySearch(x, 0, size-1);

            search.showPosition(x, pos1);
            search.showData(x, pos1);
    }
    
}

package jobsheet6.Student;
import java.util.*;

public class Main254107020262 {

    public static void main (String [] args){
        Scanner in = new Scanner (System.in);

        System.out.print("Enter Size of array : ");
        int Size = in.nextInt();
        in.nextLine();
        TopStudent254107020262 topStudent = new TopStudent254107020262(Size);
        // topStudent.add(new Student254107020262("2201","Alice","A  ",3.9));
        // topStudent.add(new Student254107020262("2202","Bob","B  ",3.7));
        // topStudent.add(new Student254107020262("2203","Charlie","C  ",3.8));
        // topStudent.add(new Student254107020262("2204","David","D  ",3.6));
        // topStudent.add(new Student254107020262("2205","Eve","E  ",4.0));

        

        for (int i=0; i<Size; i++){
        System.out.print("Enter nim  : ");
        String nim = in.nextLine();

        System.out.print("Enter name  : ");
        String name = in.nextLine();

        System.out.print("Enter Class : ");
        String studentClass = in.nextLine();

        System.out.print("Enter Gpa : ");
        double gpa = in.nextDouble();

        in.nextLine();

        Student254107020262 s = new Student254107020262(nim ,name, studentClass,gpa);
        topStudent.add(s);
        }
    


    System.out.println("orignal students list : ");
    topStudent.print();

    topStudent.bubbleSort();
    System.out.println("\n===Sorted list by gpa bubble sort===");
    topStudent.print();

    topStudent.selectionSort();
    System.out.println("====Sorted by sleection Sort====");
    topStudent.print();

    topStudent.insertionSort();
    System.out.println("====Sorted by Selection Sort====");
    topStudent.print();
    }
    
}

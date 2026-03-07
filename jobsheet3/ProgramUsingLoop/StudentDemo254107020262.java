package jobsheet3.ProgramUsingLoop;
import java.util.*;

public class StudentDemo254107020262 {
    public static void main (String [] args){
        Scanner in = new Scanner(System.in);
        // String dummy;
        Student254107020262[] st1 = new Student254107020262[3];

        System.out.println("\n=======Input======\n");
        for (int i=0; i<st1.length; i++){
            st1[i]=new Student254107020262();

            System.out.print("Enter name : ");
            st1[i].name = in.nextLine();

            System.out.print("Enter nim : ");
            st1[i].nim = in.nextLine();

            System.out.print("Enter class : ");
            st1[i].Class = in.nextLine();

            
            System.out.print("Enter gpa : ");
            st1[i].gpa = in.nextFloat();
            in.nextLine();

            
        }
          System.out.println("\n=======Display======\n");
        for (int i=0; i<st1.length; i++){
             System.out.println("Data student ke-"+(i+1));
            st1[i].printInfo();
        }
        
    }
}

package StackPrtc.Studentss;
import java.util.*;

public class Main {
    public static void main(String [] args){
      Scanner in = new Scanner(System.in);
    System.out.print("Enter size : ");
    int size = in.nextInt();
    StudentsStack s = new StudentsStack(size); 
    
    int choice;

    do{
        System.out.println("\n========menu=======\n");
        System.out.println("1.push");
        System.out.println("2.pop");
        System.out.println("3.peek");
        System.out.println("Enter choice : ");
        System.out.println("===============");

        choice = in.nextInt();

        in.nextLine();

        switch (choice) {
            case 1:
                System.out.print("Enter nim : ");
                String nim = in.nextLine();

                System.out.print("Enter name : ");
                String name = in.nextLine();

                System.out.print("Enter Class name : ");
                String cName = in.nextLine();


                Students value = new Students(nim,name,cName);
                
                s.push(value);
                
                break;
        
            case 2:
                s.pop();
                break;

            case 3:
                s.peek();
                break;

            default :
                System.out.print("invalid!!!!");
                break;
        }
    }while (choice != 4);
    }
    
}

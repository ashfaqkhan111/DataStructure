package StackPrtc.student;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        StudnetStack s = new StudnetStack(4);

       int choice ;
         
        do{
            System.out.println("====MENU====");
            System.out.println("1.push value");
            System.out.println("2.pop value");
            System.out.println("3.peek top");
            System.out.println("============");
            System.out.print("enter your choice : ");
            choice = in.nextInt();
            in.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("NIM : ");
                    int nim = in.nextInt();
                    in.nextLine();
                    
                    System.out.println("Name : ");
                    String name = in.nextLine();

                    System.out.print("Class Name : ");
                    String className = in.nextLine();

                    System.out.print("Major : ");
                    String major = in.nextLine();
                    

                    Students values = new Students(nim, name, className, major);

                    s.push(values);


                    break;
            
                case 2:
                    s.pop();
                    break;

                case 3:
                    s.peek();
                    break;

                case 4:
                    s.emptyStack();
                    break;

                case 5:
                    System.out.print("thank you !!!");
                    break;

                default :
                System.out.println("invalid !!!");
                break;
            }
        }while (choice != 5);

        

    }
    
}

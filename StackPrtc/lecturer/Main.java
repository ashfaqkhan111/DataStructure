package StackPrtc.lecturer;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the size : ");
        int size = in.nextInt();

        StackL s = new StackL(size);

        int choice;

        do {
            System.out.println("=====Menu=====");
            System.out.println("1.push");
            System.out.println("2.pop");
            System.out.println("3.peek");
            System.out.println("===============");
            System.out.println("Enter choice : ");
            choice = in.nextInt();
            in.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("enter Lecturer number : ");
                    String lecturerNo = in.nextLine();

                     System.out.print("enter Lecturer name : ");
                    String name = in.nextLine();

                     System.out.print("enter Lecturer specification : ");
                    String spice = in.nextLine();

                    Lecturer l = new Lecturer(lecturerNo, name, spice);
                    s.push(l);
                    
                    break;
            
                case 2:
                    s.pop();
                    break;

                case 3:
                    s.peek();
                    break;
                
                case 4:
                    System.out.println("invalid!!");
                    break;

                default:
                    System.out.println("program ended!!!");
                    break;
            }
        }while (choice != 4);
    }
    
}

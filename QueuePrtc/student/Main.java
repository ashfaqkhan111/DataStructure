package QueuePrtc.student;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);

        StudentQueue Q = new StudentQueue(3);

        int choice;

        do{
            System.out.println("===Mneu===");
            System.out.println("1.Enqueue");
            System.out.println("2.Dequeue");
            System.out.println("3.Show Front");
            System.out.println("4.Show rear");
            System.out.println("5.Erase Queue");
            System.out.println("===============");
            System.out.print("Enter choice : ");
            choice = in.nextInt();
            in.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter NIM : ");
                    int nim = in.nextInt();
                    in.nextLine();
                    System.out.print("Enter Name : ");
                    String name = in.nextLine();
                    System.out.print("Enter Class NAme : ");
                    String className = in.nextLine();
                    System.out.print("Enter Major : ");
                    String major = in.nextLine();
                    Student s = new Student(nim, name, className, major);
                    Q.enqueue(s);
                    break;
            
                case 2:
                    Q.dequeue();
                    break;

                case 3:
                    Q.showFront();
                    break;

                case 4:
                    Q.showRear();
                    break;

                case 5:
                    Q.eraseQueue();
                    break;

                default:
                    System.out.println("thank u");
                    break;
            }
        }while (choice != 6);
    }
    
}

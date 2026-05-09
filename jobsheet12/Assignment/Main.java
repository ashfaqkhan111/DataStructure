package jobsheet12.Assignment;
import java.util.*;

public class Main {
        public static void main(String [] args){
            Scanner in = new Scanner(System.in);
            StudentQueue Q = new StudentQueue();
            int choice;
            do {
            System.out.println("\n===== STUDENT SERVICE QUEUE =====");
            System.out.println("1. Add Student to Queue");
            System.out.println("2. Call Next Student");
            System.out.println("3. Check Queue Empty");
            System.out.println("4. Check Queue Full");
            System.out.println("5. Show Front Student");
            System.out.println("6. Show Rear Student");
            System.out.println("7. Show Total Students");
            System.out.println("8. Display All Queue");
            System.out.println("9. Clear Queue");
            System.out.println("0. Exit");
            System.out.print("Choose menu: ");
            choice = in.nextInt();
            in.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("inptu NIM : ");
                    String nim = in.nextLine();

                    System.out.print("input NAme : ");
                    String name = in.nextLine();

                    System.out.print("Input major : ");
                    String major = in.nextLine();

                    Student s = new Student(nim, name, major);
                    Q.enqueue(s);
                    break;

                case 2:
                    Student call = Q.dequeue();

                    if(call != null){
                        System.out.println("Calling Studnt");
                        call.print();;
                    }break;

                case 3: 
                    System.out.print("Queue is Empty : "+Q.isEmpty());
                     break;

                case 4:
                    System.out.print("Queue is full : "+Q.isFull()); 
                    break;

                case 5 :
                    Q.peekFront();
                    break;

                case 6:
                    Q.peekrear();
                    break;

                case 7:
                    Q.totalStudents();
                    break;

                case 8 :
                    Q.PrintQueue();
                    break;

                case 9:
                    Q.clear();
                    break;

                case 0:
                    System.out.print("THANKS!!!");
                    break;
                
                    default :
                    System.out.print("invalid choice");

            }
            }while (choice != 0);
        }
    
}

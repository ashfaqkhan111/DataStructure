package jobsheet11.experiment2;
import java.util.*;

public class Main {
   public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        studentQueue Q = new studentQueue(3);
        int choice;
        do{
            System.out.println("\n===Academic Service Menu====");
            System.out.println("1.Enqueue");
            System.out.println("2.Dequeue");
            System.out.println("3.Display front");
            System.out.println("4.Display All");
            System.out.println("5.Queue size");
            System.out.println("0.Exit");
            System.out.println("Choose an option");
            choice = in.nextInt();
            in.nextLine();

            switch(choice){
                
                case 1:
                    System.out.print("NIM : ");
                    String nim = in.nextLine();
                    System.out.print("Name : ");
                    String name = in.nextLine();
                    System.out.print("Study Program : ");
                    String studyProgram = in.nextLine();
                    System.out.print("Class Name : ");
                    String className = in.nextLine();
                    Student std = new Student(nim, name, studyProgram, className);
                    Q.enqueue(std);
                    break;

                case 2:
                    Student studentBeingServed = Q.dequeue();
                    if(studentBeingServed != null){
                        System.out.println("Student being served : ");
                        studentBeingServed.print();
                    }break;

                case 3:
                    Q.peek();
                    break;

                case 4:
                    Q.print();

                case 5:
                    System.out.print("Queue Size : "+Q.size);
                    break;
                case 0:
                    System.out.print("thanks!");
                    break;
                default:
                    System.out.print("invalid option");
            }

        }while (choice !=0);
   }

    
}

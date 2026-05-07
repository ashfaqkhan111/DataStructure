package jobsheet11.assignment;
import java.util.*;

public class Main {
    public static void main (String [] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the length of Queue mudt not exceed then 10 : ");
        int max = in.nextInt();
        StudentQueue Q = new StudentQueue(max);
        int choice;
        int apprevedcount =0;
        int countStd = 0;

        do{
            Q.menu();
            choice = in.nextInt();
            in.nextLine();
            
            switch (choice){
                case 1:
                    System.out.print("NIM : ");
                    String nim = in.nextLine();
                    System.out.print("Name : ");
                    String name = in.nextLine();
                    System.out.print("Class name : ");
                    String className = in.nextLine();
                    System.out.print("Study Program : ");
                    String studyProgram = in.nextLine();
                    
                    Student std = new Student(nim,name,className,studyProgram);
                    Q.enqueue(std);
                    countStd++;
                    break;
                
                case 2:
                    System.out.print("Students being processed!");
                    Student s1 = Q.dequeue();
                    if(s1 != null){
                        s1.print();
                        apprevedcount++;
                    }

                    Student s2 = Q.dequeue();
                    if(s1 != null){
                        s2.print();
                        apprevedcount++;
                    }
                    break;

                case 3:
                    Q.peek();
                    break;

                case 4:
                    Q.peek0f2Student();
                    break;

                case 5:
                    Q.viewRear();
                    break;

                case 6:
                    Q.print();
                    break;
                
                case 7:
                    Q.clear();
                    break;

                case 8:
                    System.out.println("the total number of Students are : "+countStd);
                    break;
                case 9:
                    System.out.println("the number of Approved KRS : "+apprevedcount);
                case 0:
                    System.out.print("thanks!!");
                    break;

                default :
                System.out.print("invalid choice!!");
            }
            
        }while(choice !=0);
    }
    
}

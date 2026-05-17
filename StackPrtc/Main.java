package StackPrtc;
import java.util.*;

public class Main {
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);

        System.out.print("ENter the number of students : ");
        int size = in.nextInt();

        Stackk S = new Stackk(size);

        int choice;

        do {
            System.out.println("=========");
            System.out.println("1.Push");
            System.out.println("2.peek");
            System.out.println("3.pop");
            System.out.println("4.Display");
            System.out.println("input choice : ");
            choice = in.nextInt();
            in.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("enter number : ");
                    int number = in.nextInt();
                    S.push(number);
                    break;
            
                case 2:
                    S.peek();
                    break;
                case 3:
                    S.pop();
                    break;
                case 4:
                    S.display();
                    break;
                case 5:
                    System.out.println("BY BY !!");
                    break;
                default :
                System.out.println("invalid !!");
                break;
            }

           
        }while (choice !=5);

       
    }
    
}

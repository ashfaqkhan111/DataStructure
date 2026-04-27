package jobsheet10.Assignment;
import java.util.*;

public class Main {
    public static void main (String [] args){
        Scanner in = new Scanner (System.in);
        ExcuseLetterStack1 stack = new ExcuseLetterStack1(10);

        int choice;
        do {
            System.out.println("1. Submit excuse letter");
            System.out.println("2. process excuse letter");
            System.out.println("3.view latest letter");
            System.out.println("4. search letter");
            System.out.println("choice : ");
            choice = in.nextInt();
            in.nextLine();

            switch (choice){
                case 1:
                    System.out.print("id : ");
                    String id = in.nextLine();

                    System.out.print("Name : ");
                    String name = in.nextLine();

                    System.out.print("Class : ");
                    String className = in.nextLine();
                    
                    System.out.print("Type (S/I)");
                    char type = in.next().charAt(0);

                    System.out.print("Duration : ");
                    int duration = in.nextInt();

                    ExcuseLetter1 letter = new ExcuseLetter1(id, name, className, type,duration);
                    stack.push(letter);
                    break;

                    case 2:
                        ExcuseLetter1 processed = stack.pop();
                        if(processed != null){
                            System.out.println("processing letter : ");
                            processed.print();
                        }break;

                    case 3:
                        ExcuseLetter1 latest = stack.peek();
                        if(latest != null){
                            System.out.println("latest letter : ");
                            latest.print();
                        }else {
                            System.out.println("empty");
                        }break;

                    case 4:
                        System.out.print("Enter name to search : ");
                        String searchName = in.nextLine();
                        stack.search(searchName);
                        break;
                        
                    default :
                        System.out.print("invalid choice");
                    }
        }while (choice >=1 && choice<= 4);
    }
}

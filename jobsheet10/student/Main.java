package jobsheet10.student;
import java.util.*;

public class Main {
    public static void main (String [] args){

        Scanner in = new Scanner(System.in);
        StudentAssignmentStack1 stack = new StudentAssignmentStack1(5);
        int choice;

        do {

            System.out.println("\nMenu");
            System.out.println("1. Submit Assignment");
            System.out.println("2. grade assignemnt");
            System.out.println("3. View latest assignrmnt");
            System.out.println("4. view all assignments");
            System.out.println("5. show first submission");
            System.out.print("choose :");
           
            choice = in.nextInt();
            in.nextLine();

            switch (choice){
                case 1:
                    System.out.print("Name : ");
                    String name = in.nextLine();

                    System.out.print("student id : ");
                    String id = in.nextLine();

                    System.out.print("Class : ");
                    String className = in.nextLine();

                    Student2 student = new Student2(name, id, className);
                    stack.push(student);

                    System.out.printf("Assignment %s is successfully submited",student.name);
                    break;

                case 2:
                    Student2 gradedstudent = stack.pop();
                    if(gradedstudent != null){
                        System.out.println("Grading aggignmnet from "+gradedstudent);
                        System.out.println("enter score 1-100");
                        int score = in.nextInt();
                        gradedstudent.grade(score);
                        System.out.printf("Assignment scor for %s is %d \n", gradedstudent.name,score);

                        String binary = stack.convertToBinary(score);
                        System.out.printf("Assignemnet in binary is %s\n",binary);
                        
                    }break;

                case 3:
                    Student2 view = stack.peek();
                    if(view != null){
                        System.out.println("latest assignment submitted by "+view.name);
                        break;
                    }

                case 4:
                    System.out.println("list of all assignments");
                    stack.print();
                
                case 5:
                    Student2 first = stack.getFirstStudent(); /// Question 5
                    if(first != null){
                        System.out.print("First student who submitted : "+first.name);
                    }else {
                        System.out.print("no submission yet.");
                    }
                    break;

                    default:
                        System.out.println("invalid");
                }

        }while (choice >= 1 && choice <=5);
    }


    
}

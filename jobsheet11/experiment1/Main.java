package jobsheet11.experiment1;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter maximum number of data : ");
        int n = in.nextInt();

        Queue Q = new Queue(n);

        int choice = -1;

        do{
            Queue.menu();
            choice = in.nextInt();
            switch(choice){
                case 1:
                    System.out.print("Enter data : ");
                    int newData = in.nextInt();
                    Q.enqueue(newData);
                    break;

                case 2:
                    int outData = Q.dequeue();
                    if(outData!=0){
                        System.out.print("Removed data"+outData);
                        break;
                    }

                case 3:
                    Q.print();
                    break;

                case 4:
                    Q.peek();
                    break;

                case 5:
                    Q.clear();
                    break;
            }
        }while (choice ==1 || choice==2 || choice==3 || choice==4 || choice==5);
        
    }
    
}

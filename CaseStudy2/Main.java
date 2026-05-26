package CaseStudy2;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        BuyerDLL buyer = new BuyerDLL();

        OrderDLL order = new OrderDLL();

        int choice;

        int customerCounter = 1;

        do {
            System.out.println("\n=================================");
            System.out.println("    ROYAL DILISH QUEUE SYSTEM ");
            System.out.println("=================================");
            System.out.println("1. Add customer data");
            System.out.println("2. Print customer data");
            System.out.println("3. Process & insert data");
            System.out.println("4. Orders report ");
            System.out.println("5. Total revanue");
            System.out.println("6. Exit ");
             System.out.println("==================");
              System.out.print("Enter the choice : ");
              choice = in.nextInt();
              in.nextLine();

            switch (choice) {
                case 1:
                     
                    System.out.print("Enter Name : ");
                    String name = in.nextLine();

                    System.out.print("Enter phone number :");
                    String phoneNo = in.nextLine();

                    BuyerDetails b = new BuyerDetails(name, phoneNo,customerCounter);
                    customerCounter++;
                    buyer.enqueue(b);

                    break;

                case 2:
                    buyer.print();
                    break;

                case 3:
                    buyer.processQueue(order);
                    break;

                case 4:
                    order.sortOrder();
                    order.printDetails();
                    break;

                case 5: 
                    order.revanue();
                    break;

                case 6:
                     System.out.println("Program Ended");
                     break;


            
                default:
                     System.out.println("Program Ended");
                    break;
            }
        }while (choice != 6);
        
    }
    
}

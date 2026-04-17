package CaseStudyMdify;
import java.util.*;



import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        Student[] student = new Student[3];
        Book[] book = new Book[3];
        Loan[] loan = new Loan[3];

        int choice;

        while (true) {

            System.out.println("\n===== LIBRARY MENU =====");
            System.out.println("1. Input Students");
            System.out.println("2. Input Books");
            System.out.println("3. Input Loans");
            System.out.println("4. Show Loans");
            System.out.println("5. Search Loan by Student ID");
            System.out.println("6. Sort Loan by Fine");
            System.out.println("7. Sort by desinding");
             System.out.println("8. Sort by Fine");
              System.out.println("9. Exit");
               

            System.out.print("Enter choice: ");
            choice = in.nextInt();

            switch (choice) {

               
                case 1:
                    Student.inputStudent(student, in);
                    System.out.println("Students Added!");
                    break;

             
                case 2:
                    Book.inputBook(book, in);
                    System.out.println("Books Added!");
                    break;

             
                case 3:
                    Loan.inputLoan(loan, book, student, in);
                    System.out.println("Loans Added!");
                    break;

                
                case 4:
                    for (int i = 0; i < loan.length; i++) {
                        if (loan[i] != null) {
                            loan[i].calculateFine();
                            loan[i].showLoan();
                        }
                    }
                    break;

                
                case 5:
                    System.out.println("search by binary");
                    System.out.print("Enter Student ID: ");          ///// search by ide using binary
                    int id = in.nextInt();
                    Loan.binarySearchById(loan, id);
                    break;

                 case 6:
                    System.out.print("sort assending order ");        //// assending order 
                   
                    Loan.sortByFineAsc(loan);
                    break;


                 case 7:
                    System.out.print("sort desending order ");          //// desending order
                   
                    Loan.sortByFineDec(loan);
                    break;

                
                case 8:
                    Loan.sortByFineAsc(loan);
                    System.out.println("Sorted by fine!");                  ///// lon sort
                    break;

               
                case 9:
                    System.out.println("Exiting program...");
                    return;

            
                default:
                    System.out.println("Invalid choice!");
            }
        
    
}
}
}

//         System.out.println("\n\n===== SEARCH RESULT =====");

     
//         Loan.searchById(loan, 22001);


//    System.out.println("\n\n===== Show Book DATA =====");
//    System.out.printf("%-7s %-7s %-18s", "Code ","Tittle ", "Year");

//         for (int i=0; i<book.length; i++){
//             book[i].showBookData();
//         }

//            System.out.println("\n\n===== Show Student DATA =====");
//    System.out.printf("%-7s %-7s %-18s", "ID ","Name ", "Study program");

//     for (int i=0; i<student.length; i++){
//             student[i].showStudentData();
        
    


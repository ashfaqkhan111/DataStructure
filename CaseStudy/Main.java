package CaseStudy;

public class Main {
    public static void main(String[] args){

        Student student[] = new Student[3];
        Book book[] = new Book[4];
        Loan loan[] = new Loan[5];

        student[0] = new Student(22001,"Abdul","Informatics Engineering");
        student[1] = new Student(22002,"Bestari","Informatics Engineering");
        student[2] = new Student(22003,"Gandi","Business Informatics");

    
        book[0] = new Book("B001","Algorithm",2020);
        book[1] = new Book("B002","Database",2019);
        book[2] = new Book("B003","Programming",2021);
        book[3] = new Book("B004","Physics",2024);

     
        loan[0] = new Loan(book[0],student[0],7);
        loan[1] = new Loan(book[1],student[1],3);
        loan[2] = new Loan(book[2],student[2],10);
        loan[3] = new Loan(book[3],student[2],6);
        loan[4] = new Loan(book[1],student[0],4);

     
        for (int i = 0; i < loan.length; i++){
            loan[i].calculateFine();
        }

        Loan.sortByFineAsc(loan);

        System.out.println("\n===== SORTED BY FINE =====");

        for (int i = 0; i < loan.length; i++){
            loan[i].showLoan();
        }

        System.out.println("\n\n===== SEARCH RESULT =====");

     
        Loan.searchById(loan, 22001);


   System.out.println("\n\n===== Show Book DATA =====");
   System.out.printf("%-7s %-7s %-18s", "Code ","Tittle ", "Year");

        for (int i=0; i<book.length; i++){
            book[i].showBookData();
        }

           System.out.println("\n\n===== Show Student DATA =====");
   System.out.printf("%-7s %-7s %-18s", "ID ","Name ", "Study program");

    for (int i=0; i<student.length; i++){
            student[i].showStudentData();
        }
    }
}
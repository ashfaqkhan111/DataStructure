package CaseStudyMdify;

import java.util.Scanner;

public class Loan {

    Book book;
    Student std;
    int loanDuration, fine, late;

    Loan(Book book, Student std, int loanDuration) {
        this.book = book;
        this.std = std;
        this.loanDuration = loanDuration;
    }

    public static void inputLoan(Loan[] loan, Book[] book, Student[] student, Scanner in) {

        for (int i = 0; i < loan.length; i++) {

            System.out.print("Enter Book index: ");
            int bIndex = in.nextInt();

            System.out.print("Enter Student index: ");
            int sIndex = in.nextInt();

            System.out.print("Enter days: ");
            int days = in.nextInt();

            loan[i] = new Loan(book[bIndex], student[sIndex], days);
        }
    }


    public void calculateFine() {
        int limit = 5;

        if (loanDuration > limit) {
            late = loanDuration - limit;
            fine = late * 2000;
        } else {
            late = 0;
            fine = 0;
        }
    }

    public void showLoan() {
        std.showStudentData1();
        book.showBookData1();

        System.out.println("Loan Duration: " + loanDuration);
        System.out.println("Late: " + late);
        System.out.println("Fine: " + fine);
        System.out.println("------------------------");
    }

    public static void binarySearchById(Loan[] loan, int id) {              /// here instead for linear search i add binary search

    int left = 0;
    int right = loan.length - 1;

    while (left <= right) {

        int mid = (left + right) / 2;

        if (loan[mid] == null) {
            break;
        }

        if (loan[mid].std.id == id) {

            System.out.println("Found at index: " + mid); ////// index found
            loan[mid].calculateFine();
            loan[mid].showLoan();
            return;
        }

        if (loan[mid].std.id < id) {
            left = mid + 1;
        } else {
            right = mid - 1;
        }
    }

    System.out.println("Data not found");
}
    


    public static void sortByFineAsc(Loan[] loan) {                 //// search assending 

        for (int i = 0; i < loan.length - 1; i++) {
            for (int j = 0; j < loan.length - i - 1; j++) {

                if (loan[j] != null && loan[j + 1] != null &&
                    loan[j].fine > loan[j + 1].fine) {

                    Loan temp = loan[j];
                    loan[j] = loan[j + 1];
                    loan[j + 1] = temp;
                }
            }
        }

        for (int i=0; i< loan.length; i++){     ////print
            if(loan[i] != null){
                loan[i].calculateFine();
                loan[i].showLoan();
            }
        }
    }

        public static void sortByFineDec(Loan[] loan) {         //// search desinding

        for (int i = 0; i < loan.length - 1; i++) {
            for (int j = 0; j < loan.length - i - 1; j++) {

                if (loan[j] != null && loan[j + 1] != null &&
                    loan[j].fine < loan[j + 1].fine) {

                    Loan temp = loan[j];
                    loan[j] = loan[j + 1];
                    loan[j + 1] = temp;
                }
            }

        }

        for (int i=0; i< loan.length; i++){
            if(loan[i] != null){
                loan[i].calculateFine();
                loan[i].showLoan();
            }
        }
    }
}


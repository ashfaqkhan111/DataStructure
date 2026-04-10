package CaseStudy;

public class Loan {
    Book book;
    Student std;
    int loanDuration, fine, late;

    Loan(Book book, Student std, int loanDuration){
        this.book = book;
        this.std = std;
        this.loanDuration = loanDuration;
    }

    public void calculateFine(){
        int limit = 5;

        if (loanDuration > limit){
            late = loanDuration - limit;
            fine = late * 2000;
        } else {
            late = 0;
            fine = 0;
        }
    }

    public void showLoan(){
        std.showStudentData1();
        book.showBookData1();

        System.out.println("Loan Duration: " + loanDuration);
        System.out.println("Late: " + late);
        System.out.println("Fine: " + fine);
        System.out.println("------------------------");
    }

    public static void searchById(Loan[] loan, int id){
        boolean found = false;

        for (int i = 0; i < loan.length; i++){
            if (loan[i].std.id == id){
                loan[i].showLoan();
                found = true;
            }
        }

        if (!found){
            System.out.println("Data not found");
        }
    }

    public static void sortByFineAsc(Loan[] loan){
        for (int i = 0; i < loan.length - 1; i++){
            for (int j = 0; j < loan.length - i - 1; j++){
                if (loan[j].fine > loan[j + 1].fine){
                    Loan temp = loan[j];
                    loan[j] = loan[j + 1];
                    loan[j + 1] = temp;
                }
            }
        }
    }
}
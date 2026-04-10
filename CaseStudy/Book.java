package CaseStudy;

public class Book {
    String code, tittle;
    int year;

    Book(String code, String tittle, int year){
        this.code = code;
        this.tittle = tittle;
        this.year = year;
    }

    public void showBookData(){
        // System.out.println("Book Code : " + code);
        // System.out.println("Book Title : " + tittle);
        // System.out.println("Year : " + year);

        System.out.printf("\n%-7s %-7s %-18s", code,tittle, year);
    }
     public void showBookData1(){
        System.out.println("Book Code : " + code);
        System.out.println("Book Title : " + tittle);
        System.out.println("Year : " + year);}
}
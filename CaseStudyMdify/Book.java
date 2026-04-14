package CaseStudyMdify;

import java.util.Scanner;

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


        public static void inputBook(Book[] book, Scanner in) {
            for (int i=0; i<book.length; i++){
            System.out.print("Enter code : ");
            String code = in.nextLine();
            System.out.print("Enetr Title : ");
            String tittle = in.nextLine().toLowerCase();

            System.out.print("Enter Year : ");
            int year = in.nextInt();

            in.nextLine();

              Book obj1 = new Book(code, tittle,year);
        }
        }
}
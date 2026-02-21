package jobsheet2;

public class StudentMain254107020262 {
   public static void main (String [] args){

    Student st1 = new Student(); // this is object st1 created using class Student

    st1.name = "khan";  // this is simple method of direct value assign to veriables
    st1.gpa = 3.4;
    st1.nim = 234651325;
    st1.studentClass = "T1.Ti";

    System.out.println("-------------------------"); // thi is for to seprate the information befor and after updates 

    st1.displayInformation(); // this print the values which is assign to the veriables 

    System.out.println("-------------------------");

    System.out.println("performance : "+st1.performanceGrade(st1.gpa)) ;

    st1.updateClass("T2.Ti"); // this will update the class from privious to new 

    st1.updateGpa(4.0); // this will update gpa 

     System.out.println("-------------------------");

    st1.displayInformation(); // after updating if i print the information again it will show updated one  

        System.out.println("-------------------------");
       System.out.println("performance : "+st1.performanceGrade(st1.gpa)) ;
   } 
}

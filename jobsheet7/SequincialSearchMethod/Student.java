package jobsheet7.SequincialSearchMethod;

public class Student {
    int nim,age;
    String name;
    double gpa;

    Student(){}
    Student (int nim,  String name,int age, double gpa){
        this.nim = nim;
        this.age = age;
        this.name= name;
        this.gpa = gpa;

         
    }

    public void Display(){
        System.out.println("NIM : "+nim);
         System.out.println(" Name : "+name);
          System.out.println(" Age : "+age);
           System.out.println(" Gpa : "+gpa);

    }
}

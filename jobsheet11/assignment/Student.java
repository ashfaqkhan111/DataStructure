package jobsheet11.assignment;
import java.util.*;

public class Student {
    Scanner in = new Scanner(System.in);
    String nim,name,className,studyProgram;

    Student(){}

Student(String nim, String name, String className, String studyProgram){
    this.nim = nim;
    this.name=name;
    this.className=className;
    this.studyProgram = studyProgram;
}

public void print(){
    System.out.println("Name : "+name);
    System.out.println("Nim : "+nim);
    System.out.println("Class Name : "+className);
    System.out.println("Study program : "+studyProgram);
   }  
}

package jobsheet11.experiment2;

public class Student {
    String nim, name, studyProgram, className;

Student(String nim, String name, String studyProgram, String className){
    this.nim = nim;
    this.name = name;
    this.studyProgram = studyProgram;
    this.className = className;
}
  
public void print(){
    System.out.println("Nim : "+nim);
    System.out.println("Name : "+name);
    System.out.println("Study Program : "+studyProgram);
    System.out.println("Class Name : "+className);
}
}

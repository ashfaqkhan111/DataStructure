package jobsheet6.Student;

public class Student254107020262 {
    String nim, name, studentClass;
    double gpa;

    Student254107020262(){}

    Student254107020262(String nim, String name, String studentClass, double gpa){
        this.nim = nim;
        this.name = name;
        this.studentClass = studentClass;
        this.gpa = gpa;

    }

    public void print(){
        System.out.println("NIM : "+nim+" Name : "+name+"Class : "+studentClass+" Gpa : "+gpa);
    }

}

 



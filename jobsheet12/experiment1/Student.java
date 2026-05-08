package jobsheet12.experiment1;

public class Student {
    String nim,name,className;
    double gpa;

    Student(){}

    Student (String nim,String name,String className,double gpa){
        this.nim = nim;
        this.name = name;
        this.className = className;
        this.gpa = gpa;
    }

public void print(){
    // System.out.printf("%10s %10s %10s %10s\n",nim,name,className,gpa);
    // System.out.println("Nim : "+nim);
    // System.out.println("Name : "+name);
    // System.out.println("Class : "+className);
    // System.out.println("Gpa : "+gpa);
        System.out.println(nim+" "+name+" "+className+" "+gpa);
}
    
}

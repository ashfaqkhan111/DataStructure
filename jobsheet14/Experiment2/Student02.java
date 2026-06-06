package jobsheet14.Experiment2;

public class Student02 {
    String nim,name,className;
    double gpa;

    Student02(){}

    Student02(String nim, String name, String className, double gpa){
        this.nim = nim;
        this.name = name;
        this.className = className;
        this.gpa = gpa;
    }

    public void print(){
        System.out.println(nim+" "+name+" "+className+" "+gpa);
    }
    
}

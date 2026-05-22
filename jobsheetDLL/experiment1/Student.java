package jobsheetDLL.experiment1;

public class Student {
    String nim,name,className;
    Double gpa;

    Student (String nim, String name, String className, double gpa){
            this.nim = nim;
            this.name = name;
            this.className = className;
            this.gpa = gpa;
    }

    public void print(){
        System.out.println(nim+" , "+name+" , "+className+" , "+gpa);
    }
}

package jobsheet12.Assignment;

public class Student {
    String nim,name,major;

    Student(String nim, String name, String major){

        this.nim = nim;
        this.name = name;
        this.major = major;
    }

    public void print(){
        System.out.println(nim+" "+name+" "+major);
    }
    
}

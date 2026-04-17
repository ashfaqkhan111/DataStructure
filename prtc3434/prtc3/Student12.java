package prtc3434.prtc3;

public class Student12 {
    String nim,name;
    double gpa;

    Student12 (){}

    Student12 (String nim, String name, double gpa){
        this.nim = nim;
          this.name = name;
        this.gpa = gpa;
      
    }

    public void print(){
        System.out.println("Name : "+name+"NIM : "+nim+"Gpa : "+gpa);
    }
    
}

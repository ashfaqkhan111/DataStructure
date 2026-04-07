package jobsheet6.lecturerAssignemt;

public class Lecturer {
    String id, name;
    boolean gender;
    int age;


Lecturer (){}

Lecturer (String id, String name, boolean gender, int age){
    this.id = id;
    this.name = name;
    this.gender = gender;
    this.age = age;

}

public void print(){
    System.out.println("ID : "+id+" Name : "+name+" Gender : "+gender+" Age : "+age);
}
}

package jobsheet3.task;

public class Lecturer254107020262 {
    public String code;
    public String name;
    public int age;
    public boolean gender;

    Lecturer254107020262(String code, String name, int age, boolean gender){
        this.code = code;
        this.name=name;
        this.age = age;
        this.gender = gender;

    }

    public void display(){
        System.out.println("Code :  "+code);
        System.out.println("Name :  "+name);
        System.out.println("Age :  "+age);
        System.out.println("Gender :  "+gender); 
    }
}

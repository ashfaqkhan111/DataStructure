package jobsheet10.Assignment;

public class ExcuseLetter1 {
    String id, name, className;
    char typeOfExcuse;
    int duration;
    
ExcuseLetter1(){}
ExcuseLetter1(String id, String name, String className, char typeOfExcuse, int duration){
                this.id = id;
                this.name = name;
                this.className = className;
                this.typeOfExcuse = typeOfExcuse;
                this.duration = duration;
}
public void print(){
    System.out.println("ID : "+id);
    System.out.println("Name : "+name);
    System.out.println("Class name : "+className);
    System.out.println("Type of Excuse : "+typeOfExcuse);
    System.out.println("Duration : "+duration);
}
}

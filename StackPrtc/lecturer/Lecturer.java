package StackPrtc.lecturer;

public class Lecturer {
    String lecturerNo, name, spic;

    Lecturer(){}
    Lecturer(String lecturerNo, String name, String spic){
        this.lecturerNo = lecturerNo;
        this.name = name;
        this.spic = spic;
    }

    public void print(){
        System.out.println(lecturerNo+" "+name+" "+spic);
    }
    
}

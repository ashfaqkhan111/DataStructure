package StackPrtc.Studentss;

public class Students {
    String nim,name,cName;

    Students(){}
    Students(String nim, String name, String cName){
        this.nim = nim;
        this.name = name;
        this.cName = cName;
    }

    public void print(){
        System.out.println(nim+" "+name+" "+cName);
    }
    
}

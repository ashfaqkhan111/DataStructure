package ptrc2;

public class Student {
    String name;
    int marks;

    Student(String name, int marks){
        this.name = name;
        this.marks = marks;
    }

    void Display (){
        
        System.out.printf("%-10s %-10s\n",name,marks);
    }

    public static void main (String [] args){

  

        Student [] st1 = new Student[3];
        

        st1[0] = new Student("Ashfaq", 95);
        st1[1] = new Student("Khan", 87);
        st1[2] = new Student("rayyan", 98);

              
System.out.printf("%-10s %-10s\n","name","Marks");
            for (int i=0; i<st1.length; i++){
               st1[i].Display();
            }

    }
    
}

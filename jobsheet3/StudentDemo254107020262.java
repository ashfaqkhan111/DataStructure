package jobsheet3;

public class StudentDemo254107020262 {
    public static void main(String [] args){
        Student254107020262 [] student = new Student254107020262[3];
        
        student [0] = new Student254107020262();   /// boject created 

        student [0].nim = "254107020262";
        student [0].name = "Ashfaq khan";
        student[0].Class = "Ti-1i";
        student[0].gpa = (float) 3.7;

        student [1] =new Student254107020262(); 

        student [1].name = "rayyan";
        student [1].nim = "333394842";
        student [1].Class = "Ti-1i";
        student [1].gpa = (float)3.8;

        student [2]=new Student254107020262();

        student [2].name = "atha";
        student [2].nim = "9435734534";
        student [2].Class = "Ti-1i";
        student [2].gpa = (float)3.2;

        System.out.println("NIM : "+student[0].nim);
        System.out.println("Name : "+student[0].name);
        System.out.println("Class : "+student[0].Class);
        System.out.println("Gpa : "+student[0].gpa);
        System.out.println("------------------------------------------------");
        System.out.println("NIM : "+student[1].nim);
        System.out.println("Name : "+student[1].name);
        System.out.println("Class : "+student[1].Class);
        System.out.println("Gpa : "+student[1].gpa);
        System.out.println("------------------------------------------------");
            System.out.println("NIM : "+student[2].nim);
        System.out.println("Name : "+student[2].name);
        System.out.println("Class : "+student[2].Class);
        System.out.println("Gpa : "+student[2].gpa);
    }
    
}

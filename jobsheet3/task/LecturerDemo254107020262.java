package jobsheet3.task;
import java.util.*;



public class LecturerDemo254107020262 {
    public static void main(String [] args){

        Scanner in = new Scanner(System.in);
        System.out.print("Enter number of lecturers  : ");
        int size = in.nextInt();

        Lecturer254107020262 [] lecturer = new Lecturer254107020262[size];

        String code,name;
        int age;
        boolean gender;

        for (int i=0; i<lecturer.length; i++){
            
in.nextLine();
            System.out.print("Enter Code : ");
            code = in.nextLine();

             System.out.print("Enter name : ");
            name = in.nextLine();
            

             System.out.print("Enter age: ");
            age = in.nextInt();

            
             System.out.print("Enter gender : ");
            gender = in.nextBoolean();

            

            lecturer[i] = new Lecturer254107020262(code, name, age, gender);
        }


        // for(Lecturer254107020262 l : lecturer){
        //     l.display();
        // }

        DataLecturer254107020262 data = new DataLecturer254107020262();

        data.dataAllLecturer(lecturer);
        data.numberOfLecturerPerGender(lecturer);
        data.avrageOfAgeLecturerPerGender(lecturer);
        data.infoOldestLecturer(lecturer);
        data.inforYoungest(lecturer); 
    }
    
}

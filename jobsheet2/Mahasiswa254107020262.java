package jobsheet2;
import java.util.*;

public class Mahasiswa254107020262{

}


 class Student {  //this class include all the method which will be executed by main method 
    String name;
    int nim;
    String studentClass;
    double gpa;

    

    void displayInformation(){ // display function 
        System.out.println("name : "+name);
        System.out.println("Nim : "+nim);
        System.out.println("Class : " +studentClass);
        System.out.println("GPA : "+gpa);

    }

    void updateClass(String newClass){ // change class
        studentClass = newClass;
        System.out.println("class updated");
    }

    void updateGpa (double newGpa){ // change gpa
        
            gpa = newGpa;
            System.out.print("gpa updated");
    }

    String performanceGrade (double gpa){ // convert numbers to words grades
    
        if (gpa < 0 || gpa >4){
            return "invalid ";
        }
        else if(gpa >= 3.5){
            return "Excellent";
        }
        else if( gpa >=3.0){
            return "Good";
        }
        else if (gpa >= 2.5){
            return "Avrage";
        }
        else {
             return "poor";
        }
           
        
    }
    
}

package jobsheet3.Course;

import java.util.Scanner;

public class Course254107020262 {
    public String code;
    public String name;
    public  int sks;
    public int totalHours;
    public Course254107020262 course[];

    public Course254107020262(int size){
        course = new Course254107020262[size];
    }

    public Course254107020262(String code, String name, int sks, int totalHours){
        this.code = code;
        this.name = name; 
        this.sks = sks;
        this.totalHours = totalHours;
    
    }

    public void addData(){

        Scanner in = new Scanner(System.in); 

       
         String code,name;
        int sks, totalHours;

        for (int i=0; i<course.length; i++){

            
            System.out.print("Enter course Code : ");
          code = in.nextLine();



            System.out.print("Enter course name : ");
            name = in.nextLine();

         
            
            System.out.print("Enter SKS : ");
            sks = in.nextInt();

            System.out.print("Enter Total hours : ");
            totalHours = in.nextInt();
            in.nextLine();

            

            

            course[i] = new Course254107020262(code, name, sks, totalHours);

                
        }
    }

    public void displayData(){
        for(int i =0; i<course.length; i++){
             System.out.println("Code :   "+course[i].code);
            System.out.println("Name :   "+course[i].name);
            System.out.println("SKS  :   "+course[i].sks);
            System.out.println("Total Hours :   "+course[i].totalHours);
        }
       
    }
    
}

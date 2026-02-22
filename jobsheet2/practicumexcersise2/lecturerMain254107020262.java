package jobsheet2.practicumexcersise2;

import java.util.*;

public class lecturerMain254107020262 {
    public static void main(String [] args){

        Lecturer lt1 = new Lecturer();          // object 

        lt1.idLecturer = "123456";             //// entries
        lt1.name = "mr.man";
        lt1.activeStatus = false;
        lt1.yearOfEntry = 2009;
        lt1.expertise = "Msc.maths";

        lt1.showInformation();                 // display


        Lecturer lt2 = new Lecturer("988465","mr.man2" ,true,2011,"BS.Cs"); // object with parameters
       
        lt2.showInformation();             // display of the object 2


            //// /// changing value of boject 1 & 2

        lt1.setStatusActive(true);
        lt1.changeSkill("english");

        lt2.changeSkill("maths");

        int W1 = lt1.calculateTimeWork(2026);
        int W2 = lt2.calculateTimeWork(2026);

        lt1.showInformation();  //// display of object 1 and 2 after changing values 
        lt2.showInformation();

        System.out.println("time work Lecturer one '" + lt1.name +"' :" +W1);
        System.out.println("time work Lecturer one '" + lt2.name +"' :" +W2);
    }
}

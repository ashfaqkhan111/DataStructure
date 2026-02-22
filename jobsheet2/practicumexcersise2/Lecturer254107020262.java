package jobsheet2.practicumexcersise2;

public class Lecturer254107020262 {  // i am not using this class beacuse it is too long to write 
    
}

class Lecturer{

    String idLecturer;
    String name;
    boolean activeStatus;
    int yearOfEntry;
    String expertise;
    

    public Lecturer(){                    //default constructer

    }

    public Lecturer (String idLecturer, String name, boolean activeStatus, int yearOfEntry, String expertise){  // parameter constructor 
        
        this.idLecturer = idLecturer;                                                    // this key word is used for refference to the attributes of class
        this.name = name;
        this.activeStatus = activeStatus;
        this.yearOfEntry = yearOfEntry;
        this.expertise = expertise;
        
    }

    void showInformation(){

        System.out.printf("\n\n%-15s %-15s %-15s %-10s %-15s ","ID","Name"," Status","Entry Year", "Experties\n");
        System.out.println("--------------------------------------------------------------------------------------------");
        System.out.printf("%-15s %-15s %-15s %-10s %-15s \n",idLecturer,name,activeStatus,yearOfEntry,expertise);
    }

    void setStatusActive(boolean activeStatus){                    // this method change status 
        this.activeStatus = activeStatus;
    }

    int calculateTimeWork(int currentYear){                        // this method calculate time of work in years
        return currentYear - yearOfEntry;
        
    }

    void changeSkill (String expertise){                           // this method change the experties 
        this.expertise = expertise;


    }
}

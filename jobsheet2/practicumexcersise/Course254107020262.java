package jobsheet2.practicumexcersise;

public class Course254107020262 { // iam not taking this class to create objects beacuse it it too long 
    
}

class Course{
    String courseCode;
    String courseName;
    int credits;
    int numberOfHours;
    int reduceHours;


void displayInformation(){
        System.out.printf("\n%-25s %-15s %-10s %-10s \n","Course code","Course name","Credits","hours\n");  // printf use to format results
        System.out.println("---------------------------------------------------------------------");
            System.out.printf("%-25s %-15s %-10s %-10s\n ",courseCode,courseName,credits,numberOfHours);

}

void updateCredits (int credits){                        // this function update credits hours 
    this.credits=credits;
    System.out.println("\n\ncredits updated!");
}

void addHours(int numberOfHours){ 
        this.numberOfHours += numberOfHours;                     // this function add numbers of hours       
        System.out.println("numbers of hours Added!");
}

void reduceHours(int reduceHours){

    if(reduceHours < this.numberOfHours){                          // this function reduced numbers of hours 
        this.numberOfHours = this.numberOfHours - reduceHours;

    System.out.println("---------------------------------------------------------------------");
        System.out.println("\nnumber of hours reduced! is : "+reduceHours );
    }

    else {
        System.out.print("\nnumber of hours not updated beacuse \n the reduced number of hours is \n greater thn number of hours");
    }


}

}

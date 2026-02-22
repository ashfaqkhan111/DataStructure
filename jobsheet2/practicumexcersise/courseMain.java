package jobsheet2.practicumexcersise;

public class courseMain {
    public static void main (String [] args){

        Course c1 = new Course();
        c1.courseCode = "12345";
        c1.courseName = "programming";
        c1.credits = 6;
        c1.numberOfHours = 8;
        
        c1.displayInformation();  // this function shouw the information before the updates

        c1.reduceHours(10);
        c1.updateCredits(5);

          c1.displayInformation();             // this function shows informations after updates 
    }
}

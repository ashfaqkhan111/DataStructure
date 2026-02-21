package jobsheet1;
import java.util.*;

public class LectureSchadule {
    static Scanner in = new Scanner(System.in);

    public static void main(String [] args){

        System.out.print("Enetr the number of courses : ");
        int n = in.nextInt();
        in.nextLine();

        String [][] Schadule = new String [n][4];

        inputData(Schadule);
        Display(Schadule);
    }

    public static void inputData (String [][] Schadule){

        for (int i=0; i<Schadule.length; i++){

            

            System.out.print("Enter Course Name : ");
            Schadule[i][0] = in.nextLine();
            System.out.print("ROOM : ");
            Schadule[i][1] = in.nextLine();
            System.out.print("Lacture Day : ");
            Schadule[i][2] = in.nextLine();
            System.out.print("Time : ");
            Schadule[i][3] = in.nextLine();
        }
    }

    public static void Display(String [][] Schadule){
        System.out.printf("%-17s %-10s %-15s %-15s\n","Course","Room","Lecture Day","Time");
        System.out.println("-------------------------------------------------------------------------");
        for (int i=0; i<Schadule.length; i++){
            System.out.printf("%-17s %-10s %-15s %-15s\n",Schadule[i][0],Schadule[i][1],Schadule[i][2],Schadule[i][3]);
        
        }
    }
    
}

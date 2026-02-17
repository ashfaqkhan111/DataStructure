package jobsheet1;
import java.util.*;

public class CalculateSemesterIP {
    

    public static String NumberToGrade(double Score){
        if(Score>=80) return "A";
        else if(Score >=73 && Score <80) return "B+";
        else if (Score >65 && Score <73 ) return "B";
        else if (Score > 60 && Score <65) return "C+";
        else if (Score > 50 && Score <60 ) return "C";
        else if (Score > 39 && Score < 50) return "D";
        else return "E";
        
    }

    public static double GradeToPoints (String points){
        switch (points){
            case "A" : return 4.0;
            case "B+" : return 3.5;
            case "B"  : return 3.0;
            case "C+" : return 2.5;
            case "C" : return 2.0;
            case "D" : return 1.5;
            case "E" : return 1.0;
            default : return 0.0;
        }
    }

    public static void main(String[]args){

        Scanner in = new Scanner (System.in);

        System.out.print("Enter number of courses : ");
        int NoCourses = in.nextInt();

        String [] CourseName = new String[NoCourses];
        double [] Score = new double [NoCourses];
        int [] Credit = new int [NoCourses];
        String [] Grade = new String[NoCourses];
        double [] Points = new double[NoCourses];

        double TotalPoints = 0;
        int TotalCredits = 0;

            System.out.println("==========");
            System.out.println("Input");
            System.out.println("==========");

        for (int i=0; i<NoCourses; i++){
            in.nextLine();
            System.out.print("Enter course Name : ");
            CourseName[i] = in.nextLine();
            

            System.out.print("Enter Score 0-100 : ");
            Score[i] = in.nextDouble();
            

            System.out.print("Enter Credits SKS : ");
            Credit[i] = in.nextInt();
            Grade[i] = NumberToGrade (Score[i]);
            Points[i] = GradeToPoints(Grade[i]);

            TotalPoints = Points[i]*Credit[i];
            TotalCredits += Credit[i];
        }

        double GPA = TotalPoints/TotalCredits;

            System.out.println("==========");
            System.out.println("Output");
            System.out.println("==========");

            System.out.printf("%-25s %-10s %-12s %-10s %-12s\n","Course","Score","Credit","Grade","Points");

        for (int i=0; i<NoCourses; i++){

            System.out.printf("%-25s %-10s %-12s %-10s %-12s\n",CourseName[i],Score[i],Credit[i],Grade[i],Points[i]);

        }

        System.out.println("======================");
        System.out.print(" GPA : "+GPA);


    }

}
package jobsheet1;
import java.util.*;

public class StuentEvaluation {

    public static void main (String []args){
    double result = input();
    CheckGrades(result);

    }

    public static double input(){
    Scanner in = new Scanner(System.in);

    System.out.print("Eneter the Assignments Marks : ");
    double Assignments = in.nextDouble();

    System.out.print("Eneter Quizz Marks : ");
    double Quizz = in.nextDouble();

    System.out.print("Eneter UTS marks : ");
    double UTS = in.nextDouble();

    System.out.print("Eneter UAS marks : ");
    double UAS = in.nextDouble();

    if (Assignments <0 || Assignments >100 || Quizz <0 || Quizz >100 
        || UTS <0 || UTS > 100 || UAS <0 || UAS >100
    ){
        System.out.println("Invalid number must be in 0-100");
        return input();
    } 

    double result = Calculation(Assignments, Quizz, UTS, UAS);

    return result;
    }

    public static double Calculation (double Assignments, double Quizz, double UTS, double UAS){

        double result = (Assignments*0.2)+(Quizz*0.2)+(UTS*0.3)+(UAS*0.3);
    

        return result;
    }

    public static void CheckGrades (double Score){
        
        System.out.println("====================");

        if (Score > 80){
            System.out.println(" 'PASS 'Garde A GPA 4 : ");
            System.out.println("Final Score : "+Score);
        }
        else if( Score >=73 && Score <=80){
        System.out.println("'PASS 'Grade B+ CPA : 3.5  " );
        System.out.println("Final Score : "+Score);
        }
        else if(Score >=65 && Score <=73){
            System.out.println("'PASS 'Grade B : 3.0  " );
            System.out.println("Final Score : "+Score);
        }
        else if (Score >=60 && Score <=65){
            System.out.println("'PASS 'Garde C+ GPA : 2.5  " );
            System.out.println("Final Score : "+Score);
        }
        else if (Score >= 50 && Score <=60) {
            System.out.println("'PASS 'Grade C GPA : 2.0 ");
            System.out.println("Final Score "+Score);
        }
        else {
            System.out.println("'Fail' ");
            System.out.println("Final Score :"+Score);
        }
        System.out.println("====================");
        
        
        

    }

    
    
    
}

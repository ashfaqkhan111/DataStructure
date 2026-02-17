package jobsheet1;
import java.util.*;

public class CarCityCode {
    
    public static void main(String[]args){

        Scanner in = new Scanner(System.in);
        
        char [] Code = {'A','B','D','E','F','G','H','L','N','T'};
        char [][] City = {
            {'B','A','N','T','E','N'},
            {'J','A','K','A','R','T','A'},
            {'B','A','N','D','U','N','G'},
            {'C','I','R','E','B','O','N'},
            {'B','O','G','O','R'},
            {'P','E','K','A','L','O','N','G','A','N'},
            {'S','E','M','A','R','A','N','G'},
            {'S','U','R','A','B','A','Y','A'},
            {'M','A','L','A','N','G'},
            {'T','E','G','A','L'}
        };

        System.out.print("Enter code : ");
        char input = in.next().toUpperCase().charAt(0);

        for (int i=0; i<Code.length; i++){
            if (input == Code[i]){
                System.out.print("City : ");
            

            for (int j=0; j<City[i].length; j++){
                System.out.print(City[i][j]);
            }
        }
        
        }
        return;
        
    }


}

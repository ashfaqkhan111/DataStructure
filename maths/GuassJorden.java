package maths;
import java.util.*;

public class GuassJorden {
    Scanner in = new Scanner (System.in);
   
    private int row;
    private int col;
    private double[][] matrix;

     GuassJorden(int row, int col){   //// constructor
        this.row = row;
        this.col = col;
       this.matrix = new double[row][col+1];
     }

     public void input (){
        System.out.println("Enter the elemets ");
        for (int i=0; i<row; i++){
            System.out.println("ENter for row "+(i+1));
            for(int j=0; j<col+1; j++){
                System.out.print("element "+(j+1)+"  : ");
                matrix[i][j] = in.nextDouble();
            }
        }
     }

        public void calculation(){

            for (int i=0; i<row; i++){
                if (matrix[i][i] ==0){
                    System.out.println(" \n!!!the system is inconsistent it has no solution some value are zero or divide by zero!!!\n");
                    return;
                }
                double piviot = matrix[i][i];

                for (int j=0; j<col+1; j++){
                    matrix [i][j] = matrix[i][j]/piviot;            ///piviot craeted 
                }                

                for(int k=0; k<row; k++){
                    if(k==i)
                        continue;
                        double factor = matrix[k][i];
                 
                for (int j=0; j<col+1; j++){
                    
                 matrix[k][j] = matrix[k][j] - factor*matrix[i][j];
                        }
                    
                }
                }
            }
        
     public void display(){
        System.out.print("\nidentical matrix\n");
        for(int i=0; i<row; i++){
            for (int j=0; j<col+1; j++){
                System.out.print(matrix[i][j]+"   ");
                

            }
            System.out.println();
        }
     }
     
     public void showResult(){

    System.out.println("\n''solution''\n");
    for (int i=0; i<row; i++){
        System.out.print("X"+(i+1)+" : ");
        System.out.println(matrix[i][col]);
        // for (int j=0; j<col+1; j++){
        //     System.out.print(matrix[i][j]);
        // }
    }
     }
}
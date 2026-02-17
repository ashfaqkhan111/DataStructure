package jobsheet1;
import java.util.*;

public class FlowerShop {
    public static void main(String []args){

        int [][] shopStock = {{10,5,15,7},{6,11,9,12},{2,10,10,5},{4,3,2,9}};

        int [] Prices ={75000,50000,60000,10000};

        Calculation(shopStock, Prices);
    }

    public static void Calculation(int [][]shopStock, int []Prices){
        for (int i =0; i<shopStock.length; i++){
            double  total = 0;

            for (int j=0; j<shopStock[i].length; j++){
                total += shopStock[i][j]*Prices[j];
            }

            System.out.println("income Royal Garden "+(i+1)+" : "+total);

            if (total >=1500000){
                System.out.println("Royal Garden "+(i+1)+" : Status is GOOD");
                System.out.println("--------------------------------------");
            }
            else {
                System.out.println("Royal Garden "+(i+1)+" : need Evaluation!");
                System.out.println("--------------------------------------");
            }
        }

    }


}

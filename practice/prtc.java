package practice;

public class prtc {

    public static void main(String []args){
       for (int i=0; i<=15; i++){
        if (i == 6 || i== 10 )
            continue;

        if (i % 2 !=0)
            System.out.print("*");

        else 
            System.out.print(i +" ");
       }
    }
    
}

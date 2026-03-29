package bruteforce;

public class factorial {
    public static void main (String [] args ){
    // int x =6;

    // int facto = 1;

    // for (int i=1; i<=x; i++){
    //     facto *=i;
    // }

    // System.out.print(facto);
System.out.print(fac(6));

}

public static double fac (double x){

    // double facto = 0;

    // // for (int i=1; i<=x; i++){
    //     facto = facto * x-1;
    // // }

    if (x ==1) {
        return 1;
    }
   double facto = x * fac(x-1);
   System.out.print("itration ..."+(x-1));
    return facto;
} 

}

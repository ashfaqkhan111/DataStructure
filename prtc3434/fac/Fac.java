package prtc3434.fac;

public class Fac {

    int a;
    String b;
    double c;
    /////
    void factorial1(int n){
        double r = 1;

        for (int i=1; i<=n; i++){
            r *=i;
        }

        System.out.print(r);
    }

    double factorial2 (int n){
       
        double r = 1;

        for (int i=1; i<=n; i++){
            r = r *i;
        }
        return r;
    }

    static void factorial3 (int n){
        double r = 1;
        for (int i=1; i<=n; i++){
            r=r*i;
        }
        System.out.println(r);
    }
    ///////
    
    double factorial4 (int n){
        if (n==1 || n==0){
            return 1;
        } else {
            double facto = 1;
            facto = n * factorial4(n-1);
            return facto;
        }
    }
}

package jobsheet5.factorial;

public class Factorial {
    
   int factorialBf (int x){        /// function for Bruteforce 

    ///// using for-loop////
    

        // int fac =1;

        // for (int i=1; i<=x; i++){
        //     fac = fac* i;
        // }

        // return fac;


        /// using while loop///
        
        int fac = 1;
        int i=1;
        while(i<=x){
            fac = fac*i;
            i++;
        }

        return fac;
    }



    int factorialDc (int x){          ///// function for Divide and conqurer 

        if (x==0 || x==1){
            return 1;
        }
        else {
            int facto = x*factorialDc (x-1);
        return facto;
        }

        
    }
}

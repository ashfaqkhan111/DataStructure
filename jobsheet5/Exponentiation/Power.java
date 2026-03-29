package jobsheet5.Exponentiation;

public class Power {
    int base;
    int exponent;

    Power(int base , int exponent){
        this.base = base;
        this.exponent = exponent;
    }

    int powerBf (int base, int exponent){              /// bruteforce

        int result = 1;

        for (int i=0; i<exponent; i++){
            result = result*base;
        }

        return result;
    }

    int powerDc (int base , int exponent){                //// Divide and conqurer 

        if (exponent == 1){
            return base;
        }else {
            if (exponent%2==1){
                return (powerDc(base, exponent/2) * powerDc(base, exponent/2)*base);
            }else 
            {
                return (powerDc(base, exponent/2)*powerDc(base, exponent/2));
            }
        }

    }
}

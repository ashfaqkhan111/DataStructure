package ptrc2;

public class s {
    public static void main (String [] args){
int [] a = {1,2,4,2,9,4,5,100,45,234,766,3333,9,9,0,4,2,3};

int mix = a[0];

for (int i=0; i<a.length; i++){
    if(mix > a[i]){
        mix = a[i];
    }

    System.out.print(mix);
}


    }
}

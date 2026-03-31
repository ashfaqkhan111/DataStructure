package bruteforce;

public class BubbleSort {
    public static void main (String [] args){
        int arr [] = {2,4,1,3,5,9,7};

        for (int i=0; i<arr.length-1; i++){
            //System.out.println("the outer loop run "+(i+1) +" \n");
            for (int j=0; j<arr.length-i-1; j++){
                // System.out.println("the inner loop runs  "+(j+1)+"\n");

                if (arr[j] > arr[j+1]){
                    int temp = arr[j];
                 
                    arr[j] = arr[j+1];

                    arr[j+1] = temp;
                }
            }
        }

        for (int num : arr){
            System.out.print(" "+num);
        }
    }
    
}

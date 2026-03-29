package bruteforce;

public class maximumValue {
    public static void main (String [] args){
        int arr[] = {0,2,4,65,44,23,-1,67,90,12,};
        
        int max = arr[0];

        int min = arr[0];

        for (int i=0; i<arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }

            else if (arr[i]< min){
                min = arr[i];
            }
        }
        System.out.println(max);
        System.out.println(min);
    }
    
}

package bruteforce;

public class MaximumSumOfArray {
    public static void main(String [] args){
        int arr [] = {1,3,4,5,6,7,7};
        int target = 3;

        int maxSum = 0;

        for (int i=0; i<=arr.length-target; i++){
            int sum =0; 

            for (int j=i; j<i+target; j++){
                sum += arr[j];
                if ( maxSum < sum)
                {
                    maxSum = sum;
                }
            }
            
        }
        System.out.print(maxSum);
    }
    
}

package DivideAndConqurer;

public class Maximum {
    public static void main (String [] args){
        int arr [] = {5,3,1,5,6,7,8};

        int max =  findMax (arr,0,arr.length-1);
        System.out.println(" "+max);
    }

    public static int findMax(int arr[], int left , int right){

        if (left == right){
            return arr[left];

        }

        int mid = (left+right)/2;

        int leftMax = findMax(arr, left, mid);
        int rightMax = findMax(arr, mid+1, right);

        return Math.max(leftMax, rightMax);

    }

    
}

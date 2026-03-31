package ptrc2;

public class sumDC {
    double arr[];

    sumDC (int size){
     arr = new double[size];
    }

        double sumbf(double arr[]){
        double result = 0;

        for (int i=0; i<arr.length; i++){
            result = result + arr[i];
        }

        return result;
    }

    double sumdc (double arr[], int left, int right ){
        if (left == right){
            return arr[left];
        }

        int mid = (left + right)/2;

        double leftMax = sumdc(arr, left, mid);
        double rightMax = sumdc(arr, mid+1, right);

        return leftMax+rightMax;
    }
}

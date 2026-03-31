package jobsheet5.sum;

public class Sum {
    double profit[];

    Sum(int size){
        profit = new double[size];
    }

   double totalBf (){
        double total = 0;

        for (int i=0; i<profit.length; i++){
            total += profit[i];
        }

        return total;
    }

    double totalDc (double profit[], int left, int right){
        if(left == right){
            return profit[left];
        }
        int mid = (left + right)/2 ;
        double leftSum = totalDc(profit, left, mid);
        double rightSum = totalDc(profit, mid+1, right);

        return leftSum+rightSum;
    }
}

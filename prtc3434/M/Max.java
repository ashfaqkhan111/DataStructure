package prtc3434.M;

public class Max {
   String name;
   int score;

   Max(){
   }

   Max(String name, int score){
    this.name = name;
    this.score = score;

   }

    void pArr(Max arr[]){
        for (int i=0; i<arr.length; i++){
            System.out.print (arr[i].name + arr[i].score);
        }
       
        // return null;

        
    }

    void maxfind(Max arr[]){

        Max result = arr[0];

        for (int i=0; i<arr.length; i++){
            if(arr[i].score > result.score){
                result = arr[i];
            }
        }

        System.out.print(result.score+" "+result.name);
    }

    static Max maxDC(Max arr[], int left, int right){

        if (left == right){
            return arr[left];
        }

        int mid = (left +right)/2;

        Max leftmax = maxDC(arr, left, mid);
        Max rigthMax = maxDC(arr, mid+1, right);

        if (leftmax.score > rigthMax.score){
            return leftmax;
        }else {
            return rigthMax;
        }
    }

}

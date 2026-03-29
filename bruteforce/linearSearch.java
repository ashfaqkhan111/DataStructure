package bruteforce;
public class linearSearch {
    public static void main (String [] args){
       int arr [] = {1,2,5,4,3,7,8,9,5,3,};
    int target = 8;

    for (int i=0; i<arr.length; i++){
        if (target == arr[i]){
            System.out.print("targdet found at index "+i+" value is "+arr[i]);
        }
    }
    
    

    // for (int i=0; i<arr.length; i++){
    //     System.out.print(", "+arr[i]+"  "+i);
    // }

    }
}

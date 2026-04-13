package jobsheet7.sort;

public class MergeSort {
  

   

    public void mergeSort(int [] listStd){
        sort(listStd, 0, listStd.length-1);

    }

    public void merge(int [] listStd, int left, int mid, int right){
        int temp [] = new int [listStd.length];
        for (int i = left; i<= right; i++){
            temp[i] = listStd[i];

        }

        int a = left;
         int b= mid+1;
         int c = left;

         while (a <= mid && b <= right){
            if (temp[a] <= temp[b]){
                listStd[c] = temp[a];
                a++;

            }else {
                listStd[c ] = temp[b];
                b++;
            }c++;

         }
         int s = mid -a; 
         for (int i=0; i<=s; i++){
            listStd[c+i] = temp[a+i];
         }
    }

    private void sort(int listStd[], int left, int right){
        if(left < right){
            int mid = (left + right)/2;
            sort(listStd, left, mid);
            sort(listStd, mid+1, right);
            merge(listStd, left,mid,right);
        }
    }

    public void printArray(int listStd[]){
        for (int i=0; i<listStd.length; i++){
            System.out.print(listStd[i]+" ");
        }
        System.out.println();
    }
    
}

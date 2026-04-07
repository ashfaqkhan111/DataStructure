package jobsheet6.sorting;

public class Sorting254107020262 {
    int data [];
   
    int size;
    

    //Sorting (){} ///default constructor

    Sorting254107020262 (int data []){
        this.data = data;
        this.size = data.length;
    }

    public void orignalData (){             //// print orignal array
        for (int num : data){
            System.out.print(num+" ");

           
        }
    }

public void bubbleSort(){               ////it will sort the array
    for (int i=0; i<size-1; i++){
        for (int j=0; j<size-i-1; j++){
            
            if(data[j] > data[j+1]){

                int temp = data[j];

                data[j] = data[j+1];

                data[j+1] = temp;
            }
        }
    }


}

public void Print(){               ///// print the bubble sorted array
    for ( int num : data){
        System.out.print(num+" ");

    }
}

public void selectionSort(){            //// Print Selection Sort
    for (int i=0; i<size-1; i++){
        int minIndex = i;

        for (int j=i+1; j<size; j++){
            if(data[j] < data[minIndex]){
                minIndex = j;

            }
        }

        int temp = data[minIndex];
        data[minIndex] = data[i];
        data[i] = temp;
    }

}


public void insertionSort (){        ///// print insertin sort 
    for (int i=0; i<size; i++){
        int key = data[i];
        int j =i-1;

        while (j>=0 && data[j] > key){
            data[j+1] = data[j];
            j--;
        }

        data[j+1] = key;
    }
}


}

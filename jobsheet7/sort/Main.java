package jobsheet7.sort;

public class Main {
    public static void main (String [] args){
      

        int listStd [] = {2,5,3,7,1,2,8,9};
        MergeSort ms = new MergeSort();

        System.out.println("before merge sort");
        ms.printArray(listStd);

        System.out.println("Sfter merge sort");
        ms.mergeSort(listStd);
        ms.printArray(listStd);

    }
    
}

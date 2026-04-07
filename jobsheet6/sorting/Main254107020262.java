package jobsheet6.sorting;

public class Main254107020262 {
    public static void main (String [] args){
        int data [] = {34,7,23,32,5,62};
        int dataB [] = {30,20,2,8,14};
        int dataC [] = {40,10,4,9,3};

        Sorting254107020262 sort = new Sorting254107020262(data);
        Sorting254107020262 sort2 = new Sorting254107020262(dataB);
        Sorting254107020262 sort3 = new Sorting254107020262(dataC);

        System.out.print("Orignal Array for Bubble sort : ");
        sort.orignalData();
        System.out.print("\norignal Array for Selection Sort : ");
        sort2.orignalData();
        System.out.print("\nOrignal Array for insertion Sort : ");
        sort3.orignalData();
        

        System.out.println("\n=====Bubble Sort======");
        System.out.print("The Array has been sorted : ");
        sort.bubbleSort();
        sort.Print();

        System.out.println("\n====Selection Sort Print====");
        System.out.print("Array sorted : ");
        sort2.selectionSort();
        sort2.Print();

        System.out.println("\n====Insertion Sort====");
        System.out.print("Array Sorted by insertion sort : ");
        sort3.insertionSort();
        sort3.Print();


    }
    
}

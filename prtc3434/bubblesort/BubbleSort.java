package prtc3434.bubblesort;

public class BubbleSort {
    int numbers;

    BubbleSort(){}

    BubbleSort(int numbers){
        this.numbers = numbers;


    }

    void bubble (BubbleSort []n){

        for (int i=0; i<n.length-1; i++){
            for (int j=0; j<n.length-i-1; j++){
                if (n[j].numbers > n[j+1].numbers){
                    int temp = n[j].numbers;

                    n[j].numbers = n[j+1].numbers;

                    n[j+1].numbers = temp;

                }
            }
        }
        // for (BubbleSort obj : n){
        //     System.out.print(obj.numbers);

        }
    

    void printData (BubbleSort []n){
        for (BubbleSort obj : n){
            System.out.print(obj.numbers);
        }
    }
}

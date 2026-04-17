package newPractice.bubble;

public class Process {
    Bubble arrB;

    Process(){}

    Process(Bubble arrB){
        this.arrB = arrB;
    }

    public  void bubbleSort(Bubble arrB[]){

        for (int i=0; i<arrB.length-1; i++){
            for (int j=0; j<arrB.length-i-1; j++){
                if (arrB[j].nim < arrB[j+1].nim){
                    Bubble temp = arrB[j];
                    arrB[j] = arrB[j+1];  
                    arrB[j+1] = temp;
                }
            }
        }
    }


        public Bubble binarySearch(Bubble arrB[], int key){
            int low = 0;
            int high = arrB.length-1;

            while (low <= high){
                int mid = (low + high)/2;

                if(arrB[mid].nim ==key){
                    return arrB[mid];

                }else if (key > arrB[mid].nim){
                    high = mid-1;
                }
            }
            return null;
        }
    
}

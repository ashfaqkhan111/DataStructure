package DivideAndConqurer;

public class Max {
    String name;
    int score;

    Max(String name, int score){
        this.name = name;
        this.score = score;

    }

     static void printArr (Max arr[]){
        for (int i=0; i<arr.length; i++){
            System.out.println(arr[i].name + arr[i].score);
        }
    }

}

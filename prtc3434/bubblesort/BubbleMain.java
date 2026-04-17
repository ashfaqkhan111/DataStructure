package prtc3434.bubblesort;
import java.util.*;

public class BubbleMain {
    public static void main (String []args){
       BubbleSort n [] = new BubbleSort[6];

      n[0] = new BubbleSort(8);
      n[1] = new BubbleSort(16);
      n[2] = new BubbleSort(15);
      n[3] = new BubbleSort(4);
      n[4] = new BubbleSort(11);
      n[5] = new BubbleSort(2);

      BubbleSort obj = new BubbleSort();

    //   obj.bubble(n);

    obj.printData(n);

    }
    
}

package QueuePrtc.Queue1;

public class Main {
   public static void main(String[] args) {
    Queue1 Q = new Queue1(3);
    Q.enqueue(1);
    Q.enqueue(3);
    Q.enqueue(4);

    Q.showFront();   
    Q.showRear();

    Q.dequeue();
    Q.showFront();
    Q.showRear();

    Q.emptyQueue();

    Q.showFront();
    Q.showRear();
   }


    
}

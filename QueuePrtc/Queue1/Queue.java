package QueuePrtc.Queue1;

public class Queue {
    int front,rear,size;
    int [] queue;

    Queue(){}
    Queue(int size){
        this.size = size;
        queue = new int[size];
        this.rear = -1;
        this.front = -1;


    }

    boolean isEmpty (){
        return front == -1;
    }

    boolean isFull(){
        return rear == size -1;
    }
    
    public void enqueue (int value){
        if (isFull()){
            System.out.println("the Queue is full");
            return;
        }

        if(front == -1){
            front =0;
        }
            rear++;
            queue[rear] = value;

            System.out.println("the value is enqueued : "+value);
    }

    public void dequeue (){
        if (isEmpty()){
            System.out.println("the queue is empty !!!");
            return;
        }
        if (front == rear){
            front =-1;
            rear =-1;

        }else {
            front ++;
        }
    }

    public void emptyQueue(){
        if (isEmpty()){
            System.out.println("the Queue is empty!!");
            return;
        }else{
            front = -1;
            rear = -1;
        }
    }
}

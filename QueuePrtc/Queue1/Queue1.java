package QueuePrtc.Queue1;

public class Queue1 {
    int front, rear, size;
    int [] queue;

    Queue1(int size){
        this.size = size;
        this.rear = -1;
        this.front = -1;
        queue = new int[size];
    }
    boolean isEmpty(){
        return front == -1;

    }
    boolean isFull(){
        return front == size-1;
    }

    public void enqueue(int value){
        if (isFull()){
            System.out.println("the Queue is full");
            return;
        }
        if (front == -1){
            front = 0;
        }
        rear++;
        queue[rear]=value;
        System.out.println("value enqueued"+value);
    }

    public void dequeue (){
        if (isEmpty()){
            System.out.println("the Queue is Empty!!");
            return;
        }
        if (front == rear){
            front = -1;
            rear = -1;

        }else{
            front++;
        }
    }

    public void showRear(){
        if (isEmpty()){
            System.out.println("Queue is empty");
            return;
        }else{
            int sRear = queue[rear];
            System.out.println("rear is : "+sRear);
        }
    }

    public void showFront(){
        if (isEmpty()){
            System.out.println("the Queue is Empty!!");
            return;
        }
        else{
            int sFront = queue[front];
            System.out.println("the front is : "+sFront);
        }
    }

    public void emptyQueue(){
        if (isEmpty()){
            System.out.println("the Queue is Empty!!");
            return;
        }else {
            front = -1;
            rear = -1;
        }
    }
    
}

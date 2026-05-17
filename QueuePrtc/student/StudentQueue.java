package QueuePrtc.student;

public class StudentQueue {
    Student [] queue;
    int front;
    int rear;
    int size;

    StudentQueue(int size){
        this.size = size;
        this.front = -1;
        this.rear = -1;
        queue = new Student[size];
    }

    boolean isFull (){
        return rear == size-1;
    }
    boolean isEmpty (){
        return front == -1;
    }

    public void enqueue(Student value){
        if (isFull()){
            System.out.println("the Queue is full !!!");
            return;
        }
        if (front == -1){
            front =0;
            
        }
        rear ++;
        queue [front]=value;
    }

    public void dequeue (){
        if (isEmpty()){
            System.out.println("the Queue is Empty !!");
            return;
        }if (front == rear){
            front = -1;
            rear = -1;
        }else{
            front++;
        }
    }

    public void showFront(){
        if (isEmpty()){
            System.out.println("the Queue is empty !!!");
            return;
        }else{
            System.out.println("the front is : "+queue[front].name);
        }
    }

    public void showRear (){
        if (isEmpty()){
            System.out.println("the Queue is empty !!!");
            return;
        }else{
            System.out.println("the rear is : "+queue[rear].name);
        }
    }

    public void eraseQueue(){
        if (isEmpty()){
            System.out.println("the Queue is already Empty!");
            return;
        }else{
            front = -1;
            rear = -1;

            System.out.println("the queue has been Empytied!!");
        }
    }
    
}

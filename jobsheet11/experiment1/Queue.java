package jobsheet11.experiment1;

public class Queue {
    int [] data;
    int front, rear ,size,max;

    public Queue (int n){
        max = n;
        data = new int[max];
        size =0;
        front = rear = -1;
    }

    public boolean isEmpty(){
        if (size ==0){
            return true;
        }else{
            return false;
        }
    }

    public boolean isFull(){
        if(size==max){
            return true;
        }else{
            return false;
        }
    }

    public void peek(){
        if(!isEmpty()){
            System.out.println("front data "+data[front]);
        }else {
            System.out.println("Queue is empty");
        }
    }

    public void print(){
        if (!isEmpty()){
            int i =front;
            while(i!=rear){
                System.out.print(data[i]+" ");
                i=(i+1)%max;
            }
            System.out.println(data[i]+" ");
            System.out.println("Number of elements"+ size);
        }else{
            System.out.println("Queue is Empty");
        }
    }

    public void clear(){
        if (!isEmpty()){
            front=rear=-1;
            size=0;
            System.out.println("All data has been deleted successfully ");
        }else{
            System.out.print("Queue is already empty");
        }
    }

    public void enqueue(int dt){
        if(!isFull()){
            if(isEmpty()){
                front=rear=0;
            }else{
                if(rear==max-1){
                    rear=0;
                }else{
                    rear++;
                }
            }
            data[rear]=dt;
            size++;
            System.out.printf("%d is successfully added at index %d\n",dt,rear);
        }else{
            System.out.print("Queue is full!!!");
        }
    }
    int dequeue(){
        int dt=0;
        if(!isEmpty()){
            dt=data[front];
            size--;
            if(size == 0){
                front =rear=-1;
            }else{
                front=(front+1)%max;
            }
            
        }else{
            System.out.print("Queue is empty!!");
        }
        return dt;
    }

    static void menu (){
        System.out.println("Avalible menu");
        System.out.println("1.Enqueue");
        System.out.println("2.Dequeue");
        System.out.println("3.Print");
        System.out.println("4.Peek");
        System.out.println("5.Clear");
        System.out.println("==================");
    }
    
}

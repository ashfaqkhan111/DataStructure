package jobsheet12.Assignment;

public class StudentQueue {
    Node front;
    Node rear;
    int size;

    StudentQueue(){
        front = null;
        rear = null;
        size = 0;
    }

    boolean isEmpty(){
        return front == null;
    }
    boolean isFull (){
        return false;
    }

    void clear(){
        front =null;
        rear = null;
        size =0;
        System.out.println("the Queue has been cleared");

    }
    void enqueue(Student data){
            Node newNode = new Node(data);
            if(isEmpty()){
                front = rear = newNode;
            }else{
                rear.next = newNode;
                rear = newNode;
            }
            size++;
            System.out.println("Student added");

    }

    Student dequeue(){
        if(isEmpty()){
            System.out.println("the Queue is empty");
            return null;
        }
        Student data = front.data;
        front = front.next;
        if(front == null){
            rear = null;
        }
        size--;
        return data;
    }
    void peekFront(){
        if(isEmpty()){
            System.out.println("Queue is empty");

        }else{
            System.out.println("the front is :");
            front.data.print();
        }
    }
    void peekrear(){
        if (isEmpty()){
            System.out.println("the Queue is empty ");
        }else {
            System.out.println("the rear is : ");
            rear.data.print();
        }
    }
    void totalStudents(){
        System.out.println("the total students are : "+size);
    }

    void PrintQueue(){
        if(isEmpty()){
            System.out.println("the Queue is empty");
            return;
        }
        Node temp = front;
        System.out.println("===Stduents===");
        while(temp != null){
            temp.data.print();
            System.out.println("--------------------");
            temp = temp.next;
        }
    }
    
}

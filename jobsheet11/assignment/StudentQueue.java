package jobsheet11.assignment;

public class StudentQueue {
    int front,rear,size,max;
    Student [] data;

StudentQueue(int n){
    max = n;
    front = -1;
    rear = -1;
    size = 0;
    data = new Student[max];
}

boolean isEmpty(){
    return size == 0;
}

boolean isFull(){
    return size == max;
}

public void enqueue(Student dt){
    if (isFull()){
        System.out.println("already full !!");
        return;
    }
    if(isEmpty()){
        front = rear =0;
    }
    else{
        rear=(rear+1)%max;
    }

    data[rear]=dt;
    size++;
}

public Student dequeue(){
    if (isEmpty()){
        System.out.println("Queue is empty");
        return null;
    }
    Student dt = data[front];
    size --;
    if(size == 0){
        front = rear =-1;
    }else{
        front = (front+1)%max;
    }
    return dt;
}

public void clear (){
    if(!isEmpty()){
        front=rear=-1;
        System.out.println("Queue cleared!");
    }else{
        System.out.print("the Queue is already clear");
    }
}

public void print(){
    if(isEmpty()){
        System.out.print("the Queue is empty");
    }

    int i = front;
    while(i!=rear){
        data[i].print();
        i=(i+1)%max;
    }
    data[i].print();
}

public void peek(){
    if (!isEmpty()){

    System.out.println("the front is : "+data[front].name);
    }else{
          System.out.print("the queue is empty");
        }
}

public void peek0f2Student(){
    if(!isEmpty()){
        System.out.println(" the first two students are : "+data[front].name+" & "+data[front+1].name);
    }else{
        System.out.print("the Queue is empty!");
    }

}

public void viewRear(){
    if(!isEmpty()){
        System.out.println("the last Student is : "+data[rear].name);
    }else{
        System.out.println("the Queue is empty!");
    }
}

public void menu (){
    System.out.println("=====================");
    System.out.println("1.Enqueue");
    System.out.println("2.Dequeue");
    System.out.println("3.peek");
    System.out.println("4.Peek first 2 student");
    System.out.println("5.view last Student");
    System.out.println("6.display all studets");
    System.out.println("7.Clear the queue");
    System.out.println("8.total number of students");
    System.out.println("9.total number of approved KRS students :");
    System.out.println("0.Exit");
    System.out.println("Enrtr option");
    System.out.println("=====================");
}
}

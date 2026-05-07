package jobsheet11.experiment2;

public class studentQueue {
    Student[] data;
    int front, rear, size, max;

    public studentQueue(int n) {
        max = n;
        data = new Student[max];
        size = 0;
        front = -1;
        rear = -1;
    }

    public boolean isFull() {
        return size == max;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void enqueue(Student dt) {
        if (isFull()) {
            System.out.println("Queue is full");
            return;
        }

        if (isEmpty()) {
            front = rear = 0;
        } else {
            rear = (rear + 1) % max;
        }

        data[rear] = dt;
        size++;

        System.out.printf("%s is successfully added at index %d\n", dt.name, rear);
    }

    public Student dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return null;
        }

        Student dt = data[front];
        size--;

        if (size == 0) {
            front = rear = -1;
        } else {
            front = (front + 1) % max;
        }

        return dt;
    }

    public void peek() {
        if (!isEmpty()) {
            System.out.println("Front data");
            data[front].print();
        } else {
            System.out.println("Queue is empty");
        }
    }

    public void print() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return;
        }

        int i = front;

        while (i != rear) {
            data[i].print();
            i = (i + 1) % max;
        }

        data[i].print();

        System.out.println("Number of elements : " + size);
    }
}
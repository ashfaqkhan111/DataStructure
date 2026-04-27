package jobsheet10.student;

public class ConversionStack {
    int [] binaryStack;
    int size;
    int top;
    public ConversionStack (){
        this.size = 32;
        binaryStack = new int [size];
        top =-1;
    }
    public boolean isempty (){
        return top == -1;
    }
    public boolean isFull(){
        return top == size -1;
    }

    public void push (int data){
        if (isFull()){
            System.out.println("stack is already full-filled!!");
        }else {
            top++;
            binaryStack[top] = data;
        }
    }
    public int pop (){
        if (isempty()){
            System.out.print("stack is empty");
            return -1;
        }else {
            int data = binaryStack[top];
            top--;
            return data;
        }
    }
    
}

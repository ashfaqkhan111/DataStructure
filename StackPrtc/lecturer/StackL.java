package StackPrtc.lecturer;

public class StackL {
    Lecturer [] stack;
    int top;
    int size;

    StackL(int size){
        this.size = size;
        this.top = -1;
        stack = new Lecturer[size];
    }
    
    boolean isFull (){
        return top == size -1;

    }

    boolean isEmpty (){
        return top == -1;
    }

    public void push(Lecturer value){
        if (isFull()){
            System.out.println("the stack is full!!");
            return;
        }else{
            top++;
            stack[top]=value;
            System.out.println("value pushed!!!");
        }
    }

    public void pop (){
        if (isEmpty()){
            System.out.println("the stack is empty !!");
            return;
        }else{
            top --;
            Lecturer removed = stack[top];
            System.out.println("the value is removed "+removed.name);
        }
    }

    public void peek(){
        if (isEmpty()){
            System.out.println("the stack is empty");
            return;
            
        }else{
            System.out.println("the top is : "+stack[top]);
        }
    }

}

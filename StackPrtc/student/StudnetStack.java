package StackPrtc.student;

public class StudnetStack {
    Students [] stack;
    int top;
    int size;

    StudnetStack(){}
    StudnetStack(int size){
        this.size = size;
        this.top = -1;
        stack = new Students[size];
    }

    boolean isEmpty (){
        return top == -1;
    }
    boolean isFull (){
        return top == size-1;
    }

    public void push(Students value){
        if (isFull()){
            System.out.println("the Stack is full!!!");
            return;
        }
        top++;
        stack[top] = value;
        System.out.println("value pushed : "+value);
    }
    public void pop (){
        if(isEmpty()){
            System.out.println("the stack is empty !!");
            return;
        }
        Students removed = stack[top];
        top--;
        System.out.println("the value poped : "+removed);
        
    }

    public void peek(){
        if (isEmpty()){
            System.out.println("the Stack is empty !!!");
            return;
        }
        System.out.println("the top is : "+stack[top].name);
    }

    public void emptyStack(){
        if (isEmpty()){
            System.out.println("the stack is already empty !!");
            return;
        }
        top = -1;
    }
    
}

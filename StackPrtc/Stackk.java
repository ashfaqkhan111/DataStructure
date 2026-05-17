package StackPrtc;

public class Stackk {
    int stack [];
    int top;
    int size;

    Stackk(int size){
        this.size = size;
        stack = new int[size];
        top = -1;
    }

    boolean isFull(){
        return top == size-1;

    }

    boolean isEmpty(){
        return top == -1;
    }

    public void push(int value){
        if(isFull()){
            System.out.println("the stack is full");
            return;
        }
        top++;
         stack[top] = value;
         
        
        System.out.println("Stack pushed!");
        
    
    }

    public void pop(){
        if (isEmpty()){
            System.out.println("the stack is empty!!");
            return;
        }
        int removed =stack[top];
        top--;

        System.out.println("removed "+removed);
    }

    public void peek(){
        if (isEmpty()){
            System.out.println("the stack is empty");
            return;
        }
        System.out.println("the top is "+stack[top]);
    }

    public void display (){
        if (isEmpty()){
            System.out.println("the Queue  is empty");
            return;
        }else{
            for (int i=0; i<size; i++){
                System.out.print(stack[i]+", ");
            }
        }
    }
    
}

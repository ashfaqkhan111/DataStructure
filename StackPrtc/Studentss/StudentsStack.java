package StackPrtc.Studentss;

public class StudentsStack {
    Students stack [];

    int top;
    int size;

    StudentsStack (int size){
        this.size = size;
        this.top = -1;
        stack = new Students[size];
    }

    boolean isFull (){
        return top == size -1;
    }
    boolean isEmpty (){
        return top == -1;
    }
    
    public void push(Students value){
        if (isFull()){
            System.out.println("the stack is full!!!");
            return;
        }else{
            top++;
            stack[top]=value;
            System.out.println("the value pushed"+value.name);
        }
    }

    public void pop(){
        if (isEmpty()){
            System.out.println("the stack is empty!!");
            return;
        }else{
                
                Students removed = stack[top];
                System.out.println("removed the value : "+removed.name);
                top--;
        }
    }

    public void peek(){
        if (isEmpty()){
            System.out.println("the Stack is empty!!!");
            return;
        }else{
            System.out.print("the top is : "+stack[top].name);
            }
    
    
        }
}


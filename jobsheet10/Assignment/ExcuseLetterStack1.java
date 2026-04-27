package jobsheet10.Assignment;

public class ExcuseLetterStack1 {
    ExcuseLetter1 [] stack;
    int top;
    int max;
     ExcuseLetterStack1 (int size){
        max =size;
        stack = new ExcuseLetter1[max];
        top = -1;
     }

     boolean isEmpty(){
        return top == -1;
     }

     boolean isFull (){
        return top == max -1;
     }
     void push (ExcuseLetter1 letter){
        if (!isFull()){
            stack[++top] = letter;
        }else {
            System.out.println("Stack is full");
        }
     }

    ExcuseLetter1 pop(){
        if(!isEmpty()){
            return stack[top--];

        }else {
            System.out.println("No letters to process.");
            return null;
        }
    }

    ExcuseLetter1 peek(){
        if (!isEmpty()){
            return stack[top];
        }else {
            return null;
        }
    }

    void search(String name){
        boolean found = false;

        for (int i= top; i >= 0; i--){
            if(stack[i].name.equalsIgnoreCase(name)){
                System.out.println("letter found");
                stack[i].print();
                found = true;
                break;
            }
        }
        if(!found){
            System.out.println("letter not found.");
        }
    }


    
}

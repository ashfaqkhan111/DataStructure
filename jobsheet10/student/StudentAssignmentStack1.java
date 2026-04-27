package jobsheet10.student;

public class StudentAssignmentStack1 {
    Student2 [] stack;
    int size;
    int top;
    Student2 firstStudent;

    StudentAssignmentStack1 (int size){
        this.size = size;

        top = -1;
        stack = new Student2[size];
    }

    boolean isFull(){
        if(top == size-1){
            return true;
        }else{
            return false;
        }

    }

    boolean isEmpty (){
        if(top==-1){
            return true;
        }
        else {
            return false;
        }
    }
void push(Student2 std){
    if(!isFull()){
        if(isEmpty()){              // Q5
            firstStudent = std;
        }
        top++;
        stack[top] = std;
    }else{
        System.out.println("stack is full!!");
    }
}

Student2 getFirstStudent(){
    return firstStudent;
}

    Student2 pop(){
        if(!isEmpty()){
            Student2 std = stack[top];
            top--;
            return std;
        }else{
            System.out.println("there is no data in stack!!");
            return null;
        }
    }

    Student2 peek(){
        if(!isEmpty()){
            return stack[top];
        }else {
            System.out.println("there is no data!!");
            return null;
        }
    }

    void print (){
        for (int i=0; i<=top; i++){
            System.out.println(stack[i].nim+"\t"+stack[i].name+"\t"+stack[i].className);
        }
        System.out.println(" ");
    }

    String convertToBinary (int grade){
       ConversionStack stack = new ConversionStack();
       while (grade > 0){
        int mod = grade % 2;
        stack.push(mod);
        grade = grade / 2;
       }
       String binary = "";
       while (!stack.isempty()){
        binary += stack.pop();
       }
       return binary;
    }


    
}

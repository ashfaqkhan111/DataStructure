package jobsheet12.experiment1;
import java.util.*;

public class Main {
    public static void main(String [] args){
        SingleLinkList sll = new SingleLinkList();

        Student std1 = new Student("001","Student1","Ti-1i",3.89);
        Student std2 = new Student("002","Student2","Ti-1i",2);
        Student std3 = new Student("003","Student3","Tw-1i",1.89);
        Student std4 = new Student("004","Student4","Te-1e",2.89);
        Student std5 = new Student("005","Student5","SIB",3.9);
    
            sll.print();
            sll.addFirst(std4);
            sll.print();
            sll.addFirst(std3);
            sll.print();
            sll.insertAfter(std3, "Student 4");
            sll.insertAt(2, std2);
            sll.print();

            System.out.println("==============================");
            System.out.println("Data at index 1 is : ");
            Student data = sll.getData(1);
            data.print();

            System.out.println("==============================");
            int index = sll.indexOf("Student1");
            System.out.println("Student 1 is located at index : "+index);

            sll.removeFirst();
            sll.removeLast();
            sll.print();
            sll.removeAt(0);
            sll.print();
    }
    
}

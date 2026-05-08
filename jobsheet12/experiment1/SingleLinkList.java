package jobsheet12.experiment1;

public class SingleLinkList {
    Node head;
    Node tail;

boolean isEmpty (){
    
        return (head==null);
    
}

public void print (){
    if(!isEmpty()){
        Node temp = head;
        System.out.println("Linkdlist data : ");
        while (temp != null){
            temp.data.print();
            temp=temp.next;
        }
    }else{
        System.out.println("linkedlist is empty!!");
    }
}

public void addFirst(Student std){
    Node newNode = new Node(std,null);
    if(isEmpty()){
        head = newNode;
        tail = newNode;
    }else{
        newNode.next = head;
        head = newNode;
    }
}

public void addLast (Student std){

    Node newNode = new Node(std,null);
    if(isEmpty()){
        head = newNode;
        tail = newNode;
    }else{
        tail.next = newNode;
        tail = newNode;
    }

}

public void insertAfter(Student std,String key){
    Node newNode = new Node(std,null);
    Node temp = head;
    do {
        if(temp.data.name.equalsIgnoreCase(key)){
            newNode.next = temp.next;
            temp.next = newNode;
            if(newNode.next==null){
                tail = newNode;
            }break;
        }
        temp = temp.next;

    }while(temp !=null);

}

public void insertAt (int index, Student std){

    if(index<0){
        System.out.println("Wrong Index!!");
    }else if(index == 0){
        addFirst(std);
    }else {
        Node temp = head;
        for(int i=0; i<index -1; i++){
            temp=temp.next;
        }
        temp.next = new Node(std, temp.next);
        if(temp.next.next == null){
            tail = temp.next;
        }
    }

}

Student getData(int idx){
    if(isEmpty()){
        System.out.println("LinkedList is empty");
        return null;
    }
    Node temp = head;
    for(int i=0; i<idx; i++){
        temp = temp.next;
    }
    return temp.data;
}

int indexOf(String key){
    if(isEmpty()){
        System.out.println("linked list is empty");
        return -1;
    }
    Node temp = head;
    int index = 0;
    while (temp != null&& temp.data.name.equalsIgnoreCase(key)){
        temp=temp.next;
        index++;
    }
    if(temp==null){
        return -1;
    }else{
        return index;
    }
}
public void removeFirst(){
    if(isEmpty()){
        System.out.println("Linkedlist is Empty");

    }else if(head == tail){
        head = tail = null;
    }else{
        head=head.next;
    }
}
public void removeLast(){
    if(isEmpty()){
        System.out.println("Linked list is empty");

    }else if(head == tail){
        head = tail =null;
    }else{
        Node temp = head;
        while(temp.next != tail){
            temp = temp.next;
        }
        temp.next=null;
        tail=temp;
    }
}

public void remove(String key){
    if(isEmpty()){
        System.out.println("linked List is empty");
    }else{
        Node temp = head;
        while (temp != null){
            if((temp.next.data.name.equalsIgnoreCase(key))&& (temp==head)){
                removeFirst();
                break;

            }else if(temp.next.data.name.equalsIgnoreCase(key)){
                temp.next = temp.next.next;
                if(temp.next == null){
                    tail = temp;
                }
                break;
            }
        }
    }
}

public void removeAt(int index){
        if(index==0){
            removeFirst();
        }else{
            Node temp = head;
            for (int i=0; i<index-1;i++){
                temp = temp.next;
            }
            temp.next = temp.next.next;
            if(temp.next == null){
                tail=temp;
            }
        }
}

}



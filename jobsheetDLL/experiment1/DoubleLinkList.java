package jobsheetDLL.experiment1;

public class DoubleLinkList {
    Node head;
    Node tail;

    DoubleLinkList (){
        head = null;
        tail = null;
    }

    boolean isEmpty (){
        return head == null;
    }
    
    public void addFirst (Student data){
        Node newNode = new Node(data);
        if (isEmpty()){
            head=tail=newNode;
        }else{
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }

    public void addLast(Student data){
        Node newNode = new Node(data);

        if (isEmpty()){
            head=tail=newNode;
        }else{
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    public void insertAfter(String key, Student data){
        Node newNode = new Node(data);
        Node currNode = head;
        while (currNode != null){
            if(currNode.data.nim.equalsIgnoreCase(key)){
                if (currNode == tail){
                    addLast(data);
                }else {
                    newNode.next = currNode.next;
                    newNode.prev = currNode;
                    currNode.next.prev = newNode;
                    currNode.next = newNode;
                }
                break;
            }
            currNode = currNode.next;
        }
        if(currNode == null){
            System.out.println("insertion failed key not founded "+key);
        }
    }
    public void print(){
        if (!isEmpty()){
            Node currNode = head;

            while (currNode != null){
                currNode.data.print();
                currNode = currNode.next;
            }
            System.out.println("");

        }else{
            System.out.println("the Linked list is currently empty");
        }
    }

    public void removeFirst(){
        if (isEmpty()){
            System.out.println("Linked list is currently Empty!!");
            return;
        }else if(head == tail){
            head=tail=null;
        }else{
            head = head.next;
            head.prev = null;
        }
        
    }

    public void removeLast(){
        if (isEmpty()){
            System.out.println("linked list is currently Empty");
            return;
        }else if(head == tail){
            head = tail = null;
        }else{
            tail = tail.prev;
            tail.next=null;
        }
    }

    public void removeAtIndex(int index){
        if(isEmpty()){
            System.out.println("Linked list is empty");
            return;
        }else if(index == 0){
            removeFirst();
        }else{
            Node temp = head;
            for (int i=0; i<index; i++){
                temp=temp.next;
            }
            if(temp == tail){
                removeLast();
            }else{
                temp.prev.next = temp.next;
                temp.next.prev = temp.prev;
            }
        }
    }
}

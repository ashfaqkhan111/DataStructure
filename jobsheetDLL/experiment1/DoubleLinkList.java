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

public void add(int index, Student data) {
    if (index < 0) {
        System.out.println("Invalid index");
        return;
    }

    if (index == 0) {
        addFirst(data);
        return;
    }

    Node newNode = new Node(data);
    Node temp = head;

    int i = 0;

    while (temp != null && i < index) {
        temp = temp.next;
        i++;
    }

    if (temp == null) {
        addLast(data);
        return;
    }

    Node prevNode = temp.prev;

    prevNode.next = newNode;
    newNode.prev = prevNode;

    newNode.next = temp;
    temp.prev = newNode;
}

public void removeAfter(String key) {
    Node temp = head;

    while (temp != null && !temp.data.nim.equalsIgnoreCase(key)) {
        temp = temp.next;
    }

    if (temp == null || temp.next == null) {
        System.out.println("No node exists after key: " + key);
        return;
    }

    Node toDelete = temp.next;

    temp.next = toDelete.next;

    if (toDelete.next != null) {
        toDelete.next.prev = temp;
    } else {
        tail = temp;
    }
}

public Student getFirst() {
    if (isEmpty()) {
        System.out.println("List is empty");
        return null;
    }
    return head.data;
}

public Student getLast() {
    if (isEmpty()) {
        System.out.println("List is empty");
        return null;
    }
    return tail.data;
}

public Student getIndex(int index) {
    if (isEmpty() || index < 0) {
        System.out.println("Invalid index");
        return null;
    }

    Node temp = head;
    int i = 0;

    while (temp != null && i < index) {
        temp = temp.next;
        i++;
    }

    if (temp == null) {
        System.out.println("Index out of range");
        return null;
    }

    return temp.data;
}

public int getSize() {
    int count = 0;
    Node temp = head;

    while (temp != null) {
        count++;
        temp = temp.next;
    }

    return count;
}

public int indexOf(String key) {
    Node temp = head;
    int index = 0;

    while (temp != null) {
        if (temp.data.nim.equalsIgnoreCase(key)) {
            return index;
        }
        temp = temp.next;
        index++;
    }

    return -1;
}
}


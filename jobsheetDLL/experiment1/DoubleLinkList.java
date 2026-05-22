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
}

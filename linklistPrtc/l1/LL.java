package linklistPrtc.l1;

class LL {
    Node head;

     public void addFirst(String data){
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
        
    }

    public void addLast (String data){
        Node newNode = new Node(data);
        if (head == null){
            head = newNode;
        }

        Node lastNode = head;
        while (head != null){
            lastNode = lastNode.next;
        }
        lastNode = newNode;

    }
    public void printList (){
        Node currNode = head;
        while (currNode != null){
            System.out.print(currNode.data+" -> ");
            currNode = currNode.next;
        }

        System.out.print("null");
    }
}

 class Node {
    String data;
    Node next;

    Node(String data){
        this.data = data;
        this.next = null;
    }

   
}

class Main{
    public static void main(String [] args) {
        LL list = new LL();
        list.addLast("khan");
        list.addFirst("is");
        list.printList();

    }
}

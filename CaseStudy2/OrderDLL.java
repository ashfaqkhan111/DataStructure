package CaseStudy2;

public class OrderDLL {
   OrderNode head;
   OrderNode tail;
   int orderCounter = 1;

   OrderDLL(){
    head = null;
    tail = null;
   }

   boolean isEmpty(){
    return head == null;
   }

   public void addOrder(OrderDetails details){
    OrderNode newNode = new OrderNode(details);

    if (isEmpty()){
        head = tail = newNode;
    }else{
        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
    }

   }

   public void printDetails(){
    if (isEmpty()){
        System.out.println("The Queue is empty ");
        return;
    }

    System.out.printf("%-10s %-10s %-15s %-10s %-15s\n","Order ID","Quantity","Food Name","Price","Buyer");
    System.out.println("\n------------------------------------------------------------------------------------");

    OrderNode currNode = head;

    while(currNode != null){
        currNode.details.print();
        currNode = currNode.next;
    }
 
   }

   public void sortOrder(){
    if (head == null){
        return;
    }
    boolean swapped;

    do {
        swapped = false;

        OrderNode currNode = head;
         while (currNode.next != null){
            String currFood = currNode.details.foodName;
            String nextFood = currNode.next.details.foodName;

            if(currFood.compareToIgnoreCase(nextFood) > 0){
                OrderDetails temp = currNode.details;

                currNode.details = currNode.next.details;

                currNode.next.details = temp;
                swapped = true;
            }
            currNode = currNode.next;
         }
    }while(swapped);
   }

   public void revanue (){
    double total = 0;

    OrderNode currNode = head;

    while (currNode != null) {
        total += currNode.details.quantity * currNode.details.price;

        currNode = currNode.next;
    }
    System.out.println("total Revenue of the restorent : "+total);
   }
    
}

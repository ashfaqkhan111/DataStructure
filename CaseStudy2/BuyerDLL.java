package CaseStudy2;
import java.util.*;

public class BuyerDLL {
    BuyerNode head;
    BuyerNode tail;

    BuyerDLL (){
        head = null;
        tail = null;
    }

    boolean isEmpty(){
        return head==null;
    }

    public void enqueue(BuyerDetails details){
            BuyerNode newNode = new BuyerNode(details);

            if (isEmpty()){
                head = tail = newNode;
            }
            else {
               tail.next = newNode;
               newNode.prev = tail;
               tail = newNode;
            System.out.print("data of coustmer '"+details.name+"' is enterd");
            }
    }

    public BuyerDetails dequeue (){
        if (isEmpty()){
            System.out.println("the Queue is already empty ");
            return null;
        }
        BuyerDetails removedData = head.details;

        if (head == tail){
            head = tail = null;
        }else {
            head = head.next;
            head.prev = null;
        }
        return removedData;
    }

    public void print(){
        
        if (isEmpty()){
            System.out.println("there is no data ");
            return;
        }else{
            BuyerNode currNode = head;

            while (currNode != null){
                currNode.details.print();
                currNode = currNode.next;
                System.out.println("=====================");
            }
        }

    }

    public void processQueue(OrderDLL order){
        Scanner in = new Scanner(System.in);


        if (isEmpty()){
            System.out.println("the Queue is Empty !!");
            return;
        }

        BuyerDetails processBuyer = dequeue();

        System.out.println("Buyer : "+processBuyer.name);
        System.out.println("---------------------------- ");

        System.out.println("Served buyer  ");
        System.out.println("---------------------------- ");
        processBuyer.print();

        System.out.print("Food name      : ");
        String foodName = in.nextLine();

        System.out.print("Enter quantity : ");
        int quantity = in.nextInt();

        System.out.print("Enter Price    : ");
        int price = in.nextInt();
        
        OrderDetails orders = new OrderDetails(order.orderCounter, foodName, quantity, price, processBuyer);
        order.orderCounter++;
        order.addOrder(orders);

        System.out.println("the order has been sucessfully added");

    }

} 

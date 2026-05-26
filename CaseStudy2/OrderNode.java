package CaseStudy2;

public class OrderNode {
    
    OrderDetails details;

    OrderNode next;
    OrderNode prev;

    OrderNode (){}

    OrderNode (OrderDetails details){
        this.details = details;
        this.prev = null;
        this.next = null; 

    }

    OrderNode (OrderDetails details, OrderNode next, OrderNode prev){
        this.details = details;
        this.next = next;
        this.prev = prev;
    }
}

package ModifiedCaseStudy2;

public class BuyerNode {
    BuyerDetails details;
    BuyerNode next;
    BuyerNode prev;

    BuyerNode(){}

    BuyerNode(BuyerDetails details){
        this.details = details; 
        this.next = null;
        this.prev = null;
    }

    BuyerNode(BuyerDetails details, BuyerNode next, BuyerNode prev){
        this.details=details;
        this.next=next;
        this.prev = prev; 
    }
    
}

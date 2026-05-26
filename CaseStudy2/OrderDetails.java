package CaseStudy2;

public class OrderDetails {
    int orderId, quantity;
    String foodName;
    double price;
    BuyerDetails buyer;

    OrderDetails (int orderId, String foodName, int quantity, double price, BuyerDetails buyer){
                this.orderId = orderId;
                this.quantity = quantity;
                this.foodName = foodName;
                this.price = price;
                this.buyer = buyer;
    }

    public void print(){
        System.out.printf("%-10s | %-10s | %-15s | %-10s | %-15s\n",orderId,quantity,foodName,price,buyer.name);
        
    }

   

    
}

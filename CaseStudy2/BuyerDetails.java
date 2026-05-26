package CaseStudy2;

public class BuyerDetails {
    String name , phoneNo;
    int customerCounter;

    BuyerDetails(String name, String phoneNo, int customer){
        this.name = name;
        this.phoneNo = phoneNo;
        this.customerCounter = customer;
    }

    public void print(){
        System.out.println("Queue no     : "+customerCounter);
        System.out.println("Name         : "+name);
        System.out.println("Phone Number : "+phoneNo);
    }
    
}

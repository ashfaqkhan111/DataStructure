package ptrc2;

public class Car{
    String brand;
    double price;
    
    
    Car(String brand, double price){
        this.brand = brand;
        this.price = price;
    }

    void show(){
        System.out.printf("%-12s %-12s\n",brand,price);
    }

    public static void main(String [] args){
        Car[] car = new Car[2];

        car[0] =new Car("BMW", 21324) ;
      
        car[1] = new Car("Supra", 21324) ;
       
        

        System.out.printf("%-12s %-12s\n","Brand","Price");

        for (int i=0; i<car.length; i++){
            car[i].show();
        }
    }
}
package phone;
import java.util.*;

public class Ph1 {
    public int rYear;
    public String name;
     public Ph1 arr [];

     public Ph1 (int size) {
        arr = new Ph1[size];
     }

     public Ph1 (int rYear, String name){
        this.rYear=rYear;
        this.name=name;

     }

     public void addData(){
        Scanner in = new Scanner(System.in);
        for (int i=0; i<arr.length; i++){
            System.out.print("enter name ");
            name = in.nextLine();
            System.out.print("enter Realses Year ");
            rYear= in.nextInt();

            in.nextLine();

            arr[i] = new  Ph1(rYear,name);
        }
        
     }

     public void display (){
        for (int i=0; i<arr.length; i++){
            System.out.println("name "+arr[i].name);
             System.out.println("realese "+arr[i].rYear);

        }
     }
    
     public void newest (){
       System.out.println("======new=======");
      Ph1 newes = arr[0];
      for (int i=1; i<arr.length; i++){
         if(arr[i].rYear > newes.rYear){
            newes = arr[i];
         }

         
      }
      
      System.out.print(newes.rYear);
    
     }
    
}

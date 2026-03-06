
package practice;
public class delay {
    public static void main (String [] args){
        
    
        try {
            System.out.println("Hello");
            
            Thread.sleep(500);   // 300 milliseconds = 0.3 seconds
            
            System.out.println("World");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
    
    


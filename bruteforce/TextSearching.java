package bruteforce;

public class TextSearching {
    public static void main (String [] args){
       String txt  = "my name is khan";

       String target = "a";

       int index = txt.indexOf(target);

       if (txt.contains(target) && index !=-1){
        System.out.print("target found at index "+index);

       }
       else {
        System.out.print("target didt'n found !!!");
       }

       return;
    }
    
}

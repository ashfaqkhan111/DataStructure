package bruteforce;

public class TextSearching {
    public static void main (String [] args){
       String txt  = "khan rayyan atha pak chaya";

       String target = "at";

       int index = txt.indexOf(target);

       if (txt.contains(target) && index !=-1){
        System.out.print("target found at index "+index);

       }
       else {
        System.out.print("target didt'n found !!!");
       }
    }
    
}

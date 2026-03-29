package bruteforce;

public class Stringt {
    public static void main (String [] args){
        String Text = "ashfaq khan is great ";

        String target = "s";

        int index = Text.indexOf(target);
        
             if (Text.contains(target) && index != -1 ){
            System.out.print("target found at index "+index);
            
        }
        else {
            System.out.print("target not found!!!" + index);
        }

        
       
        System.out.print("index of text "+Text.length());
    }
    
}

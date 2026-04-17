package prtc3434.text;
import java.util.*;
public class TxtMain {
    public static void main(String [] args ){
        Scanner in = new Scanner (System.in);

        System.out.print("enter Text : ");
        String txt = in.nextLine();

        System.out.print("enter Target : ");
        String target = in.nextLine();

        Txt obj = new Txt();

        obj.textSeacrh(txt, target);

        
    }
    
}

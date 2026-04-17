package prtc3434.text;

public class Txt {
    void textSeacrh (String txt, String target){

        int index = txt.indexOf(target);

        if(txt.contains(target) && index != -1){
            System.out.print("target found! at "+index);
        }
        else {
            System.out.print("target not founded");
        }

    }
}

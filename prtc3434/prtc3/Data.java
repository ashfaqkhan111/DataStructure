package prtc3434.prtc3;

public class Data {
    Student12 [] arr;
    int idx;

    Data(int size){
        arr = new Student12[size];
        int idx;
    }

    

    public void add(Student12 student){
        if ( idx < arr.length){
            arr[idx] = student;
            idx++;
        }
        else {
            System.out.print("no empty place");
        }
    }

    public void print(){
        for (int i=0; i<idx; i++){
            arr[i].print();
        }
    }


}

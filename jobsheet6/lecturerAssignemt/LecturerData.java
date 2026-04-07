package jobsheet6.lecturerAssignemt;

public class LecturerData {
    Lecturer listLecturer [];
    int idx;


    LecturerData (int size){
        listLecturer = new Lecturer[size];
        idx =0;
    }

    public void add (Lecturer lecturer){
        if (idx < listLecturer.length){
            listLecturer[idx] = lecturer;
            idx++;
        }else {
            System.out.print("list full");
        }
    }

    public void print(){
        for (int i=0; i<idx; i++){
            listLecturer[i].print();
        }
    }

    public void sortASC(){
        for (int i=0; i<idx-1; i++){
            for (int j=0; j<idx-i-1; j++){
                if(listLecturer[j].age > listLecturer[j+1].age){
                    Lecturer temp = listLecturer[j];

                    listLecturer[j] = listLecturer[j+1];

                    listLecturer[j+1] = temp;
                }
            }
        }
    }


    public void sortDSC (){
        for (int i=0; i<idx-1; i++){
            int minIndex = i;

            for (int j=i+1; j<idx; j++){
                if (listLecturer[j].age > listLecturer[minIndex].age){
                    minIndex = j;
                }
            }

            Lecturer temp = listLecturer[i];

            listLecturer[i] = listLecturer[minIndex];
            listLecturer[minIndex] =temp;
        }
    }
}

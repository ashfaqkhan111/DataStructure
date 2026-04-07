package jobsheet6.Student;

public class TopStudent254107020262 {
    Student254107020262 [] listStudents;
    int idx;


    public TopStudent254107020262(int size) {
        listStudents = new Student254107020262[size];
        idx =0;
        //TODO Auto-generated constructor stub
    }

    public void add(Student254107020262 student){
        if (idx < listStudents.length){
            listStudents[idx] = student;
            idx ++;

        }else {
            System.out.print("list is full!");
        }
    }

    public void print (){
        for (int i=0; i<idx; i++){
            listStudents[i].print();
        }
    }

    public void bubbleSort (){
        for (int i=0; i<idx-1; i++){
            for (int j=0; j<idx-i-1; j++){
                if(listStudents[j].gpa < listStudents[j+1].gpa ){
                    Student254107020262 temp = listStudents[j];
                    listStudents[j] = listStudents[j+1];
                    listStudents[j+1] = temp;
                }
            }
        }
    }


    public void selectionSort (){
        for (int i=0; i<idx-1; i++){
            int minIndex = i;

            for(int j=i+1; j<idx; j++){
                if(listStudents[j].gpa < listStudents[minIndex].gpa){
                    minIndex=j;
                }
            }

            Student254107020262 temp = listStudents[minIndex];
            
            listStudents[minIndex] = listStudents[i];

            listStudents[i] = temp ;

        }
    }


    public void insertionSort (){
        for (int i=0; i<idx; i++){
            Student254107020262 temp = listStudents[i];
            int j=i;

            while (j>0 && listStudents[j-1].gpa >temp.gpa){
                listStudents[j] = listStudents[j-1];
                j--;
            }

            listStudents[j] = temp;
        }
    }


    
}

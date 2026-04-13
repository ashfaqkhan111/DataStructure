package jobsheet7.SequincialSearchMethod;

public class SearchSrudent {
    Student []listStd;
    int idx;

    SearchSrudent(int size){
        listStd = new Student[size];
        idx =0;
    }

    public void add(Student student){
        if (idx < listStd.length){
            listStd[idx] = student;
            idx++;

        }else {
            System.out.print("no space ");
        }

    }

    public void displayData(){
        for (int i=0; i<idx; i++){
            listStd[i].Display();
        }
    }

    public int findSeqSearch (int search){
        int position = -1;
         for(int i=0; i<listStd.length; i++){
            if(listStd[i].nim == search){
                position = i;
                break;
            }
         }
         return position;
    }

    public void showPosition(int x, int pos){
        if(pos != -1){
            System.out.println("Data : "+x + " is found at index-"+pos);
        }
        else {
            System.out.println("Data "+x+" is not found ");
        }
    }

    public void showData(int x, int pos){
        if(pos != -1){
            System.out.println("NIM \t: "+x);
            System.out.println("Name \t: "+listStd[pos].name);
            System.out.println("Age \t: "+listStd[pos].age);
            System.out.println("Gpa \t: "+listStd[pos].gpa);
        } else {
            System.out.print("Data "+x+" is not found ");
        }
    }


    public int findBinarySearch(int search, int left, int right){
                    if(left <= right){
                        int mid = (left + right)/2;
                        if(search == listStd[mid].nim){
                            return (mid);
                        }else if (listStd[mid].nim > search){
                            return findBinarySearch(search, left, mid-1);

                        }else {
                            return findBinarySearch(search, mid-1, right);
                        }
                    }
                    return -1;
    }

    
}

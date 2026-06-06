package jobsheet14.Experiment2;

public class BinaryTree02 {
    Student02 [] data;
    int idxLast;

    public BinaryTree02(){
        data = new Student02[10];
        idxLast = -1;
    }

   public void populateData(Student02[]data, int idxLast){
        this.data = data;
        this.idxLast = idxLast;
    }

    public void traverseInOrder(int idxStart){
        if(idxStart <= idxLast){
            if (data[idxStart] != null){
                traverseInOrder(2*idxStart+1);
                data[idxStart].print();
                traverseInOrder(2*idxStart+2);
            }
        }
    }
    
}

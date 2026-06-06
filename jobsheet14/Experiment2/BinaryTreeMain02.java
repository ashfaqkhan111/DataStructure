package jobsheet14.Experiment2;

public class BinaryTreeMain02 {
    public static void main(String[] args) {
        BinaryTree02 bta = new BinaryTree02();
        Student02 m1 = new Student02("244107020138", "Devin", "TI-1I", 3.57);
        Student02 m2 = new Student02("244107020023", "Dewi", "TI-1I", 3.85);
        Student02 m3 = new Student02("244107020225", "Wahyu", "TI-1I", 3.21);
        Student02 m4 = new Student02("244107020076", "Angelina", "TI-1I", 3.54);
        Student02 m5 = new Student02("244107020223", "Andhika", "TI-1I", 3.72);
        Student02 m6 = new Student02("244107020226", "Bima", "TI-1I", 3.37);
        Student02 m7 = new Student02("244107020181", "Eiyu", "TI-1I", 3.46);

        Student02[] data = {m1, m2, m3, m4, m5, m6, m7};
         bta.populateData(data, data.length-1);
        System.out.println("In-order traversal:");
         bta.traverseInOrder(0);
    }
}



package jobsheetDLL.experiment1;

public class Main {
    public static void main(String[] args) {
        DoubleLinkList dll = new DoubleLinkList();

        dll.print();
        dll.addFirst(new Student ("111","Anton","Ti-1i",3.57));
        dll.print();
        dll.addLast(new Student ("112","probwo","Ti-1i",3.7));
        dll.print();
        dll.addFirst(new Student ("113","Herco","Ti-1i",3.89));
        dll.print();
        dll.insertAfter("111", new Student("114","Rizki","Ti-1i",3.8));
        dll.print();
        dll.insertAfter("112", new Student("115","Henzal","Ti-1i",3.8));
        dll.print();
        dll.insertAfter("120", new Student("114","Eiyu","Ti-1i",3.8));
        dll.print();
    
    
    }
    
}

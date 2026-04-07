package jobsheet6.lecturerAssignemt;

public class Main {
    public static void main (String [] args){
        LecturerData lecturerData = new LecturerData(10);

        lecturerData.add(new Lecturer("2201","khan",true,43));
        lecturerData.add(new Lecturer("2202","Alice",true,47));
        lecturerData.add(new Lecturer("2203","rayyan",true,45));
        lecturerData.add(new Lecturer("2204","aleender",true,42));
        lecturerData.add(new Lecturer("2205","Attha",true,34));
        lecturerData.add(new Lecturer("2206","ringa",true,43));
        lecturerData.add(new Lecturer("2207","habibi",true,43));
        lecturerData.add(new Lecturer("2208","bagas",true,48));
        lecturerData.add(new Lecturer("2209","fauzan",true,32));
        lecturerData.add(new Lecturer("22010","irgi",true,31));

        lecturerData.print();

        lecturerData.sortASC();
        System.out.println("=========Using bubble sort youngest to oldest=========");
        lecturerData.print();

        lecturerData.sortDSC();
        System.out.println("=======using selection sort oldest to youngest========");
        lecturerData.print();
    }
}

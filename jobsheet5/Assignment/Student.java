package jobsheet5.Assignment;

public class Student {

    String name;
    String id;
    int yearOfAdmission;
    int uts;
    int uas;
    

    Student(String name, String id, int yearOfAdmission, int uts, int uas){
        this.name = name;
        this.id = id;
        this.yearOfAdmission = yearOfAdmission;
        this.uts = uts;
        this.uas = uas;

    }

    public static Student utsMax (Student [] data,int left , int right){

        if (left == right){
            return data[left];
        }

        int mid = (left + right)/2;

        Student leftMax = utsMax(data, left, mid);
        Student rigthMAx = utsMax(data, mid+1, right);

        if(leftMax.uts > rigthMAx.uts){
            return leftMax;
        }else{
            return rigthMAx;
        }
    

    }

    public static Student uasMax(Student [] data, int left, int right){
        if (left == right){
            return data[left];
        }

        int mid = (left + right)/2;

        Student leftMax = uasMax(data, left, mid);
        Student rightMax = uasMax(data, mid+1, right);

        if (leftMax.uas > rightMax.uas){
            return leftMax;
        }else{
            return rightMax;
        }
    }

    public static void avrage (Student [] data){
        double sum = 0;
        for (int i=0; i<data.length; i++){
            sum +=data[i].uas;
        }

        double avrage = sum/data.length;

        System.out.print(avrage);

    }


}

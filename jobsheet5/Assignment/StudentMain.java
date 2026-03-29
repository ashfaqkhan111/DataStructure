package jobsheet5.Assignment;

public class StudentMain {

    public static void main(String [] args){

        Student [] data = new Student[8];

        data [0] = new Student("Ahmad", "220102100", 2022, 78, 82);
        data [1] = new Student("Budi", "220121002", 2022, 85, 87);
        data [2] = new Student("Cindy", "220101002", 2023, 90, 88);
        data [3] = new Student("Dian", "220101003", 2021, 76, 95);
        data [4] = new Student("Eko", "220101004", 2024, 92, 79);
        data [5] = new Student("Fajar", "220101005", 2024, 88, 85);
        data [6] = new Student("Gina", "220101006", 2023, 80, 83);
        data [7] = new Student("Hadi", "220101007", 2021, 82, 84);

        Student maxStudent = Student.utsMax (data, 0 ,data.length-1);
        Student maxStudent2 = Student.uasMax(data, 0, data.length-1);

        System.out.println("====Studnts Data====");
        System.out.printf("%-5s %-9s %-10s %-5s %-5s \n","Name","ID","Admission", "UAS","UTS");
        for (int i=0; i<data.length; i++){
            
                System.out.printf("%-5s %-11s %-9s %-5s %-5s \n",data[i].name, data[i].id, data[i].yearOfAdmission, data[i].uas, data[i].uts);
            }
            System.out.println("====Heighest UTS score====");
            System.out.println(maxStudent.name+" : "+maxStudent.uts);
            System.out.println("====Heighest UAS score====");
            System.out.println(maxStudent2.name+ " : "+maxStudent2.uas);
            System.out.println("====Avrage score====");
            Student.avrage(data);
        }

    

        
    }
    


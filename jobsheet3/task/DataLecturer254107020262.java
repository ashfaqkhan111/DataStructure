package jobsheet3.task;

public class DataLecturer254107020262 {
    
    void dataAllLecturer(Lecturer254107020262[] lecturer){
        System.out.printf("%-12s %-12s %-12s %-12s","Code", "Name", "Age","Gender");
        for (int i=0; i<lecturer.length; i++){

           System.out.printf("%-12s %-12s %-12s %-12s",lecturer[i].code, lecturer[i].name,lecturer[i].age,lecturer[i].gender);

        }
        
    }

    void numberOfLecturerPerGender(Lecturer254107020262 [] lecturer){
        int male =0;
        int female =0;

        for (int i=0; i<lecturer.length; i++){
            System.out.println("\nLecturer Data Per Gender ke-"+(i+1)+"\n");
        if (lecturer[i].gender){
            male++;
            System.out.println ("Code : "+lecturer[i].code);
            System.out.println ("Name : "+lecturer[i].name);
            System.out.println ("Age  : "+lecturer[i].age);
            System.out.println ("Gender : "+lecturer[i].gender);
        }
        else {
            female++;
            System.out.println ("Code : "+lecturer[i].code);
            System.out.println ("Name : "+lecturer[i].name);
            System.out.println ("Age  : "+lecturer[i].age);
            System.out.println ("Gender : "+lecturer[i].gender);

        }
        }
    }

    void avrageOfAgeLecturerPerGender(Lecturer254107020262 [] lecturer){
        int male = 0;
        int maleAge = 0;
        int female = 0;
        int femaleAge =0;

        System.out.println("\n======Avrage age of lecturers======\n");

        for (int i=0; i<lecturer.length; i++){
            if(lecturer[i].gender){
                maleAge += lecturer[i].age;
                male++;

                
            }
            else {
                femaleAge += lecturer[i].age;
                female++;
            }
        }

        double maleAvg = (double)maleAge/male;
        double femaleAvg = (double)femaleAge/female;

        System.out.println("Male avrage Age : "+maleAge);
        System.out.println("Female Avrage Age: "+femaleAvg);

    }

    public void infoOldestLecturer (Lecturer254107020262 [] lecturer){
        Lecturer254107020262 oldestAge = lecturer[0];
        System.out.println("\n======Oldest lecturers======\n");

        for (int i=1; i<lecturer.length; i++){
            if(lecturer[i].age > oldestAge.age){
                oldestAge = lecturer[i];
            }
        }

        System.out.println("The oldest lecturer is : " +oldestAge.name);
        System.out.println("Code : " +oldestAge.code);
        System.out.println("Age  : " +oldestAge.age);
        System.out.println("Gender : " +oldestAge.gender);
    }

    public void inforYoungest(Lecturer254107020262 [] lecturer){
        Lecturer254107020262 youngest = lecturer[0];
        System.out.println("\n======Youngest lecturers======\n");
        for (int i=0; i<lecturer.length; i++){
            if(lecturer[i].age < youngest.age){
                youngest = lecturer[i];
            }

        }
        System.out.println("The Youngest lecturer is : " +youngest.name);
        System.out.println("Code : " +youngest.code);
        System.out.println("Age  : " +youngest.age);
        System.out.println("Gender : " +youngest.gender);

    }
    
}

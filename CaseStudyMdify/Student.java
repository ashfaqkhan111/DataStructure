package CaseStudyMdify;

import java.util.Scanner;

public class Student {
    String name, studyProgram;
    int id;

    Student(int id, String name, String studyProgram){
        this.id = id;
        this.name = name;
        this.studyProgram = studyProgram;
    }

    public void showStudentData(){
        // System.out.println("ID : " + id);
        // System.out.println("Name : " + name);
        // System.out.println("Study Program : " + studyProgram);

  System.out.printf("\n%-7s %-7s %-18s", id,name, studyProgram);
    }
    public void showStudentData1(){
        System.out.println("ID : " + id);
        System.out.println("Name : " + name);
        System.out.println("Study Program : " + studyProgram);}




        public static void inputStudent(Student[] student, Scanner in) {

        for (int i = 0; i < student.length; i++) {

            System.out.print("Enter Nim: ");
            int id = in.nextInt();
            in.nextLine(); 

            System.out.print("Enter Name: ");
            String name = in.nextLine().toLowerCase();

            System.out.print("Enter Study Program: ");
            String studyProgram = in.nextLine();

            student[i] = new Student(id, name, studyProgram);
        }
        }
    }

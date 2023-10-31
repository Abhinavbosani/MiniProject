package Wipro_Training.AbstractionAndException.MiniProject3.main;

import Wipro_Training.AbstractionAndException.MiniProject3.bean.Student;
import Wipro_Training.AbstractionAndException.MiniProject3.exception.NullMarksArrayException;
import Wipro_Training.AbstractionAndException.MiniProject3.exception.NullNameException;
import Wipro_Training.AbstractionAndException.MiniProject3.exception.NullStudentObjectException;
import Wipro_Training.AbstractionAndException.MiniProject3.service.StudentReport;
import Wipro_Training.AbstractionAndException.MiniProject3.service.StudentService;

public class StudentMain {
    static Student data[] = new Student[5];


//        for (int i = 0; i < data.length; i++)
//            data [i]= new Student();
//
//        data [0] = new Student("Sekar", new int[] {35, 35, 35});
//        data [1] = new Student(null, new int[] {11, 22, 33});
//        data [2] = null;
//        data [3] = new Student("Manoj", null);
        //data[4]=new Student("Abhinav",new int[]{75,86,97});


    public static void main(String[] args) {
        StudentReport studentReport = new StudentReport();
        StudentService studentService = new StudentService();
        Student data[] = new Student[5];


        for (int i = 0; i < data.length; i++)
            data [i]= new Student();

        data [0] = new Student("Sekar", new int[] {35, 35, 35});
        data [1] = new Student(null, new int[] {11, 22, 33});
        data [2] = null;
        data [3] = new Student("Manoj", null);
        data[4]=new Student("Abhinav",new int[]{75,86,97});

        System.out.println("Grade Calculation:");

        String x =null;

        for (int i = 0; i < data.length; i++)  {
            try {
                x = studentReport.validate(data[i]);
                if (x.equalsIgnoreCase("VALID")){
                   String g= studentReport.findGrades(data[i]);

                    System.out.printf("Grade for student%d: %s \n",i+1,g);

                }
            } catch (NullNameException e) {
                System.out.println(e);
            } catch (NullMarksArrayException e) {
                System.out.println(e);
            } catch (NullStudentObjectException e) {
                System.out.println(e);
            }
            System.out.println("Grade="+x);


        }

        System.out.println("Number of Objects with Marks array as null = " +
                studentService.findNumberOfNullMarks(data));
        System.out.println("Number of Objects with Name as null = " +
                studentService.findNumberOfNullNames(data));
        System.out.println("Number of Objects that are entierly null = " +
                studentService.findNumberOfNullObjects(data));


    }

}
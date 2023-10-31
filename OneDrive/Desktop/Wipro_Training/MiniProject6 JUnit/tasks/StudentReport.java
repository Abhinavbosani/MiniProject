package com.wipro.task;

//package Wipro_Training.AbstractionAndException.MiniProject3.service;


public class StudentReport {
    public String findGrades(Student studentObject) {
        int[] marks = studentObject.getMarks();
        int marksSum = 0;

        for (int i = 0; i < marks.length; i++) {
            if (marks[i] < 35) {
                return "F";
            } else {
                marksSum += marks[i];
            }
        }

        if (marksSum <= 150) return "D";
        else if (marksSum > 150 && marksSum <= 200) return "C";
        else if (marksSum > 200 && marksSum <= 250) return "B";
        else if (marksSum > 250 && marksSum <= 300) return "A";
        else {
            return "D";
        }
    }

    public String validate (Student studentObject)
            throws NullStudentObjectException, NullNameException, NullMarksArrayException {
        if (studentObject == null) {
            throw new NullStudentObjectException();
        } else if (studentObject.getName() == null) {
            throw new NullNameException();
        }
        else if (studentObject.getMarks() == null) {
            throw new NullMarksArrayException();
        }
        return "VALID";

    }
}

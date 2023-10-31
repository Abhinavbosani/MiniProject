package com.wipro.task;



public class StudentService {
    public int findNumberOfNullMarks (Student data[]) {
        int nullMarksCount = 0;

        for (int i = 0; i < data.length; i++) {
        	try {
                if(data[i].getMarks()==null) {
                	nullMarksCount++;
                }
            } catch (Exception e) {
                nullMarksCount++;
            }
        }

        return nullMarksCount;
    }

    public int findNumberOfNullNames (Student data[]) throws NullPointerException {
        int nullNamesCount = 0;

        for (int i = 0; i < data.length; i++) {
        	try {
                if(data[i].getName()==null) {
                	nullNamesCount++;
                }
            } catch (Exception e) {
                nullNamesCount++;
            }
           }

        return nullNamesCount;
    }

    public int findNumberOfNullObjects (Student data[]) {
        int nullObjectsCount = 0;

        for (int i = 0; i < data.length; i++) {
            if (data[i] == null) nullObjectsCount++;;
        }

        return nullObjectsCount;
    }
}

package com.wipro.task;

public class NullStudentObjectException extends Exception {
    @Override
    public String toString() {
        return "object is null";
    }
}
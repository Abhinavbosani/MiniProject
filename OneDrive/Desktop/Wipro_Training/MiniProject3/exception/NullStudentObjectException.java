package Wipro_Training.AbstractionAndException.MiniProject3.exception;

public class NullStudentObjectException extends Exception {
    @Override
    public String toString() {
        return "object is null";
    }
}
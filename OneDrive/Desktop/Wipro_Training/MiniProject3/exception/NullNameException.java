package Wipro_Training.AbstractionAndException.MiniProject3.exception;

public class NullNameException extends Exception {
    @Override
    public String toString() {
        return "Name is null";
    }
}
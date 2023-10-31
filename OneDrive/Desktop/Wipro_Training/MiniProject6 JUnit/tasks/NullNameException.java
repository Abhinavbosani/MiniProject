package com.wipro.task;

public class NullNameException extends Exception {
    @Override
    public String toString() {
        return "Name is null";
    }
}
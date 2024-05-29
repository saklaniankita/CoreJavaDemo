package com.java8.functionalProgramming;

class Main {
    public static void main(String args[]) {
        Scaler s = new Scaler(5);
    }
}

class InterviewBit {
    InterviewBit() {
        System.out.println(" Welcome to InterviewBit ");
    }
}

class Scaler extends InterviewBit {
    Scaler() {
        System.out.println(" Welcome to Scaler Academy ");
    }

    Scaler(int x) {
        this();
        //  super();
        System.out.println(" Welcome to Scaler Academy 2");
    }
}
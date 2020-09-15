package com.company;

public class Student {

    private char Name;
    private int Enrollment;
    private double Balance;

    public char getName() {
        return Name;
    }
    public void setName(char name) {
        Name = name;
    }

    public int getEnrollment() {
        return Enrollment;
    }
    public void setEnrollment(int enrollment) {
        Enrollment = enrollment;
    }

    public double getBalance() {
        return Balance;
    }
    public void setBalance(double balance) {
        Balance = balance;
    }

    private void calculateBalance(){}

}

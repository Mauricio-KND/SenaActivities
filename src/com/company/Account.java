package com.company;

class Account {
    private String name;
    private double balance;

    public void incoming (double quantity){
        balance = balance + quantity;
    }

    public void  refund (double quantity){
        if (quantity <= balance)
            balance = balance - quantity;
    }

    private boolean canGet(double quantity){
        return quantity <= balance;
    }

    public String getName(){
        return name;
    }
    // No setter setName because is immutable.

    public double getBalance(){
        return balance;
    }
    // No setBalance cause it modifies with incoming and refunds.


}

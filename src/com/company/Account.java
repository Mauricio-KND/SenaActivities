package com.company;

public class Account {
    String name;
    double balance;

    void incoming (double quantity){
        balance = balance + quantity;
    }

    void  refund (double quantity){
        if (quantity <= balance)
            balance = balance - quantity;
    }
}

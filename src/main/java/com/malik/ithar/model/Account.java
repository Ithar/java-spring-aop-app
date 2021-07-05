package com.malik.ithar.model;

public class Account {

    private long id;
    private int balance;

    public Account(long id, int balance) {
        this.id = id;
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", balance=" + balance +
                '}';
    }
}

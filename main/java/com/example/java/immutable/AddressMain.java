package com.example.java.immutable;

public class AddressMain {
    public static void main(String[] args) {
        Address a = new Address("서울");
        Address b = a;
        System.out.println("b = " + b);
        System.out.println("a = " + a);

        b.setValue("부산");
        System.out.println("b = " + b);
        System.out.println("a = " + a);
    }
}

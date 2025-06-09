package com.phuckim.singleton;

public class ClientTest {

    public static void main(String[] args) {

        // Eager
        EagerInitialization eager1 = EagerInitialization.getInstance();
        eager1.setName("Test1");
        System.out.println(eager1.getName());

        EagerInitialization eager2 = EagerInitialization.getInstance();
        System.out.println(eager2.getName()); // giong voi eager1 vi chi tao ra 1 instance
    }
}

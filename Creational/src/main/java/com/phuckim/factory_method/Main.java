package com.phuckim.factory_method;

public class Main {
    public static void main(String[] args) {
        Candy candy = CandyFactory.getCandy(CandyType.MINTY);
        System.out.println(candy.getCandyName());

        System.out.println("============================");

        HardCandy candy2 = (HardCandy) CandyFactory.getCandy(CandyType.HARD);
        System.out.println(candy2.getCandyName());
    }
}

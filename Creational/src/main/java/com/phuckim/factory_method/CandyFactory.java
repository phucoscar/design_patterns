package com.phuckim.factory_method;

public class CandyFactory {

    public static Candy getCandy(CandyType candyType) {
       return switch (candyType) {
            case MINTY -> new MintyCandy();
            case HARD -> new HardCandy();
       };
    }

}

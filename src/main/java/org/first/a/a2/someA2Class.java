package org.first.a.a2;

import java.util.Random;

 public class someA2Class {
    public String name;

    private static final double constant = 5.0;

    public double operate(double value){

        return value - (double)(new Random().nextInt(5));
    }
}

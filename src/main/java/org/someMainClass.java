package org;

import org.first.someFirstClass;
import org.second.someSecondClass;

public class someMainClass {
    public static void main(String[] args) {
        var first = new someFirstClass();

        double outFirst = first.operate(50);

        var second = new someSecondClass();
        double outSecond = second.operate(outFirst);

        System.out.println("final result is: " + outSecond);
    }
}
package org.first.a;

import org.first.a.a1.someA1Class;
import org.first.a.a2.someA2Class;

public class someAClass {
    public String name;

    private static final double constant = 5.0;
    private someA1Class a1;
    private someA2Class a2;
    public double operate(double value){
        if(a1 == null){
            a1 = new someA1Class();
        }
        double resultA1 = a1.operate(value);
        if(a2 == null){
            a2 = new someA2Class();
        }
        double resultA2 = a2.operate(resultA1) + constant;
        return resultA2;
    }
}

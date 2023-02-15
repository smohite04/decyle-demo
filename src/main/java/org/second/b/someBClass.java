package org.second.b;


import org.second.b.b1.someB1Class;

public class someBClass {
    public String name;

    private static final double constant = 5.0;
    private someB1Class b1;
    private double resultB;

    public double operate(double value){
        if(b1 == null){
            b1 = new someB1Class();
        }
        double resultB1 = b1.operate(value);

         resultB = resultB1 + constant;
        return resultB;
    }
}

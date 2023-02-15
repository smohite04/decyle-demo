package org.second.b.b1;

import java.util.Random;

public class someB1Class {
    public String name;

    private  double outB1;

    public double operate(double value){

        double r = new Random().nextDouble();
        r = r == 0 ? 1.0: r;
        outB1 = value* r;
        return outB1;
    }
}

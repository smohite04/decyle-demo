package org.first;

import org.first.a.someAClass;

public class someFirstClass {

    private double outputA;
    private someAClass variable;

    public double operate(double value){
      if(variable == null)
          variable = new someAClass();

        double resultA = variable.operate(value);
        outputA = resultA;
        return outputA;
    }
    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}

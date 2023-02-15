package org.second;


import org.second.b.someBClass;

public class someSecondClass {

    private double outputSecond;
    private someBClass variable;

    public double operate(double value){
      if(variable == null)
          variable = new someBClass();

        double resultB = variable.operate(value);
        outputSecond = resultB;
        return outputSecond;
    }
    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}

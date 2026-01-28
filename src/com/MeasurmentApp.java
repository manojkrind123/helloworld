package com;

public class MeasurmentApp {

    private boolean  isValidValue(double d1){

 return !Double.isNaN(d1) && !Double.isInfinite(d1);

    }

    public boolean  checkEqualValue(double d1, double d2){

        if(!isValidValue(d1) || !isValidValue(d2)){

            throw new IllegalArgumentException("inputs should be valid numbers ");
        }
        return Double.compare(d1,d2)==0;
    }
}

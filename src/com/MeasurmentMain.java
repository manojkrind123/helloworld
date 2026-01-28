package com;

public class MeasurmentMain {

    public static void main(String[] args) {

        double feet1 =11.0;
        double feet2 =12.0;


        MeasurmentApp measurmentApp = new MeasurmentApp();

        boolean result= measurmentApp.checkEqualValue(feet1,feet2);

        System.out.println("Feet value are equal or not  ==  "+ result );


    }
}

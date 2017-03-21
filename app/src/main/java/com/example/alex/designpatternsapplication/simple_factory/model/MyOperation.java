package com.example.alex.designpatternsapplication.simple_factory.model;

/**
 * Created by root on 17-3-21.
 */

public class MyOperation {
    private double numberOne;
    private  double numberTwo;

    public double getNumberOne() {
        return numberOne;
    }

    public void setNumberOne(double numberOne) {
        this.numberOne = numberOne;
    }

    public double getNumberTwo() {
        return numberTwo;
    }

    public void setNumberTwo(double numberTwo) {
        this.numberTwo = numberTwo;
    }

    public double calculateNumber(){
        double result=0;
        return result;
    }
}

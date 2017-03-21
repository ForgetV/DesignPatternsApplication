package com.example.alex.designpatternsapplication.simple_factory.model;

/**
 * Created by root on 17-3-21.
 */

public class MyAddOperation extends MyOperation{

    @Override
    public double calculateNumber() {
        double numberOne=getNumberOne();
        double numberTwo=getNumberTwo();
        return numberOne+numberTwo;
    }
}

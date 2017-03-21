package com.example.alex.designpatternsapplication.simple_factory.model;

import java.util.UnknownFormatConversionException;

/**
 * Created by root on 17-3-21.
 */

public class MyDivisionOperation extends MyOperation{
    @Override
    public double calculateNumber() {
        double numberOne=getNumberOne();
        double numberTwo=getNumberTwo();
        if (numberTwo==0){
            throw new UnknownFormatConversionException("number two can not be zero");
        }else{
            return numberOne/numberTwo;
        }

    }
}

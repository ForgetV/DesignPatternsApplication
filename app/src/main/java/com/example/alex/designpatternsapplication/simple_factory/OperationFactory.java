package com.example.alex.designpatternsapplication.simple_factory;

import com.example.alex.designpatternsapplication.simple_factory.model.MyAddOperation;
import com.example.alex.designpatternsapplication.simple_factory.model.MyDeleteOperation;
import com.example.alex.designpatternsapplication.simple_factory.model.MyDivisionOperation;
import com.example.alex.designpatternsapplication.simple_factory.model.MyMultiplicationOperation;
import com.example.alex.designpatternsapplication.simple_factory.model.MyOperation;

/**
 * Created by root on 17-3-21.
 */

public class OperationFactory {

    public static MyOperation createOperation(String oper){
        MyOperation operation=null;
        switch (oper){
            case "+":
                operation=new MyAddOperation();
                break;
            case "-":
                operation=new MyDeleteOperation();
                break;
            case "*":
                operation=new MyMultiplicationOperation();
                break;
            case "/":
                operation=new MyDivisionOperation();
        }

        return operation;
    }
}

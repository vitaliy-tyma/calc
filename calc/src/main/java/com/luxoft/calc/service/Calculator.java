package com.luxoft.calc.service;

public class Calculator {

    public Integer getResult(String operation, Integer a, Integer b){
        switch (operation.toUpperCase()){
            case "SUM": return getSum(a,b);
            case "DIFF": return getDifference(a,b);
            default: throw new UnsupportedOperationException("Operation " + operation + " is not supported");
        }
    }

    private static Integer getSum(Integer a, Integer b){
        return a + b;
    }

    private static Integer getDifference(Integer a, Integer b) {
        return a - b;
    }
}

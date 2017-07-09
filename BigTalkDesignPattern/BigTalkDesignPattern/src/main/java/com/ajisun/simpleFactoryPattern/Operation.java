package main.java.com.ajisun.simpleFactoryPattern;

/**
 * Copyright (c) 2017. Hand Enterprise Solution Company. All right reserved.
 * Project Name:BigTalkDesignPattern
 * Package Name:main.java.com.ajisun.simpleFactoryPattern
 * Date:2017/7/9
 * Create By:ajisun
 */

public class Operation {

//    每个运算都有两个数字属性
    private double numberA = 0;
    private double numberB = 0;
//      返回结果的虚方法
    public double getResult() throws Exception{
        double result = 0;
        return result;
    }

    public double getNumberA() {
        return numberA;
    }

    public void setNumberA(double numberA) {
        this.numberA = numberA;
    }

    public double getNumberB() {
        return numberB;
    }

    public void setNumberB(double numberB) {
        this.numberB = numberB;
    }
}

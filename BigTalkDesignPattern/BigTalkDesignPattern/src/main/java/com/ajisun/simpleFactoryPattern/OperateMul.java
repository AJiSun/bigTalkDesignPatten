package main.java.com.ajisun.simpleFactoryPattern;

/**
 * Copyright (c) 2017.
 * Project Name:BigTalkDesignPattern
 * Package Name:main.java.com.ajisun.simpleFactoryPattern
 * Date:2017/7/9
 * Create By:ajisun
 */
// 继承运算类
public class OperateMul extends Operation {

    @Override
    public double getResult() throws Exception{
        double result = 0 ;
        result = getNumberA() * getNumberB();
        return result;
    }


}

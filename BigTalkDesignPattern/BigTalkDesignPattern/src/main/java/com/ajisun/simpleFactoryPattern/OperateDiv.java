package main.java.com.ajisun.simpleFactoryPattern;

import java.io.IOException;

/**
 * Copyright (c) 2017. Hand Enterprise Solution Company. All right reserved.
 * Project Name:BigTalkDesignPattern
 * Package Name:main.java.com.ajisun.simpleFactoryPattern
 * Date:2017/7/9
 * Create By:ajisun
 */
// 继承运算类
public class OperateDiv extends Operation{

    @Override
    public double getResult() throws Exception{
        double result = 0 ;
        if (getNumberB() == 0){
            throw new IOException("除数不能为0 。");
        }
        result = getNumberA() / getNumberB();
        return result;
    }


}

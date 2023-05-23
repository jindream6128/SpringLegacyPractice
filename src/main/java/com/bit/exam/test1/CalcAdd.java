package com.bit.exam.test1;

public class CalcAdd implements Calc{
    int x;
    int y;

    public CalcAdd(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public CalcAdd(int i) {

    }

    @Override
    public int calculate() {
        return x+y;
    }
}

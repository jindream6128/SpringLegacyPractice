package com.bit.exam;

import org.springframework.stereotype.Component;

@Component
public class UserCalculator implements BasicCalculator{
    @Override
    public int basicsum(int x, int y) {
        System.out.println("basicSum");
        return x+y;
    }

    @Override
    public int basicdivide(int x, int y) {
        System.out.println("basicdivide");
        //여기서 zero thorwalbe
        return x/y;
    }
}

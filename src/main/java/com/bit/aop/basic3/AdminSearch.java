package com.bit.aop.basic3;


import org.springframework.stereotype.Component;

@Component
public class AdminSearch implements Search{
    @Override
    public void fileSearch() { // 핵심코드
        //여기서는 정상종료
        System.out.println("fileSearch");
    }

    @Override
    public void xmlParsing() {
        //여기서는 정상 return
        System.out.println("xmlParsing");
    }

    @Override
    public void domSaxSearch() {

        //여기서는 exception 내기
        System.out.println("domSaxSearch");
        //int rs = 10/0;
    }


}

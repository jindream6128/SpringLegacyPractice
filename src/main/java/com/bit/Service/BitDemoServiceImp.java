package com.bit.Service;

import com.bit.dao.BitDemoDao;
import com.bit.dao.BitDemoDaoImp;
import com.bit.dto.BitDemoDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class BitDemoServiceImp implements BitDemoService{

    //이렇게 인터페이스를 가지고 있는것이 -> 루즈커플링
    //@Autowired //가능
    @Resource(name="bitDemoDaoImp")
    private BitDemoDao dao;

    @Override
    public void BitDemoInsert(BitDemoDTO dto) {
        dao.bitDemoInsert(dto);
    }
}

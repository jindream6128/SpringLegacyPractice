package com.bit.dao;

import com.bit.dto.BitDemoDTO;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository //DB 에서 관리 @repository -> @component -> 컴포넌트 스캔필요
public class BitDemoDaoImp implements BitDemoDao{
    @Autowired
    private SqlSessionTemplate sqlSession;


    @Override
    public void bitDemoInsert(BitDemoDTO dto) {

    }
}

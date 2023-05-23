package com.bit.dao;

import com.bit.dto.BitDemoDTO;
import org.mybatis.spring.SqlSessionTemplate;

public interface BitDemoDao {
    public void bitDemoInsert(BitDemoDTO dto);

}

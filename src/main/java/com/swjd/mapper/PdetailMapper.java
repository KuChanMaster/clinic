package com.swjd.mapper;

import com.swjd.pojo.Pdetail;
import com.swjd.pojo.PdetailExample;
import com.swjd.pojo.PdetailKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PdetailMapper {
    int countByExample(PdetailExample example);

    int deleteByExample(PdetailExample example);

    int deleteByPrimaryKey(PdetailKey key);

    int insert(Pdetail record);

    int insertSelective(Pdetail record);

    List<Pdetail> selectByExample(PdetailExample example);

    Pdetail selectByPrimaryKey(PdetailKey key);

    int updateByExampleSelective(@Param("record") Pdetail record, @Param("example") PdetailExample example);

    int updateByExample(@Param("record") Pdetail record, @Param("example") PdetailExample example);

    int updateByPrimaryKeySelective(Pdetail record);

    int updateByPrimaryKey(Pdetail record);
}
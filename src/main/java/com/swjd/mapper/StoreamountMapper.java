package com.swjd.mapper;

import com.swjd.pojo.Storeamount;
import com.swjd.pojo.StoreamountExample;
import com.swjd.pojo.StoreamountKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StoreamountMapper {
    int countByExample(StoreamountExample example);

    int deleteByExample(StoreamountExample example);

    int deleteByPrimaryKey(StoreamountKey key);

    int insert(Storeamount record);

    int insertSelective(Storeamount record);

    List<Storeamount> selectByExample(StoreamountExample example);

    Storeamount selectByPrimaryKey(StoreamountKey key);

    int updateByExampleSelective(@Param("record") Storeamount record, @Param("example") StoreamountExample example);

    int updateByExample(@Param("record") Storeamount record, @Param("example") StoreamountExample example);

    int updateByPrimaryKeySelective(Storeamount record);

    int updateByPrimaryKey(Storeamount record);
}
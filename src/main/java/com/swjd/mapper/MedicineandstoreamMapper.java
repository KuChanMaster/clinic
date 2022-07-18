package com.swjd.mapper;

import com.swjd.pojo.Financerecord;
import com.swjd.pojo.Medicineandstoream;
import com.swjd.pojo.MedicineandstoreamExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MedicineandstoreamMapper {
    int countByExample(MedicineandstoreamExample example);

    int deleteByExample(MedicineandstoreamExample example);

    int insert(Medicineandstoream record);

    int insertSelective(Medicineandstoream record);

    List<Medicineandstoream> selectByExample(MedicineandstoreamExample example);

    int updateByExampleSelective(@Param("record") Medicineandstoream record, @Param("example") MedicineandstoreamExample example);

    int updateByExample(@Param("record") Medicineandstoream record, @Param("example") MedicineandstoreamExample example);

}
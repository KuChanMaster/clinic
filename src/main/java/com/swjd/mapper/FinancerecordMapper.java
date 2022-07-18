package com.swjd.mapper;

import com.swjd.pojo.Financerecord;
import com.swjd.pojo.FinancerecordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FinancerecordMapper {
    int countByExample(FinancerecordExample example);

    int deleteByExample(FinancerecordExample example);

    int insert(Financerecord record);

    int insertSelective(Financerecord record);

    List<Financerecord> selectByExample(FinancerecordExample example);

    int updateByExampleSelective(@Param("record") Financerecord record, @Param("example") FinancerecordExample example);

    int updateByExample(@Param("record") Financerecord record, @Param("example") FinancerecordExample example);

    Financerecord selectByFinanceNo(Integer financeNo);

}
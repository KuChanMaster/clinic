package com.swjd.mapper;

import com.swjd.pojo.Allergy;
import com.swjd.pojo.AllergyExample;
import com.swjd.pojo.AllergyKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AllergyMapper {
    int countByExample(AllergyExample example);

    int deleteByExample(AllergyExample example);

    int deleteByPrimaryKey(AllergyKey key);

    int insert(Allergy record);

    int insertSelective(Allergy record);

    List<Allergy> selectByExample(AllergyExample example);

    Allergy selectByPrimaryKey(AllergyKey key);

    int updateByExampleSelective(@Param("record") Allergy record, @Param("example") AllergyExample example);

    int updateByExample(@Param("record") Allergy record, @Param("example") AllergyExample example);

    int updateByPrimaryKeySelective(Allergy record);

    int updateByPrimaryKey(Allergy record);
}
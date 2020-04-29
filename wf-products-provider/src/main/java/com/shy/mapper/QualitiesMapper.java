package com.shy.mapper;

import com.shy.vo.Qualities;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Component;

/**
 * 质检一方
 * */
@Component
public interface QualitiesMapper {

    @Update("UPDATE kh8081.qualities SET sore = #{sore}, qualitydesc = #{qualitydesc} WHERE id = #{id}")
    int editQualities(Qualities qualities);

    @Insert("INSERT INTO qualities (sore, qualitydesc, productid) VALUES (0,null,#{productid})")
    int addQualities(Integer productId);

}

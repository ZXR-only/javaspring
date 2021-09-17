package com.zxr.mapper;

import com.zxr.model.IntermediariesExample;
import com.zxr.model.IntermediariesKey;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;

public interface IntermediariesMapper {
    @SelectProvider(type=IntermediariesSqlProvider.class, method="countByExample")
    long countByExample(IntermediariesExample example);

    @DeleteProvider(type=IntermediariesSqlProvider.class, method="deleteByExample")
    int deleteByExample(IntermediariesExample example);

    @Delete({
        "delete from intermediaries",
        "where 供应商名字 = #{供应商名字,jdbcType=CHAR}",
          "and 零售商名字 = #{零售商名字,jdbcType=CHAR}"
    })
    int deleteByPrimaryKey(IntermediariesKey key);

    @Insert({
        "insert into intermediaries (供应商名字, 零售商名字)",
        "values (#{供应商名字,jdbcType=CHAR}, #{零售商名字,jdbcType=CHAR})"
    })
    int insert(IntermediariesKey record);

    @InsertProvider(type=IntermediariesSqlProvider.class, method="insertSelective")
    int insertSelective(IntermediariesKey record);

    @SelectProvider(type=IntermediariesSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="供应商名字", property="供应商名字", jdbcType=JdbcType.CHAR, id=true),
        @Result(column="零售商名字", property="零售商名字", jdbcType=JdbcType.CHAR, id=true)
    })
    List<IntermediariesKey> selectByExample(IntermediariesExample example);

    @UpdateProvider(type=IntermediariesSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") IntermediariesKey record, @Param("example") IntermediariesExample example);

    @UpdateProvider(type=IntermediariesSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") IntermediariesKey record, @Param("example") IntermediariesExample example);
}
package com.zxr.mapper;

import com.zxr.model.ConsExample;
import com.zxr.model.ConsKey;
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

public interface ConsMapper {
    @SelectProvider(type=ConsSqlProvider.class, method="countByExample")
    long countByExample(ConsExample example);

    @DeleteProvider(type=ConsSqlProvider.class, method="deleteByExample")
    int deleteByExample(ConsExample example);

    @Delete({
        "delete from cons",
        "where pid = #{pid,jdbcType=INTEGER}",
          "and wid = #{wid,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(ConsKey key);

    @Insert({
        "insert into cons (pid, wid)",
        "values (#{pid,jdbcType=INTEGER}, #{wid,jdbcType=INTEGER})"
    })
    int insert(ConsKey record);

    @InsertProvider(type=ConsSqlProvider.class, method="insertSelective")
    int insertSelective(ConsKey record);

    @SelectProvider(type=ConsSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="pid", property="pid", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="wid", property="wid", jdbcType=JdbcType.INTEGER, id=true)
    })
    List<ConsKey> selectByExample(ConsExample example);

    @UpdateProvider(type=ConsSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") ConsKey record, @Param("example") ConsExample example);

    @UpdateProvider(type=ConsSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") ConsKey record, @Param("example") ConsExample example);
}
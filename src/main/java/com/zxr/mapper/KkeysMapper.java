package com.zxr.mapper;

import com.zxr.model.Kkeys;
import com.zxr.model.KkeysExample;
import java.util.List;

import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

public interface KkeysMapper {
    @SelectProvider(type=KkeysSqlProvider.class, method="countByExample")
    long countByExample(KkeysExample example);

    @DeleteProvider(type=KkeysSqlProvider.class, method="deleteByExample")
    int deleteByExample(KkeysExample example);

    @Delete({
        "delete from kkeys",
        "where 型号 = #{型号,jdbcType=CHAR}"
    })
    int deleteByPrimaryKey(String 型号);

    @Insert({
        "insert into kkeys (型号, 厂商, 编号)",
        "values (#{型号,jdbcType=CHAR}, #{厂商,jdbcType=CHAR}, #{编号,jdbcType=INTEGER})"
    })
    int insert(Kkeys record);

    @InsertProvider(type=KkeysSqlProvider.class, method="insertSelective")
    int insertSelective(Kkeys record);

    @SelectProvider(type=KkeysSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="型号", property="型号", jdbcType=JdbcType.CHAR, id=true),
        @Result(column="厂商", property="厂商", jdbcType=JdbcType.CHAR),
        @Result(column="编号", property="编号", jdbcType=JdbcType.INTEGER),
        @Result(column="型号", property="locks",one=@One(select = "com.zxr.mapper.LocksMapper.selectByPrimaryKey") )
    })
    List<Kkeys> selectByExample(KkeysExample example);

    @Select({
        "select",
        "型号, 厂商, 编号",
        "from kkeys",
        "where 型号 = #{型号,jdbcType=CHAR}"
    })
    @Results({
        @Result(column="型号", property="型号", jdbcType=JdbcType.CHAR, id=true),
        @Result(column="厂商", property="厂商", jdbcType=JdbcType.CHAR),
        @Result(column="编号", property="编号", jdbcType=JdbcType.INTEGER)
    })
    Kkeys selectByPrimaryKey(String 型号);

    @UpdateProvider(type=KkeysSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") Kkeys record, @Param("example") KkeysExample example);

    @UpdateProvider(type=KkeysSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") Kkeys record, @Param("example") KkeysExample example);

    @UpdateProvider(type=KkeysSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(Kkeys record);

    @Update({
        "update kkeys",
        "set 厂商 = #{厂商,jdbcType=CHAR},",
          "编号 = #{编号,jdbcType=INTEGER}",
        "where 型号 = #{型号,jdbcType=CHAR}"
    })
    int updateByPrimaryKey(Kkeys record);
}
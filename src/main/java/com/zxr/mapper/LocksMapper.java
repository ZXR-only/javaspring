package com.zxr.mapper;

import com.zxr.model.Locks;
import com.zxr.model.LocksExample;
import java.util.List;

import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

public interface LocksMapper {
    @SelectProvider(type=LocksSqlProvider.class, method="countByExample")
    long countByExample(LocksExample example);

    @DeleteProvider(type=LocksSqlProvider.class, method="deleteByExample")
    int deleteByExample(LocksExample example);

    @Delete({
        "delete from locks",
        "where 型号 = #{型号,jdbcType=CHAR}"
    })
    int deleteByPrimaryKey(String 型号);

    @Insert({
        "insert into locks (型号, 厂商, 编号)",
        "values (#{型号,jdbcType=CHAR}, #{厂商,jdbcType=CHAR}, #{编号,jdbcType=INTEGER})"
    })
    int insert(Locks record);

    @InsertProvider(type=LocksSqlProvider.class, method="insertSelective")
    int insertSelective(Locks record);

    @SelectProvider(type=LocksSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="型号", property="型号", jdbcType=JdbcType.CHAR, id=true),
        @Result(column="厂商", property="厂商", jdbcType=JdbcType.CHAR),
        @Result(column="编号", property="编号", jdbcType=JdbcType.INTEGER),
            @Result(column="型号", property="kkeys",one=@One(select = "com.zxr.mapper.KkeysMapper.selectByPrimaryKey"))
    })
    List<Locks> selectByExample(LocksExample example);

    @Select({
        "select",
        "型号, 厂商, 编号",
        "from locks",
        "where 型号 = #{型号,jdbcType=CHAR}"
    })
    @Results({
        @Result(column="型号", property="型号", jdbcType=JdbcType.CHAR, id=true),
        @Result(column="厂商", property="厂商", jdbcType=JdbcType.CHAR),
        @Result(column="编号", property="编号", jdbcType=JdbcType.INTEGER)
    })
    Locks selectByPrimaryKey(String 型号);

    @UpdateProvider(type=LocksSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") Locks record, @Param("example") LocksExample example);

    @UpdateProvider(type=LocksSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") Locks record, @Param("example") LocksExample example);

    @UpdateProvider(type=LocksSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(Locks record);

    @Update({
        "update locks",
        "set 厂商 = #{厂商,jdbcType=CHAR},",
          "编号 = #{编号,jdbcType=INTEGER}",
        "where 型号 = #{型号,jdbcType=CHAR}"
    })
    int updateByPrimaryKey(Locks record);
}
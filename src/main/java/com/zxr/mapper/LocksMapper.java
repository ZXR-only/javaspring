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
        "where �ͺ� = #{�ͺ�,jdbcType=CHAR}"
    })
    int deleteByPrimaryKey(String �ͺ�);

    @Insert({
        "insert into locks (�ͺ�, ����, ���)",
        "values (#{�ͺ�,jdbcType=CHAR}, #{����,jdbcType=CHAR}, #{���,jdbcType=INTEGER})"
    })
    int insert(Locks record);

    @InsertProvider(type=LocksSqlProvider.class, method="insertSelective")
    int insertSelective(Locks record);

    @SelectProvider(type=LocksSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="�ͺ�", property="�ͺ�", jdbcType=JdbcType.CHAR, id=true),
        @Result(column="����", property="����", jdbcType=JdbcType.CHAR),
        @Result(column="���", property="���", jdbcType=JdbcType.INTEGER),
            @Result(column="�ͺ�", property="kkeys",one=@One(select = "com.zxr.mapper.KkeysMapper.selectByPrimaryKey"))
    })
    List<Locks> selectByExample(LocksExample example);

    @Select({
        "select",
        "�ͺ�, ����, ���",
        "from locks",
        "where �ͺ� = #{�ͺ�,jdbcType=CHAR}"
    })
    @Results({
        @Result(column="�ͺ�", property="�ͺ�", jdbcType=JdbcType.CHAR, id=true),
        @Result(column="����", property="����", jdbcType=JdbcType.CHAR),
        @Result(column="���", property="���", jdbcType=JdbcType.INTEGER)
    })
    Locks selectByPrimaryKey(String �ͺ�);

    @UpdateProvider(type=LocksSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") Locks record, @Param("example") LocksExample example);

    @UpdateProvider(type=LocksSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") Locks record, @Param("example") LocksExample example);

    @UpdateProvider(type=LocksSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(Locks record);

    @Update({
        "update locks",
        "set ���� = #{����,jdbcType=CHAR},",
          "��� = #{���,jdbcType=INTEGER}",
        "where �ͺ� = #{�ͺ�,jdbcType=CHAR}"
    })
    int updateByPrimaryKey(Locks record);
}
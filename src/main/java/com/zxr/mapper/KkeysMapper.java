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
        "where �ͺ� = #{�ͺ�,jdbcType=CHAR}"
    })
    int deleteByPrimaryKey(String �ͺ�);

    @Insert({
        "insert into kkeys (�ͺ�, ����, ���)",
        "values (#{�ͺ�,jdbcType=CHAR}, #{����,jdbcType=CHAR}, #{���,jdbcType=INTEGER})"
    })
    int insert(Kkeys record);

    @InsertProvider(type=KkeysSqlProvider.class, method="insertSelective")
    int insertSelective(Kkeys record);

    @SelectProvider(type=KkeysSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="�ͺ�", property="�ͺ�", jdbcType=JdbcType.CHAR, id=true),
        @Result(column="����", property="����", jdbcType=JdbcType.CHAR),
        @Result(column="���", property="���", jdbcType=JdbcType.INTEGER),
        @Result(column="�ͺ�", property="locks",one=@One(select = "com.zxr.mapper.LocksMapper.selectByPrimaryKey") )
    })
    List<Kkeys> selectByExample(KkeysExample example);

    @Select({
        "select",
        "�ͺ�, ����, ���",
        "from kkeys",
        "where �ͺ� = #{�ͺ�,jdbcType=CHAR}"
    })
    @Results({
        @Result(column="�ͺ�", property="�ͺ�", jdbcType=JdbcType.CHAR, id=true),
        @Result(column="����", property="����", jdbcType=JdbcType.CHAR),
        @Result(column="���", property="���", jdbcType=JdbcType.INTEGER)
    })
    Kkeys selectByPrimaryKey(String �ͺ�);

    @UpdateProvider(type=KkeysSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") Kkeys record, @Param("example") KkeysExample example);

    @UpdateProvider(type=KkeysSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") Kkeys record, @Param("example") KkeysExample example);

    @UpdateProvider(type=KkeysSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(Kkeys record);

    @Update({
        "update kkeys",
        "set ���� = #{����,jdbcType=CHAR},",
          "��� = #{���,jdbcType=INTEGER}",
        "where �ͺ� = #{�ͺ�,jdbcType=CHAR}"
    })
    int updateByPrimaryKey(Kkeys record);
}
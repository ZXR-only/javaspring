package com.zxr.mapper;

import com.zxr.model.Retailers;
import com.zxr.model.RetailersExample;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;

public interface RetailersMapper {
    @SelectProvider(type=RetailersSqlProvider.class, method="countByExample")
    long countByExample(RetailersExample example);

    @DeleteProvider(type=RetailersSqlProvider.class, method="deleteByExample")
    int deleteByExample(RetailersExample example);

    @Delete({
        "delete from retailers",
        "where ���������� = #{����������,jdbcType=CHAR}"
    })
    int deleteByPrimaryKey(String ����������);

    @Insert({
        "insert into retailers (����������, �ṩ��Ʒ, ���)",
        "values (#{����������,jdbcType=CHAR}, #{�ṩ��Ʒ,jdbcType=CHAR}, #{���,jdbcType=INTEGER})"
    })
    int insert(Retailers record);

    @InsertProvider(type=RetailersSqlProvider.class, method="insertSelective")
    int insertSelective(Retailers record);

    @SelectProvider(type=RetailersSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="����������", property="����������", jdbcType=JdbcType.CHAR, id=true),
        @Result(column="�ṩ��Ʒ", property="�ṩ��Ʒ", jdbcType=JdbcType.CHAR),
        @Result(column="���", property="���", jdbcType=JdbcType.INTEGER)
    })
    List<Retailers> selectByExample(RetailersExample example);

    @Select({
        "select",
        "����������, �ṩ��Ʒ, ���",
        "from retailers",
        "where ���������� = #{����������,jdbcType=CHAR}"
    })
    @Results({
        @Result(column="����������", property="����������", jdbcType=JdbcType.CHAR, id=true),
        @Result(column="�ṩ��Ʒ", property="�ṩ��Ʒ", jdbcType=JdbcType.CHAR),
        @Result(column="���", property="���", jdbcType=JdbcType.INTEGER)
    })
    Retailers selectByPrimaryKey(String ����������);

    @UpdateProvider(type=RetailersSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") Retailers record, @Param("example") RetailersExample example);

    @UpdateProvider(type=RetailersSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") Retailers record, @Param("example") RetailersExample example);

    @UpdateProvider(type=RetailersSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(Retailers record);

    @Update({
        "update retailers",
        "set �ṩ��Ʒ = #{�ṩ��Ʒ,jdbcType=CHAR},",
          "��� = #{���,jdbcType=INTEGER}",
        "where ���������� = #{����������,jdbcType=CHAR}"
    })
    int updateByPrimaryKey(Retailers record);
}
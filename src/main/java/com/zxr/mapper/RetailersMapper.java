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
        "where 零售商名字 = #{零售商名字,jdbcType=CHAR}"
    })
    int deleteByPrimaryKey(String 零售商名字);

    @Insert({
        "insert into retailers (零售商名字, 提供货品, 编号)",
        "values (#{零售商名字,jdbcType=CHAR}, #{提供货品,jdbcType=CHAR}, #{编号,jdbcType=INTEGER})"
    })
    int insert(Retailers record);

    @InsertProvider(type=RetailersSqlProvider.class, method="insertSelective")
    int insertSelective(Retailers record);

    @SelectProvider(type=RetailersSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="零售商名字", property="零售商名字", jdbcType=JdbcType.CHAR, id=true),
        @Result(column="提供货品", property="提供货品", jdbcType=JdbcType.CHAR),
        @Result(column="编号", property="编号", jdbcType=JdbcType.INTEGER)
    })
    List<Retailers> selectByExample(RetailersExample example);

    @Select({
        "select",
        "零售商名字, 提供货品, 编号",
        "from retailers",
        "where 零售商名字 = #{零售商名字,jdbcType=CHAR}"
    })
    @Results({
        @Result(column="零售商名字", property="零售商名字", jdbcType=JdbcType.CHAR, id=true),
        @Result(column="提供货品", property="提供货品", jdbcType=JdbcType.CHAR),
        @Result(column="编号", property="编号", jdbcType=JdbcType.INTEGER)
    })
    Retailers selectByPrimaryKey(String 零售商名字);

    @UpdateProvider(type=RetailersSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") Retailers record, @Param("example") RetailersExample example);

    @UpdateProvider(type=RetailersSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") Retailers record, @Param("example") RetailersExample example);

    @UpdateProvider(type=RetailersSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(Retailers record);

    @Update({
        "update retailers",
        "set 提供货品 = #{提供货品,jdbcType=CHAR},",
          "编号 = #{编号,jdbcType=INTEGER}",
        "where 零售商名字 = #{零售商名字,jdbcType=CHAR}"
    })
    int updateByPrimaryKey(Retailers record);
}
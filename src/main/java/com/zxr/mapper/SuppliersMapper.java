package com.zxr.mapper;

import com.zxr.model.Suppliers;
import com.zxr.model.SuppliersExample;
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

public interface SuppliersMapper {
    @SelectProvider(type=SuppliersSqlProvider.class, method="countByExample")
    long countByExample(SuppliersExample example);

    @DeleteProvider(type=SuppliersSqlProvider.class, method="deleteByExample")
    int deleteByExample(SuppliersExample example);

    @Delete({
        "delete from suppliers",
        "where 供应商名字 = #{供应商名字,jdbcType=CHAR}"
    })
    int deleteByPrimaryKey(String 供应商名字);

    @Insert({
        "insert into suppliers (供应商名字, 生产货品, 编号)",
        "values (#{供应商名字,jdbcType=CHAR}, #{生产货品,jdbcType=CHAR}, #{编号,jdbcType=INTEGER})"
    })
    int insert(Suppliers record);

    @InsertProvider(type=SuppliersSqlProvider.class, method="insertSelective")
    int insertSelective(Suppliers record);

    @SelectProvider(type=SuppliersSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="供应商名字", property="供应商名字", jdbcType=JdbcType.CHAR, id=true),
        @Result(column="生产货品", property="生产货品", jdbcType=JdbcType.CHAR),
        @Result(column="编号", property="编号", jdbcType=JdbcType.INTEGER)
    })
    List<Suppliers> selectByExample(SuppliersExample example);

    @Select({
        "select",
        "供应商名字, 生产货品, 编号",
        "from suppliers",
        "where 供应商名字 = #{供应商名字,jdbcType=CHAR}"
    })
    @Results({
        @Result(column="供应商名字", property="供应商名字", jdbcType=JdbcType.CHAR, id=true),
        @Result(column="生产货品", property="生产货品", jdbcType=JdbcType.CHAR),
        @Result(column="编号", property="编号", jdbcType=JdbcType.INTEGER)
    })
    Suppliers selectByPrimaryKey(String 供应商名字);

    @UpdateProvider(type=SuppliersSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") Suppliers record, @Param("example") SuppliersExample example);

    @UpdateProvider(type=SuppliersSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") Suppliers record, @Param("example") SuppliersExample example);

    @UpdateProvider(type=SuppliersSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(Suppliers record);

    @Update({
        "update suppliers",
        "set 生产货品 = #{生产货品,jdbcType=CHAR},",
          "编号 = #{编号,jdbcType=INTEGER}",
        "where 供应商名字 = #{供应商名字,jdbcType=CHAR}"
    })
    int updateByPrimaryKey(Suppliers record);
}
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
        "where ��Ӧ������ = #{��Ӧ������,jdbcType=CHAR}"
    })
    int deleteByPrimaryKey(String ��Ӧ������);

    @Insert({
        "insert into suppliers (��Ӧ������, ������Ʒ, ���)",
        "values (#{��Ӧ������,jdbcType=CHAR}, #{������Ʒ,jdbcType=CHAR}, #{���,jdbcType=INTEGER})"
    })
    int insert(Suppliers record);

    @InsertProvider(type=SuppliersSqlProvider.class, method="insertSelective")
    int insertSelective(Suppliers record);

    @SelectProvider(type=SuppliersSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="��Ӧ������", property="��Ӧ������", jdbcType=JdbcType.CHAR, id=true),
        @Result(column="������Ʒ", property="������Ʒ", jdbcType=JdbcType.CHAR),
        @Result(column="���", property="���", jdbcType=JdbcType.INTEGER)
    })
    List<Suppliers> selectByExample(SuppliersExample example);

    @Select({
        "select",
        "��Ӧ������, ������Ʒ, ���",
        "from suppliers",
        "where ��Ӧ������ = #{��Ӧ������,jdbcType=CHAR}"
    })
    @Results({
        @Result(column="��Ӧ������", property="��Ӧ������", jdbcType=JdbcType.CHAR, id=true),
        @Result(column="������Ʒ", property="������Ʒ", jdbcType=JdbcType.CHAR),
        @Result(column="���", property="���", jdbcType=JdbcType.INTEGER)
    })
    Suppliers selectByPrimaryKey(String ��Ӧ������);

    @UpdateProvider(type=SuppliersSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") Suppliers record, @Param("example") SuppliersExample example);

    @UpdateProvider(type=SuppliersSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") Suppliers record, @Param("example") SuppliersExample example);

    @UpdateProvider(type=SuppliersSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(Suppliers record);

    @Update({
        "update suppliers",
        "set ������Ʒ = #{������Ʒ,jdbcType=CHAR},",
          "��� = #{���,jdbcType=INTEGER}",
        "where ��Ӧ������ = #{��Ӧ������,jdbcType=CHAR}"
    })
    int updateByPrimaryKey(Suppliers record);
}
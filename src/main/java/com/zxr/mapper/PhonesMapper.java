package com.zxr.mapper;

import com.zxr.DtSql.phonesDT;
import com.zxr.model.Phones;
import com.zxr.model.PhonesExample;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

public interface PhonesMapper {
    @SelectProvider(type=PhonesSqlProvider.class, method="countByExample")
    long countByExample(PhonesExample example);

    @DeleteProvider(type=PhonesSqlProvider.class, method="deleteByExample")
    int deleteByExample(PhonesExample example);

    @Delete({
        "delete from phones",
        "where pid = #{pid,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer pid);

    @Insert({
        "insert into phones (pid, pname)",
        "values (#{pid,jdbcType=INTEGER}, #{pname,jdbcType=VARCHAR})"
    })
    int insert(Phones record);

    @InsertProvider(type=PhonesSqlProvider.class, method="insertSelective")
    int insertSelective(Phones record);

    @SelectProvider(type=PhonesSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="pid", property="pid", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="pname", property="pname", jdbcType=JdbcType.VARCHAR),
            @Result(column="pid",property="watches", many = @Many(select = "com.zxr.mapper.WatchesMapper.WafindPh"))
    })
    List<Phones> selectByExample(PhonesExample example);

    @Select({
            "SELECT  ",
            "pid, pname ",
            "FROM phones ",
            "WHERE pid in ",
            " (SELECT pid ",
            " FROM cons ",
            "where wid = #{wid,jdbcType=INTEGER})"
    })
    @Results({
            @Result(column="pid", property="pid", jdbcType=JdbcType.INTEGER, id=true),
            @Result(column="pname", property="pname", jdbcType=JdbcType.VARCHAR),
            @Result(property="watches",column="pid", many = @Many(select = "com.zxr.mapper.WatchesMapper.WafindPh"))
    })
    List<Phones>  PhfindWa(Integer wid);


    @Results({
        @Result(column="pid", property="pid", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="pname", property="pname", jdbcType=JdbcType.VARCHAR),
            @Result(property="watches",column="pid", many = @Many(select = "com.zxr.mapper.WatchesMapper.WafindPh"))
    })
    Phones selectByPrimaryKey(Integer pid);


    @SelectProvider(type=phonesDT.class, method="queryPhoneId")
    @Results({
            @Result(column="pid", property="pid", jdbcType=JdbcType.INTEGER, id=true),
            @Result(column="pname", property="pname", jdbcType=JdbcType.VARCHAR),
            @Result(property="watches",column="pid", many = @Many(select = "com.zxr.mapper.WatchesMapper.WafindPh"))
    })
    Phones queryPhoneId(Map<String,Integer> map);

    @UpdateProvider(type=PhonesSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") Phones record, @Param("example") PhonesExample example);

    @UpdateProvider(type=PhonesSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") Phones record, @Param("example") PhonesExample example);

    @UpdateProvider(type=PhonesSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(Phones record);

    @Update({
        "update phones",
        "set pname = #{pname,jdbcType=VARCHAR}",
        "where pid = #{pid,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(Phones record);
}
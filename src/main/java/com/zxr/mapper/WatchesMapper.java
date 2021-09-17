package com.zxr.mapper;

import com.zxr.model.Watches;
import com.zxr.model.WatchesExample;
import java.util.List;

import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

public interface WatchesMapper {
    @SelectProvider(type=WatchesSqlProvider.class, method="countByExample")
    long countByExample(WatchesExample example);

    @DeleteProvider(type=WatchesSqlProvider.class, method="deleteByExample")
    int deleteByExample(WatchesExample example);

    @Delete({
        "delete from watches",
        "where wid = #{wid,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer wid);

    @Insert({
        "insert into watches (wid, wname)",
        "values (#{wid,jdbcType=INTEGER}, #{wname,jdbcType=VARCHAR})"
    })
    int insert(Watches record);

    @InsertProvider(type=WatchesSqlProvider.class, method="insertSelective")
    int insertSelective(Watches record);

    @SelectProvider(type=WatchesSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="wid", property="wid", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="wname", property="wname", jdbcType=JdbcType.VARCHAR)
    })
    List<Watches> selectByExample(WatchesExample example);

    @Select({
            "SELECT  ",
            "wid, wname",
            "FROM watches ",
            "WHERE wid in ",
            " (SELECT wid ",
            " FROM cons ",
            "WHERE pid = #{pid,jdbcType=INTEGER})"
    })
    @Results({
            @Result(column="wid", property="wid", jdbcType=JdbcType.INTEGER, id=true),
            @Result(column="wname", property="wname", jdbcType=JdbcType.VARCHAR),
            @Result(column="wid",property="phones",
                    many = @Many(select = "com.zxr.mapper.PhonesMapper.PhfindWa"))
    })
    List<Watches>  WafindPh(Integer pid);

    @Select({
        "select",
        "wid, wname",
        "from watches",
        "where wid = #{wid,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="wid", property="wid", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="wname", property="wname", jdbcType=JdbcType.VARCHAR),
            @Result(column="wid",property="phones",
                    many = @Many(select = "com.zxr.mapper.PhonesMapper.PhfindWa"))
    })
    Watches selectByPrimaryKey(Integer wid);

    @UpdateProvider(type=WatchesSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") Watches record, @Param("example") WatchesExample example);

    @UpdateProvider(type=WatchesSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") Watches record, @Param("example") WatchesExample example);

    @UpdateProvider(type=WatchesSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(Watches record);

    @Update({
        "update watches",
        "set wname = #{wname,jdbcType=VARCHAR}",
        "where wid = #{wid,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(Watches record);
}
package com.zxr.mapper;

import com.zxr.model.Teacher;
import com.zxr.model.TeacherExample;
import java.util.List;

import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

public interface TeacherMapper {
    @SelectProvider(type=TeacherSqlProvider.class, method="countByExample")
    long countByExample(TeacherExample example);

    @DeleteProvider(type=TeacherSqlProvider.class, method="deleteByExample")
    int deleteByExample(TeacherExample example);

    @Delete({
        "delete from teacher",
        "where ���ڰ༶ = #{���ڰ༶,jdbcType=CHAR}"
    })
    int deleteByPrimaryKey(String ���ڰ༶);

    @Insert({
        "insert into teacher (���ڰ༶, ѧУ, ���)",
        "values (#{���ڰ༶,jdbcType=CHAR}, #{ѧУ,jdbcType=CHAR}, #{���,jdbcType=INTEGER})"
    })
    int insert(Teacher record);

    @InsertProvider(type=TeacherSqlProvider.class, method="insertSelective")
    int insertSelective(Teacher record);

    @SelectProvider(type=TeacherSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="���ڰ༶", property="���ڰ༶", jdbcType=JdbcType.CHAR, id=true),
        @Result(column="ѧУ", property="ѧУ", jdbcType=JdbcType.CHAR),
        @Result(column="���", property="���", jdbcType=JdbcType.INTEGER),
            @Result(column = "���ڰ༶",property = "list", one = @One(select = "com.zxr.mapper.StudentMapper.selectTeacherStudent"))
    })
    List<Teacher> selectByExample(TeacherExample example);

    @Select({
        "select",
        "���ڰ༶, ѧУ, ���",
        "from teacher",
        "where ���ڰ༶ = #{���ڰ༶,jdbcType=CHAR}"
    })
    @Results({
        @Result(column="���ڰ༶", property="���ڰ༶", jdbcType=JdbcType.CHAR, id=true),
        @Result(column="ѧУ", property="ѧУ", jdbcType=JdbcType.CHAR),
        @Result(column="���", property="���", jdbcType=JdbcType.INTEGER)
    })
    Teacher selectByPrimaryKey(String ���ڰ༶);

    @UpdateProvider(type=TeacherSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") Teacher record, @Param("example") TeacherExample example);

    @UpdateProvider(type=TeacherSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") Teacher record, @Param("example") TeacherExample example);

    @UpdateProvider(type=TeacherSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(Teacher record);

    @Update({
        "update teacher",
        "set ѧУ = #{ѧУ,jdbcType=CHAR},",
          "��� = #{���,jdbcType=INTEGER}",
        "where ���ڰ༶ = #{���ڰ༶,jdbcType=CHAR}"
    })
    int updateByPrimaryKey(Teacher record);
}
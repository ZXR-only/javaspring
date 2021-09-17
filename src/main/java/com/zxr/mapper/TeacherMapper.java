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
        "where 所在班级 = #{所在班级,jdbcType=CHAR}"
    })
    int deleteByPrimaryKey(String 所在班级);

    @Insert({
        "insert into teacher (所在班级, 学校, 编号)",
        "values (#{所在班级,jdbcType=CHAR}, #{学校,jdbcType=CHAR}, #{编号,jdbcType=INTEGER})"
    })
    int insert(Teacher record);

    @InsertProvider(type=TeacherSqlProvider.class, method="insertSelective")
    int insertSelective(Teacher record);

    @SelectProvider(type=TeacherSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="所在班级", property="所在班级", jdbcType=JdbcType.CHAR, id=true),
        @Result(column="学校", property="学校", jdbcType=JdbcType.CHAR),
        @Result(column="编号", property="编号", jdbcType=JdbcType.INTEGER),
            @Result(column = "所在班级",property = "list", one = @One(select = "com.zxr.mapper.StudentMapper.selectTeacherStudent"))
    })
    List<Teacher> selectByExample(TeacherExample example);

    @Select({
        "select",
        "所在班级, 学校, 编号",
        "from teacher",
        "where 所在班级 = #{所在班级,jdbcType=CHAR}"
    })
    @Results({
        @Result(column="所在班级", property="所在班级", jdbcType=JdbcType.CHAR, id=true),
        @Result(column="学校", property="学校", jdbcType=JdbcType.CHAR),
        @Result(column="编号", property="编号", jdbcType=JdbcType.INTEGER)
    })
    Teacher selectByPrimaryKey(String 所在班级);

    @UpdateProvider(type=TeacherSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") Teacher record, @Param("example") TeacherExample example);

    @UpdateProvider(type=TeacherSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") Teacher record, @Param("example") TeacherExample example);

    @UpdateProvider(type=TeacherSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(Teacher record);

    @Update({
        "update teacher",
        "set 学校 = #{学校,jdbcType=CHAR},",
          "编号 = #{编号,jdbcType=INTEGER}",
        "where 所在班级 = #{所在班级,jdbcType=CHAR}"
    })
    int updateByPrimaryKey(Teacher record);
}
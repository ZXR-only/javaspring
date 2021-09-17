package com.zxr.mapper;

import com.zxr.model.Student;
import com.zxr.model.StudentExample;
import java.util.List;

import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

public interface StudentMapper {
    @SelectProvider(type=StudentSqlProvider.class, method="countByExample")
    long countByExample(StudentExample example);

    @DeleteProvider(type=StudentSqlProvider.class, method="deleteByExample")
    int deleteByExample(StudentExample example);

    @Delete({
        "delete from student",
        "where 班级 = #{班级,jdbcType=CHAR}"
    })
    int deleteByPrimaryKey(String 班级);

    @Insert({
        "insert into student (班级, 所在班级, 学校, ",
        "编号)",
        "values (#{班级,jdbcType=CHAR}, #{所在班级,jdbcType=CHAR}, #{学校,jdbcType=CHAR}, ",
        "#{编号,jdbcType=INTEGER})"
    })
    int insert(Student record);

    @InsertProvider(type=StudentSqlProvider.class, method="insertSelective")
    int insertSelective(Student record);

    @Results({
        @Result(column="班级", property="班级", jdbcType=JdbcType.CHAR, id=true),
        @Result(column="所在班级", property="所在班级", jdbcType=JdbcType.CHAR),
        @Result(column="学校", property="学校", jdbcType=JdbcType.CHAR),
        @Result(column="编号", property="编号", jdbcType=JdbcType.INTEGER)
    })
    List<Student> selectByExample(StudentExample example);


    @SelectProvider(type=StudentSqlProvider.class, method="selectByExample")
    @Results({
            @Result(column="班级", property="班级", jdbcType=JdbcType.CHAR, id=true),
            @Result(column="所在班级", property="所在班级", jdbcType=JdbcType.CHAR),
            @Result(column="学校", property="学校", jdbcType=JdbcType.CHAR),
            @Result(column="编号", property="编号", jdbcType=JdbcType.INTEGER),
            @Result(column="所在班级",property = "teacher",one = @One(select = "com.zxr.mapper.TeacherMapper.selectByPrimaryKey"))
    })

    List<Student> selectStudentfindTeacher(StudentExample example);

    @Select({
        "select",
        "班级, 所在班级, 学校, 编号",
        "from student",
        "where 班级 = #{班级,jdbcType=CHAR}"
    })
    @Results({
        @Result(column="班级", property="班级", jdbcType=JdbcType.CHAR, id=true),
        @Result(column="所在班级", property="所在班级", jdbcType=JdbcType.CHAR),
        @Result(column="学校", property="学校", jdbcType=JdbcType.CHAR),
        @Result(column="编号", property="编号", jdbcType=JdbcType.INTEGER)
    })
    Student selectByPrimaryKey(String 班级);

    @Select({
            "select",
            "班级, 所在班级, 学校, 编号",
            "from student",
            "where 所在班级 = #{所在班级,jdbcType=CHAR}"
    })
    @Results({
            @Result(column="班级", property="班级", jdbcType=JdbcType.CHAR, id=true),
            @Result(column="所在班级", property="所在班级", jdbcType=JdbcType.CHAR),
            @Result(column="学校", property="学校", jdbcType=JdbcType.CHAR),
            @Result(column="编号", property="编号", jdbcType=JdbcType.INTEGER)
    })
    List<Student> selectTeacherStudent(String 所在班级);

    @UpdateProvider(type=StudentSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") Student record, @Param("example") StudentExample example);

    @UpdateProvider(type=StudentSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") Student record, @Param("example") StudentExample example);

    @UpdateProvider(type=StudentSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(Student record);

    @Update({
        "update student",
        "set 所在班级 = #{所在班级,jdbcType=CHAR},",
          "学校 = #{学校,jdbcType=CHAR},",
          "编号 = #{编号,jdbcType=INTEGER}",
        "where 班级 = #{班级,jdbcType=CHAR}"
    })
    int updateByPrimaryKey(Student record);
}
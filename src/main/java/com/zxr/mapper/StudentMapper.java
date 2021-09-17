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
        "where �༶ = #{�༶,jdbcType=CHAR}"
    })
    int deleteByPrimaryKey(String �༶);

    @Insert({
        "insert into student (�༶, ���ڰ༶, ѧУ, ",
        "���)",
        "values (#{�༶,jdbcType=CHAR}, #{���ڰ༶,jdbcType=CHAR}, #{ѧУ,jdbcType=CHAR}, ",
        "#{���,jdbcType=INTEGER})"
    })
    int insert(Student record);

    @InsertProvider(type=StudentSqlProvider.class, method="insertSelective")
    int insertSelective(Student record);

    @Results({
        @Result(column="�༶", property="�༶", jdbcType=JdbcType.CHAR, id=true),
        @Result(column="���ڰ༶", property="���ڰ༶", jdbcType=JdbcType.CHAR),
        @Result(column="ѧУ", property="ѧУ", jdbcType=JdbcType.CHAR),
        @Result(column="���", property="���", jdbcType=JdbcType.INTEGER)
    })
    List<Student> selectByExample(StudentExample example);


    @SelectProvider(type=StudentSqlProvider.class, method="selectByExample")
    @Results({
            @Result(column="�༶", property="�༶", jdbcType=JdbcType.CHAR, id=true),
            @Result(column="���ڰ༶", property="���ڰ༶", jdbcType=JdbcType.CHAR),
            @Result(column="ѧУ", property="ѧУ", jdbcType=JdbcType.CHAR),
            @Result(column="���", property="���", jdbcType=JdbcType.INTEGER),
            @Result(column="���ڰ༶",property = "teacher",one = @One(select = "com.zxr.mapper.TeacherMapper.selectByPrimaryKey"))
    })

    List<Student> selectStudentfindTeacher(StudentExample example);

    @Select({
        "select",
        "�༶, ���ڰ༶, ѧУ, ���",
        "from student",
        "where �༶ = #{�༶,jdbcType=CHAR}"
    })
    @Results({
        @Result(column="�༶", property="�༶", jdbcType=JdbcType.CHAR, id=true),
        @Result(column="���ڰ༶", property="���ڰ༶", jdbcType=JdbcType.CHAR),
        @Result(column="ѧУ", property="ѧУ", jdbcType=JdbcType.CHAR),
        @Result(column="���", property="���", jdbcType=JdbcType.INTEGER)
    })
    Student selectByPrimaryKey(String �༶);

    @Select({
            "select",
            "�༶, ���ڰ༶, ѧУ, ���",
            "from student",
            "where ���ڰ༶ = #{���ڰ༶,jdbcType=CHAR}"
    })
    @Results({
            @Result(column="�༶", property="�༶", jdbcType=JdbcType.CHAR, id=true),
            @Result(column="���ڰ༶", property="���ڰ༶", jdbcType=JdbcType.CHAR),
            @Result(column="ѧУ", property="ѧУ", jdbcType=JdbcType.CHAR),
            @Result(column="���", property="���", jdbcType=JdbcType.INTEGER)
    })
    List<Student> selectTeacherStudent(String ���ڰ༶);

    @UpdateProvider(type=StudentSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") Student record, @Param("example") StudentExample example);

    @UpdateProvider(type=StudentSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") Student record, @Param("example") StudentExample example);

    @UpdateProvider(type=StudentSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(Student record);

    @Update({
        "update student",
        "set ���ڰ༶ = #{���ڰ༶,jdbcType=CHAR},",
          "ѧУ = #{ѧУ,jdbcType=CHAR},",
          "��� = #{���,jdbcType=INTEGER}",
        "where �༶ = #{�༶,jdbcType=CHAR}"
    })
    int updateByPrimaryKey(Student record);
}
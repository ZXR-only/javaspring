package com.zxr.service;

import com.zxr.model.Student;
import com.zxr.model.StudentExample;
import com.zxr.model.Teacher;
import com.zxr.model.TeacherExample;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.InputStream;
import java.util.List;

public class TeacherImp1 {
    private SqlSessionFactory sqlSessionFactory;
    @Before
    public void init(){
        InputStream inputStream=this.getClass().getClassLoader().getResourceAsStream("mybatis.cfg.xml");
        sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
    }
    @After
    public void TeacherQueryAll(){
        SqlSession sqlSession = sqlSessionFactory.openSession();
        try {
            TeacherExample teacherExample = new TeacherExample();
            List<Teacher> list = sqlSession.selectList("com.zxr.mapper.TeacherMapper.selectByExample",teacherExample);
            list.forEach(c-> {
                System.out.println("teacher:" + c.get学校() + " " + c.get编号() + " " + c.get所在班级());
                c.getList().forEach(student -> System.out.println("student:"+student.get学校()+" "+student.get编号()+" "+student.get所在班级()+" "+student.get所在班级()));
                System.out.print("\n");

            });
            sqlSession.commit();
        }catch (Exception e){
            sqlSession.rollback();
            e.printStackTrace();
        }finally {
            sqlSession.close();
        }
    }
    @Test
    public void Add(){
        SqlSession sqlSession = sqlSessionFactory.openSession();
        try {
            Teacher teacher = new Teacher();
            teacher.set所在班级("六年二班");
            teacher.set编号(555);
            teacher.set学校("西北二小");
            sqlSession.insert("com.zxr.mapper.TeacherMapper.insert",teacher);
            Student student01 = new Student();
            student01.setTeacher(teacher);
            student01.set学校("西北二小");
            student01.set班级("一年二班");
            student01.set所在班级(teacher.get所在班级());
            student01.set编号(77009);
            sqlSession.insert("com.zxr.mapper.StudentMapper.insert",student01);

            Student student02 = new Student();
            student02.setTeacher(teacher);
            student02.set学校("西北二小");
            student02.set班级("一年三班");
            student02.set编号(77008);
            student02.set所在班级(teacher.get所在班级());
            sqlSession.insert("com.zxr.mapper.StudentMapper.insert",student02);
            sqlSession.commit();
        }catch (Exception e){
            sqlSession.rollback();
            e.printStackTrace();
        }finally {
            sqlSession.close();
        }
    }
    @Test
    public void Del(){
        SqlSession sqlSession = sqlSessionFactory.openSession();
        try {
            StudentExample studentExample = new StudentExample();
            sqlSession.delete("com.zxr.mapper.StudentMapper.deleteByPrimaryKey","五年一班");
            sqlSession.commit();
        }catch (Exception e){
            sqlSession.rollback();
            e.printStackTrace();
        }finally {
            sqlSession.close();
        }
    }
    @Test
    public void StudentQueryAll(){
        SqlSession sqlSession = sqlSessionFactory.openSession();
        try {
            StudentExample studentExample = new StudentExample();
            List<Student> list = sqlSession.selectList("com.zxr.mapper.StudentMapper.selectStudentfindTeacher",studentExample);
            list.forEach(c-> {
                System.out.println("student:" +c.get所在班级()+" "+c.get学校() + " " + c.get编号() + " " +c.get班级()+"\n"+
                                    "teacher:"+c.getTeacher().get所在班级()+" "+c.getTeacher().get学校()+" "+c.getTeacher().get编号());

            });
            sqlSession.commit();
        }catch (Exception e){
            sqlSession.rollback();
            e.printStackTrace();
        }finally {
            sqlSession.close();
        }
    }

}

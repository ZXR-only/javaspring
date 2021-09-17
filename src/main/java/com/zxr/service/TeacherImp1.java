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
                System.out.println("teacher:" + c.getѧУ() + " " + c.get���() + " " + c.get���ڰ༶());
                c.getList().forEach(student -> System.out.println("student:"+student.getѧУ()+" "+student.get���()+" "+student.get���ڰ༶()+" "+student.get���ڰ༶()));
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
            teacher.set���ڰ༶("�������");
            teacher.set���(555);
            teacher.setѧУ("������С");
            sqlSession.insert("com.zxr.mapper.TeacherMapper.insert",teacher);
            Student student01 = new Student();
            student01.setTeacher(teacher);
            student01.setѧУ("������С");
            student01.set�༶("һ�����");
            student01.set���ڰ༶(teacher.get���ڰ༶());
            student01.set���(77009);
            sqlSession.insert("com.zxr.mapper.StudentMapper.insert",student01);

            Student student02 = new Student();
            student02.setTeacher(teacher);
            student02.setѧУ("������С");
            student02.set�༶("һ������");
            student02.set���(77008);
            student02.set���ڰ༶(teacher.get���ڰ༶());
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
            sqlSession.delete("com.zxr.mapper.StudentMapper.deleteByPrimaryKey","����һ��");
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
                System.out.println("student:" +c.get���ڰ༶()+" "+c.getѧУ() + " " + c.get���() + " " +c.get�༶()+"\n"+
                                    "teacher:"+c.getTeacher().get���ڰ༶()+" "+c.getTeacher().getѧУ()+" "+c.getTeacher().get���());

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

package com.zxr.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
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

public class PageServiceImpl {
    SqlSessionFactory sqlSessionFactory=null;
    @Before
    public void init(){
        InputStream inputStream=this.getClass().getClassLoader().getResourceAsStream("mybatis.cfg.xml");
        sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
    }
    @Test
    public void Page(){
        SqlSession session=sqlSessionFactory.openSession();
        PageHelper.startPage(2,3);
        List<Teacher> list=session.selectList("com.zxr.mapper.TeacherMapper.selectByExample");

        PageInfo<Teacher> pageInfo=new PageInfo(list);

        //��ӡ��ҳ��Ϣ
        System.out.println("����������" + pageInfo.getTotal());
        System.out.println("������ҳ����" + pageInfo.getPages());
        System.out.println("ÿҳ������" + pageInfo.getPageSize());
        System.out.println("��ǰҳ�룺" + pageInfo.getPageNum());
        System.out.println("���һҳҳ�ţ�" + pageInfo.getNavigateLastPage());
        System.out.println("��һҳҳ�ţ�" + pageInfo.getNavigateFirstPage());
        int a[]=pageInfo.getNavigatepageNums();
        for(int i :a){
            System.out.print("ҳ�룺"+i+",");
        }


        System.out.println("���ݲ��֣�" + pageInfo.getList());//����


        pageInfo.getList().forEach(c->System.out.println(c.get���ڰ༶()));

        session.close();
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
}


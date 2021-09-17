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

        //打印分页信息
        System.out.println("数据总数：" + pageInfo.getTotal());
        System.out.println("数据总页数：" + pageInfo.getPages());
        System.out.println("每页行数：" + pageInfo.getPageSize());
        System.out.println("当前页码：" + pageInfo.getPageNum());
        System.out.println("最后一页页号：" + pageInfo.getNavigateLastPage());
        System.out.println("第一页页号：" + pageInfo.getNavigateFirstPage());
        int a[]=pageInfo.getNavigatepageNums();
        for(int i :a){
            System.out.print("页码："+i+",");
        }


        System.out.println("数据部分：" + pageInfo.getList());//数据


        pageInfo.getList().forEach(c->System.out.println(c.get所在班级()));

        session.close();
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
}


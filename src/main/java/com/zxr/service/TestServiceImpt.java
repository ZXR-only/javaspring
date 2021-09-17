package com.zxr.service;

import com.zxr.model.TestExample;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.io.InputStream;
import java.util.List;

public class TestServiceImpt {
    private SqlSessionFactory sqlSessionFactory;
    public TestServiceImpt(){}
    @Before
    public void init(){
        //生成配置文档
        InputStream inputStream=this.getClass().getClassLoader().getResourceAsStream("mybatis.cfg.xml");
        sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
    }
    @Test
    public void Queryall(){
        SqlSession sqlSession = sqlSessionFactory.openSession();
        try{
            TestExample testExample = new TestExample();
            List<com.zxr.model.Test> list=sqlSession.selectList("com.zxr.mapper.TestMapper.selectByExample",testExample);
            list.forEach(c->System.out.println(c.getUseid()+" "+c.getUsename()+" "+c.getUsesalary()));
            sqlSession.commit();
        }catch (Exception e){
            sqlSession.rollback();
            e.printStackTrace();
        }finally {
            sqlSession.close();
        }
    }
    @Test
    public void update(){
        SqlSession sqlSession = sqlSessionFactory.openSession();
        try{
            com.zxr.model.Test test = new com.zxr.model.Test();
            test.setUsename("anklq");
            test.setUsesalary(9898);
            test.setUseage(1000);
            test.setUseid(1000);
            sqlSession.update("com.zxr.mapper.TestMapper.updateByPrimaryKey",test);
            TestExample testExample = new TestExample();
            List<com.zxr.model.Test> list=sqlSession.selectList("com.zxr.mapper.TestMapper.selectByExample",testExample);
            list.forEach(c->System.out.println(c.getUseid()+" "+c.getUsename()+" "+c.getUsesalary()));
            sqlSession.commit();
            sqlSession.commit();
        }catch (Exception e){
            sqlSession.rollback();
            e.printStackTrace();
        }finally {
            sqlSession.close();
        }
    }
    @Test
    public void Query(){
        SqlSession sqlSession = sqlSessionFactory.openSession();
        try{
            TestExample testExample = new TestExample();
            testExample.createCriteria().andUsenameLike("KK%");
            List<com.zxr.model.Test> list=sqlSession.selectList("com.zxr.mapper.TestMapper.selectByExample",testExample);
            list.forEach(c->System.out.println(c.getUseid()+" "+c.getUsename()+" "+c.getUsesalary()));
            sqlSession.commit();
        }catch (Exception e){
            sqlSession.rollback();
            e.printStackTrace();
        }finally {
            sqlSession.close();
        }
    }
    @Test
    public void Delete(){
        SqlSession sqlSession = sqlSessionFactory.openSession();
        try{
            com.zxr.model.Test test = new com.zxr.model.Test();
            sqlSession.delete("com.zxr.mapper.TestMapper.deleteByPrimaryKey",380);
            sqlSession.commit();
        }catch (Exception e){
            sqlSession.rollback();
            e.printStackTrace();
        }finally {
            sqlSession.close();
        }
    }
    @Test
    public void add(){
        SqlSession sqlSession = sqlSessionFactory.openSession();
        try{
            com.zxr.model.Test test = new com.zxr.model.Test();
            test.setUseage(100);
            test.setUseid(999);
            test.setUsesalary(857857);
            test.setUsename("KKK");
            sqlSession.insert("com.zxr.mapper.TestMapper.insert",test);
            sqlSession.commit();
        }catch (Exception e){
            sqlSession.rollback();
            e.printStackTrace();
        }finally {
            sqlSession.close();
        }
    }
}

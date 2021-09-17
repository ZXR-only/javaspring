package com.zxr.service;

import com.zxr.model.Retailers;
import com.zxr.model.RetailersExample;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.io.InputStream;
import java.util.List;

public class SrServiceImp1 {
    SqlSessionFactory sqlSessionFactory=null;
    @Before
    public void init(){
        InputStream inputStream=this.getClass().getClassLoader().getResourceAsStream("mybatis.cfg.xml");
        sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
    }
    @Test
    public void RequeryAll(){
        SqlSession sqlSession = sqlSessionFactory.openSession();
        try {
            /*List<Retailers> list=sqlSession.selectList("com.zxr.mapper.RetailersMapper.selectByExample",retailersExample);
            list.forEach(c->{
                System.out.println(c.get����������()+" "+c.get�ṩ��Ʒ()+" "+c.get���());
                c.getSuppliers().forEach(y->System.out.println(y.get��Ӧ������()+" "+y.get������Ʒ()+" "+y.get���()));
            });*/
            //Retailers retailers = new Retailers();
            Retailers retailers = sqlSession.selectOne("com.zxr.mapper.RetailersMapper.selectByPrimaryKey",1);
            System.out.println(retailers.get�ṩ��Ʒ()+" ");

            sqlSession.commit();
        }catch (Exception e){
            sqlSession.rollback();
            e.printStackTrace();
        }finally {
            sqlSession.close();
        }
    }
}

package com.zxr.service;

import com.zxr.model.Phones;
import com.zxr.model.PhonesExample;
import com.zxr.model.Retailers;
import com.zxr.model.Watches;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ConServiceImp {
    SqlSessionFactory sqlSessionFactory=null;
    @Before
    public void init(){
        InputStream inputStream=this.getClass().getClassLoader().getResourceAsStream("mybatis.cfg.xml");
        sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
    }
    @After
    public void QueryAll(){
        SqlSession sqlSession = sqlSessionFactory.openSession();
        try {
              PhonesExample phonesExample = new PhonesExample();
              List<Phones> list=sqlSession.selectList("com.zxr.mapper.PhonesMapper.selectByExample",phonesExample);
              list.forEach(c->{
                  System.out.println("Phones:");
                  System.out.println(c.getPid()+" "+c.getPname());
                  System.out.println("Watches:");
                  c.getWatches().forEach(y->System.out.println(y.getWid()+" "+y.getWname()));
                  System.out.println("------------");
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
    public void QueryMap(){
        SqlSession sqlSession = sqlSessionFactory.openSession();
        try {
            Map<String,Integer> map =new HashMap();
            map.put("pid",1);
            List<Phones> list = sqlSession.selectList("com.zxr.mapper.PhonesMapper.queryPhoneId",map);
            System.out.println("Map:");
            list.forEach(c->{
                System.out.println(c.getPid()+" "+c.getPname());
            });
            System.out.println("------------");
//            System.out.println("map: "+phones.getPid()+" "+phones.getPname());
            sqlSession.commit();
        }catch (Exception e){
            sqlSession.rollback();
            e.printStackTrace();
        }finally {
            sqlSession.close();
        }
    }
}

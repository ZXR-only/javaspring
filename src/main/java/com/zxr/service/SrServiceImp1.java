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
                System.out.println(c.get零售商名字()+" "+c.get提供货品()+" "+c.get编号());
                c.getSuppliers().forEach(y->System.out.println(y.get供应商名字()+" "+y.get生产货品()+" "+y.get编号()));
            });*/
            //Retailers retailers = new Retailers();
            Retailers retailers = sqlSession.selectOne("com.zxr.mapper.RetailersMapper.selectByPrimaryKey",1);
            System.out.println(retailers.get提供货品()+" ");

            sqlSession.commit();
        }catch (Exception e){
            sqlSession.rollback();
            e.printStackTrace();
        }finally {
            sqlSession.close();
        }
    }
}

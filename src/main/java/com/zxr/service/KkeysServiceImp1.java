package com.zxr.service;

import com.zxr.model.Kkeys;
import com.zxr.model.KkeysExample;
import com.zxr.model.Locks;
import com.zxr.model.LocksExample;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.InputStream;
import java.util.List;

public class KkeysServiceImp1 {



    private SqlSessionFactory sqlSessionFactory;
    public KkeysServiceImp1(){}
    @Before
    public void init(){
        InputStream inputStream=this.getClass().getClassLoader().getResourceAsStream("mybatis.cfg.xml");
        sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
    }
    @Test
    public void KeyQueryAll(){
        SqlSession sqlSession = sqlSessionFactory.openSession();
        try{
            KkeysExample kkeysExample = new KkeysExample();
            List<Kkeys> list=sqlSession.selectList("com.zxr.mapper.KkeysMapper.selectByExample",kkeysExample);
            list.forEach(c->System.out.println( "Kkeys:"+c.get����()+" "+c.get�ͺ�()+" "+c.get���()+"-----"+
                                                "Locks:"+c.getLocks().get����()+" "+c.getLocks().get�ͺ�()+" "+c.getLocks().get���()));
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            sqlSession.close();
        }
    }
    @After
    public void LockQueryAll(){
        SqlSession sqlSession = sqlSessionFactory.openSession();
        try{
            LocksExample locksExample = new LocksExample();
            List<Locks> list=sqlSession.selectList("com.zxr.mapper.LocksMapper.selectByExample",locksExample);
            list.forEach(c->System.out.println("Locks:"+"����:"+c.get�ͺ�()+" "+c.get���()+" "+c.get����()+"-----"+
                                                "Kkeys:"+"����:"+c.getKkeys().get�ͺ�()+" "+c.getKkeys().get���()+" "+c.getKkeys().get����()));
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            sqlSession.close();
        }
    }
    @Test
    public void Add(){
        SqlSession sqlSession = sqlSessionFactory.openSession();
        try{
            Locks locks = new Locks();
            locks.set�ͺ�("007");
            locks.set����("ͨ�õ���");
            locks.set���(10);
            sqlSession.insert("com.zxr.mapper.LocksMapper.insert",locks);
            Kkeys kkeys = new Kkeys();
            kkeys.set�ͺ�(locks.get�ͺ�());
            kkeys.set����("�Ϸ�����");
            kkeys.set���(9);
            sqlSession.insert("com.zxr.mapper.KkeysMapper.insert",kkeys);
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
        try{
            sqlSession.delete("com.zxr.mapper.KkeysMapper.deleteByPrimaryKey","001");
            sqlSession.delete("com.zxr.mapper.LocksMapper.deleteByPrimaryKey","001");
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
            Locks locks = new Locks();
            locks.set����("West");
            locks.set�ͺ�("002");
            locks.set���(996);
            sqlSession.update("com.zxr.mapper.LocksMapper.updateByPrimaryKey",locks);
            sqlSession.commit();
        }catch (Exception e){
            sqlSession.rollback();
            e.printStackTrace();
        }finally {
            sqlSession.close();
        }
    }
}

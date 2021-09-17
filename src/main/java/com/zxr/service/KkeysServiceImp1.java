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
            list.forEach(c->System.out.println( "Kkeys:"+c.get厂商()+" "+c.get型号()+" "+c.get编号()+"-----"+
                                                "Locks:"+c.getLocks().get厂商()+" "+c.getLocks().get型号()+" "+c.getLocks().get编号()));
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
            list.forEach(c->System.out.println("Locks:"+"主键:"+c.get型号()+" "+c.get编号()+" "+c.get厂商()+"-----"+
                                                "Kkeys:"+"主键:"+c.getKkeys().get型号()+" "+c.getKkeys().get编号()+" "+c.getKkeys().get厂商()));
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
            locks.set型号("007");
            locks.set厂商("通用电气");
            locks.set编号(10);
            sqlSession.insert("com.zxr.mapper.LocksMapper.insert",locks);
            Kkeys kkeys = new Kkeys();
            kkeys.set型号(locks.get型号());
            kkeys.set厂商("南方电子");
            kkeys.set编号(9);
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
            locks.set厂商("West");
            locks.set型号("002");
            locks.set编号(996);
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

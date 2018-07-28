package com.neuedu.MyBatis;


import com.neuedu.dao.UserDao;
import com.neuedu.entity.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.Reader;
import java.util.HashMap;
import java.util.Map;

public class MyBatisloginImpl implements UserDao {
    @Override
    public boolean addUser(User user) {
        return false;
    }

    @Override
    public User checkUser(String name, String password) {
        String resource = "MyBatis-config.xml";
        Reader reader = null;
        SqlSession session;
        try {
            reader = Resources.getResourceAsReader(resource);
        } catch (IOException e) {
// TODO Auto-generated catch block
            e.printStackTrace();
        }

        SqlSessionFactory sqlMapper = new SqlSessionFactoryBuilder()
                .build(reader);
        session = sqlMapper.openSession();

        Map<String, String> map = new HashMap<String, String>();
        map.put("username", name);
        map.put("password", password);

        Object o = session.selectOne("com.neuedu.entity.User.checkUser", map);
        System.out.println(o);
        session.close();
        if (o instanceof User) {

            return (User) o;

        } else {

            return null;


        }

    }

    @Override
    public void updateTokenByAccountid(String token, User user) {

    }

    @Override
    public String findTokenByAccountid(int Accountid) {
        return null;
    }
}

package com.neuedu.daoImpl;

import com.neuedu.dao.UserDao;
import com.neuedu.data.UserData;
import com.neuedu.entity.User;

import java.util.List;

public class UserDaoImpl implements UserDao {
    UserData userData = new UserData();

    @Override
    public User checkUser(String name, String password) {
        // TODO Auto-generated method stub
        List<User> user = UserData.users;
        for (int i = 0; i < user.size(); i++) {
            User u = user.get(i);
            if (u != null) {
                String _name = u.getUsername();
                String _password = u.getUserpassword();
                if (_name.equals(name) && _password.equals(password)) {
                    return u;
                }
            }
        }
        return null;
    }


    @Override
    public boolean addUser(User user) {
        // TODO Auto-generated method stub
        return UserData.users.add(user);
    }


    @Override
    public void updateTokenByAccountid(String token, User user) {
        // TODO Auto-generated method stub

    }


    @Override
    public String findTokenByAccountid(int Accountid) {
        // TODO Auto-generated method stub
        return null;
    }


}

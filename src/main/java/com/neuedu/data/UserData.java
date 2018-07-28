package com.neuedu.data;

import com.neuedu.entity.User;

import java.util.ArrayList;
import java.util.List;

public class UserData {

    public static List<User> users = new ArrayList<User>();

    public UserData() {
        User user = new User(1, "admin", "admin");
        users.add(user);
    }


}

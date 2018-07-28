package com.neuedu.controller;

import com.neuedu.entity.User;
import com.neuedu.input.MD5Utils;
import com.neuedu.service.UserService;
import com.neuedu.serviceImpl.UserServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;


@WebServlet("/login.do")
public class UserController extends HttpServlet {
    /**
     *
     */
    private static final long serialVersionUID = 1L;
    UserService userServiceImpl = new UserServiceImpl();

    public boolean addUser(User user) {
        // TODO Auto-generated method stub
        return userServiceImpl.addUser(user);
    }


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // TODO Auto-generated method stub

        String _username = req.getParameter("username");
        String _password = req.getParameter("password");
        /*System.out.println("username="+_username+"password="+MD5Utils.GetMD5Code(_password));*/

        User user = userServiceImpl.checkUser(_username, MD5Utils.GetMD5Code(_password));
        System.out.println(user);
        if (user != null) {
            Cookie cookie = new Cookie("username", _username);
            cookie.setMaxAge(0);

            resp.addCookie(cookie);

            Cookie password_cookie = new Cookie("password", MD5Utils.GetMD5Code(_password));
            password_cookie.setMaxAge(0);
            resp.addCookie(password_cookie);

            //�����ݿ������token
            long time = System.currentTimeMillis();
            String token = MD5Utils.GetMD5Code(_username + _password + time);
            System.out.println(user);


            userServiceImpl.addToken(token, user);
            System.out.println("kakakakakk" + token);
            //��Ự�������token
            HttpSession session = req.getSession();
            session.setAttribute("token", token);
            session.setAttribute("user", user);
            req.getRequestDispatcher("product/loginsucc.jsp").forward(req, resp);

        } else {
            req.getRequestDispatcher("login.jsp").forward(req, resp);
        }
    }


    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // TODO Auto-generated method stub
        doGet(req, resp);
    }

}

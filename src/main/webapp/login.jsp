<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Insert title here</title>
    <link rel="stylesheet" href="login.css"/>
    <style>

    </style>
</head>
<body>


<div id="title">
</div>
<div id="title2">

</div>

<div class="sign_in_all">
    <div class="sign_in">

        <div class="sign_in_title">
            <h2 class="sign_in_title_txt">欢迎登录</h2>
        </div>
        <div class="sign_in_content">
            <form action="login.do" method="get">
                <div class="sign_in_content1">

                    <div class="phone_number"><!--<label class="control_label">-->

                        <span> * 账号</span>
                         </label>
                        <input type="text" class="biaodan" name="username"/></div>
                    <div class="phone_number">
                        <span> * 密码</span>
                        <input type="password" class="biaodan" name="password"/>
                    </div>

                    <div class="form_group">
                        <a href="#"><span class="forget_password"> 忘记密码</span></a>

                    </div>
                    <div class="ok">
                        <a href="frame.html"> <input type="submit" value="登录" class="denglu"/></a>
                    </div>

                </div>
            </form>

        </div>
        </div>
    </div>
</div>


</body>
</html>
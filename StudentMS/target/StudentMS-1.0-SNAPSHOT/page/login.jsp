<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>login</title>
    <link rel="stylesheet" href="../css/reset.css">
    <link rel="stylesheet" href="../css/loginset.css">
</head>
<body>
<div class="box">
    <div class="box1"></div>
    <div class="box2">
        <div class="box21">
            <div class="box211"><p>学 生 管 理 系 统</p></div>
            <div class="box212">
                <form id="login" class="login">
                    <div>
                        <input id="account" name="account" type="text" placeholder="用户名">
                        <input id="pwd" name="pwd" type="password" placeholder="密码">
                    </div>
                    <div class="but">
                        <div>
                            <input id="logining" type="button" value="登录">
                        </div>
                        <div>
                            <input type="reset" value="重置">
                        </div>
                    </div>
                </form>
            </div>
        </div>
    </div>
</div>
</body>
</html>
<script type="text/javascript" src="/StudentMS/js/jquery.min.js"></script>
<script type="text/javascript" src="/StudentMS/js/msset.js"></script>
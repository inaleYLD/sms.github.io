<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>home</title>
</head>
<body>

<div class="box">
    <div class="box1">
        <p>学 生 管 理 系 统</p>
    </div>
    <div class="box2">
        <div class="box21" id="box21">
            <div class="box211"></div>
            <div class="box211"><p>学生信息管理界面</p></div>
            <div class="box211">
                <div class="stuinfor" id="stuinfor">
                </div>
            </div>
        </div>
    </div>
    <div class="box3">
        <div><p id="box31">学生信息管理</p></div>
        <div><p>学生成绩管理</p></div>
        <div><p id="box32">退出</p></div>
    </div>
</div>
<div class="box4" id="box4">

    <form id="student">
        <div class="box41">
            <div></div>
            <div>
                <input id="sid" name="sid" type="text" placeholder="学号"><br>
                <input id="sname" name="sname" type="text" placeholder="姓名"><br>
                <input id="sex" name="sex" type="text" placeholder="性别"><br>
                <input id="major" name="major" type="text" placeholder="专业" value=""><br>
                <input id="remarks" name="remarks" type="text" placeholder="备注"><br>
            </div>
            <div></div>
            <div class="but">
                <div>
                    <input id="sub" class="sub" type="button">
                </div>
                <div>
                    <input id="cancle" type="button" value="取消">
                </div>
            </div>
            <div></div>
        </div>
    </form>

</div>
</body>
</html>
<link rel="stylesheet" href="/StudentMS/css/homeset.css">
<link rel="stylesheet" href="/StudentMS/css/reset.css">
<script type="text/javascript" src="/StudentMS/js/jquery.min.js"></script>
<script type="text/javascript" src="/StudentMS/js/msset.js"></script>


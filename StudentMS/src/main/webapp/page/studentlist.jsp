<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>studentlist</title>
</head>
<body>
<div class="stuinfor1">
    <div><input id="insert" type="button" value="+"></div>
    <div><input type="text" placeholder="请输入学生姓名"></div>
    <div><input type="button" value="搜索"></div>
</div>
<div class="stuinfor2">
    <div class="stuinfor21">
        <table >
            <tr>
                <th width="15%">学号</th>
                <th width="15%">姓名</th>
                <th width="5%">性别</th>
                <th width="15%">专业</th>
                <th width="20%">备注</th>
                <th width="20%">操作</th>
            </tr>
            <c:forEach items="${students}" var="student">
                <tr id="${student.sid}" align="center">
                    <td>${student.sid}</td>
                    <td>${student.sname}</td>
                    <td>${student.sex}</td>
                    <td>${student.major}</td>
                    <td>${student.remarks}</td>
                    <td>
                        <div class="stuinfor211">
                            <div><input type="button" value="修改" onclick="updateStudent('${student.sid}')"></div>
                            <div><input type="button" value="删除" onclick="deleteStudent('${student.sid}')"></div>
                        </div>
                    </td>
                </tr>
            </c:forEach>
        </table>
    </div>
</div>
<div class="stuinfor3">
    <div style="margin: 1% 5.5%;width: 85%;height: 30%;">
        <div class="stuinfor31">
            <div><input id="prev_page" type="button" value="上一页"></div>
            <div><h3><strong id="page">${page}</strong><strong>/</strong><strong id="pages">${pages}</strong><h3></div>
            <div><input id="next_page" type="button" value="下一页"></div>
        </div>
    </div>
</div>
</body>
</html>
<link rel="stylesheet" href="/StudentMS/css/homeset.css">
<link rel="stylesheet" href="/StudentMS/css/reset.css">
<script type="text/javascript" src="/StudentMS/js/jquery.min.js"></script>
<script type="text/javascript" src="/StudentMS/js/msset.js"></script>

var url;
var page;
$("#cancle").click(function () {
    $("#student")[0].reset();
    $("#box4").css("display","none")
})
function updateStudent(id){
    page = $("#page").text()-1;
    url = "/StudentMS/student/updateStudent.do"
    var tr = document.getElementById(id);
    var tds = tr.cells;
    document.getElementById("sid").value=tds[0].innerText;
    document.getElementById("sname").value=tds[1].innerText;
    document.getElementById("sex").value=tds[2].innerText;
    document.getElementById("major").value=tds[3].innerText;
    document.getElementById("remarks").value=tds[4].innerText;
    document.getElementById("sub").value="修改学生";
    document.getElementById("box4").style.display="grid";
}
function deleteStudent(id){
    url = "/StudentMS/student/deleteStudentById.do";
    page = $("#page").text()-1;
    $.post(url,{sid:id},function () {
        $("#stuinfor").load("/StudentMS/student/listStudent.do?page="+page);
    });
}
$("#insert").click(function () {
    url = "/StudentMS/student/insertStudent.do";
    page = $("#pages").text()-1;
    $("#sub").attr("value","添加学生")
    $("#box4").css("display","grid");
})
$("#prev_page").click(function () {
    page = $("#page").text()-2;
    if (page>=0){
        $("#stuinfor").load("/StudentMS/student/listStudent.do?page="+page);
    }
})
$("#next_page").click(function () {
    page = $("#page").text();
    if (page<$("#pages").text()){
        $("#stuinfor").load("/StudentMS/student/listStudent.do?page="+page);
    }
})
$("#sub").click(function () {

    var obj = {};
    obj.sid=document.getElementById("sid").value;
    obj.sname=document.getElementById("sname").value;
    if (document.getElementById("sex").value=="男"){
        obj.male="0";
    }
    else {
        obj.male="1";
    }
    obj.major=document.getElementById("major").value;
    obj.remarks=document.getElementById("remarks").value;
    $.ajax({
        url:url,
        type:"post",
        contentType:"application/json",
        data:JSON.stringify(obj),
        success:function () {
            $("#stuinfor").load("/StudentMS/student/listStudent.do?page="+page);
            $("#student")[0].reset();
            $("#box4").css("display","none")
        }
    })
})
$("#logining").click(function () {
    url = "/StudentMS/student/logining.do"
    var user = {};
    user.account = $("#account").val();
    user.pwd = $("#pwd").val();
    $.ajax({
        url:url,
        type:"post",
        contentType:"application/json",
        data:JSON.stringify(user),
        success:function () {
            window.location="/StudentMS/student/home.do";
        }
    })
})
$("#box31").click(function () {
    $("#stuinfor").load("/StudentMS/student/listStudent.do?page=0");
    $("#box21").css("display","grid")
})
$("#box32").click(function () {
    url = "/StudentMS/student/quit.do";
    $.ajax({
        url:url,
        type:"get",
        success:function () {
            window.location="/StudentMS/student/home.do";
        }
    })
})
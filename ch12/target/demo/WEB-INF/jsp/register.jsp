<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2021/5/14
  Time: 20:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <style type="text/css">
        .textSize{
            width: 100pt;
            height: 15pt
        }
    </style>
    <title>注册画面</title>
    <script type="text/javascript">
        //注册时检查输入项
        function allIsNull(){
            var name=document.registForm.uname.value;
            var pwd=document.registForm.upass.value;
            var repwd=document.registForm.reupass.value;
            if(name==""){
                alert("请输入姓名！");
                document.registForm.uname.focus();
                return false;
            }
            if(pwd==""){
                alert("请输入密码！");
                document.registForm.upass.focus();
                return false;
            }
            if(repwd==""){
                alert("请输入确认密码！");
                document.registForm.reupass.focus();
                return false;
            }
            if(pwd!=repwd){
                alert("2次密码不一致，请重新输入！");
                document.registForm.upass.value="";
                document.registForm.reupass.value="";
                document.registForm.upass.focus();
                return false;
            }
            document.registForm.submit();
            return true;
        }
    </script>
</head>
<body>
<form action="${pageContext.request.contextPath }/student/register" method="post" name="registForm">
    <table
            border=1
            bgcolor="lightblue"
            align="center">
        <tr>
            <td>姓名：</td>
            <td>
                <input class="textSize" type="text" name="uname" value="${student.uname }"/>
            </td>
        </tr>

        <tr>
            <td>密码：</td>
            <td><input class="textSize" type="password" maxlength="20" name="upass"/></td>
        </tr>

        <tr>
            <td>确认密码：</td>
            <td><input class="textSize" type="password" maxlength="20" name="reupass"/></td>
        </tr>

        <tr>
            <td colspan="2" align="center"><input type="button" value="注册" onclick="allIsNull()"/></td>
        </tr>
    </table>
</form>
</body>
</html>
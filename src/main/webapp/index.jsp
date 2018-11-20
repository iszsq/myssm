<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
    <base href="<%=basePath%>">

    <title>添加用户</title>
    <meta http-equiv="pragma" content="no-cache">
    <meta http-equiv="cache-control" content="no-cache">
    <meta http-equiv="expires" content="0">
    <meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
    <meta http-equiv="description" content="This is my page">
    <meta http-equiv="Content-Type" content="text/html;charset=UTF_8">
    <!--
    <link rel="stylesheet" type="text/css" href="styles.css">
    -->
    <style type="text/css">
        .red{
            color: rgb(255,0,0);
        }
    </style>
</head>

<body>
<h1 class="red">${msg}</h1>
<h1>添加用户</h1>
<form action="demo3" method="post">
    <!-- 用户名：<input type="text" name="user.username">
    密    码：<input type="text" name="user.password"> -->

    用户名：<input type="text" name="username">
    密    码：<input type="text" name="password">
    <input type="checkbox" value="1" name="hover">
    <input type="checkbox" value="2" name="hover">
    <input type="checkbox" value="3" name="hover">
    <button type="submit">添加</button>
</form>
</body>
</html>

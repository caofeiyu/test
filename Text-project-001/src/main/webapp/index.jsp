<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<!doctype html>
<html lang="zh-CN">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>新闻管理系统</title>
    <link rel="stylesheet" type="text/css" href="bootstrap/css/bootstrap.min.css"/>
</head>
<body>
<div class="container">
    <form class="form-signin" action="${pageContext.request.contextPath}/web/login" method="post">
        <h2 class="form-signin-heading">用户登录</h2>
        <label for="inputTest" class="sr-only" >Email address</label>
        <input name="username" type="text" id="inputTest" class="form-control" placeholder="Email address" required autofocus>
        <label for="inputPassword" class="sr-only">Password</label>
        <input name="password" type="password" id="inputPassword" class="form-control" placeholder="Password" required>
        <button class="btn btn-lg btn-primary btn-block" type="submit">登录</button>
    </form>
</div>
<center><a href="newUser.jsp"><h5>注册</h5></a></center>
<script src="bootstrap/jquery-1.6.min.js"></script>
<%--<script src="https://cdn.jsdelivr.cn/npm/jquery@1.12.4/dist/jquery.min.js" integrity="sha384-nvAa0+6Qg9clwYCGGPpDQLVpLNn0fRaROjHqs13t4Ggj3Ez50XnGQqc/r8MhnRDZ" crossorigin="anonymous"></script>--%>
<script src="bootstrap/js/bootstrap.min.js"></script>
</body>
</html>
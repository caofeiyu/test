
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <meta charset="utf-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Title</title>
  <!-- 新 Bootstrap 核心 CSS 文件 -->
  <link href="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">

  <!-- jQuery文件。务必在bootstrap.min.js 之前引入 -->
  <script src="https://cdn.staticfile.org/jquery/2.1.1/jquery.min.js"></script>

  <!-- 最新的 Bootstrap 核心 JavaScript 文件 -->
  <script src="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/js/bootstrap.min.js"></script></head>
<body>
  <div class="container" style="background-color: #5bc0de; height: 100%">
    <ul class="nav nav-pills" style="background-color: #c9e2b3">
      <li class="active"><a href="${pageContext.request.contextPath}/web/user">使用者：${user}</a></li>
      <li><a href="${pageContext.request.contextPath}/News/Table">目录</a></li>
      <li ><a href="${pageContext.request.contextPath}/newNews.jsp">新建</a></li>
      <li><a href="#">查看</a></li>
    </ul>
    <table class="table">
      <tbody>
      <tr>
        <td>姓名：</td>
        <td>${uuuu.name}</td>
      </tr>
      <tr>
        <td>性别：</td>
        <td>${uuuu.sex}</td>
      </tr>
      <tr>
        <td>用户名：</td>
        <td>${uuuu.idName}</td>
      </tr>
      <tr>
        <td>账号：</td>
        <td>${uuuu.eMail}</td>
      </tr>
      </tbody>
    </table>
    <div class="row">
      <div class="col-sm-6 text-right">
        <a class="btn btn-default ">修改密码</a>
      </div>
      <div class="col-sm-6">
        <a class="btn btn-default " href="${pageContext.request.contextPath}/News/Table">返回目录</a>
      </div>
    </div>
  </div>
</body>
</html>

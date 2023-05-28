<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <meta charset="utf-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <title>详情</title>
  <!-- 新 Bootstrap 核心 CSS 文件 -->
  <link href="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">

  <!-- jQuery文件。务必在bootstrap.min.js 之前引入 -->
  <script src="https://cdn.staticfile.org/jquery/2.1.1/jquery.min.js"></script>

  <!-- 最新的 Bootstrap 核心 JavaScript 文件 -->
  <script src="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/js/bootstrap.min.js"></script></head>
<body>
<div class="container" style="background-color: #5bc0de; height: 100%">
  <ul class="nav nav-pills" style="background-color: #c9e2b3">
    <li><a href="${pageContext.request.contextPath}/web/user">使用者：${user}</a></li>
    <li ><a href="${pageContext.request.contextPath}/News/Table">目录</a></li>
    <li><a href="${pageContext.request.contextPath}/newNews.jsp">新建</a></li>
    <li class="active"><a href="#">查看</a></li>
  </ul>
  <div style="text-align: center;">
    <c:forEach items="${NNNN}" varStatus="nn" var="n">
      <div style="text-align: center;"><h2>${n.title}</h2></div>
      <h4>作者：${n.author}&nbsp;&nbsp;日期：${n.date}&nbsp;&nbsp;</h4><small>热度：$${n.temperature}</small>
      <br>
      <form action="${pageContext.request.contextPath}/" class="form-horizontal">
        <div class="form-group">
          <label for="text" class="col-sm-1 control-label"></label>
          <div class="col-sm-10 ">
            <textarea cols="100" rows="20" name="text"  id="text">${n.text}</textarea>
          </div>
        </div>
        <div class="form-group">
          <div class="col-sm-6 col-sm-offset-4">
            <input type="submit" value="修改" class="btn  btn-success col-sm-4">
            <a href="${pageContext.request.contextPath}/News/Table" class="btn btn-default col-sm-4">返回</a>
          </div>
        </div>
      </form>
      <hr>
    </c:forEach>
  </div>
</div>
</body>
</html>

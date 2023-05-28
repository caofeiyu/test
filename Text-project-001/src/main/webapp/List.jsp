<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
  <meta charset="utf-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <title>新闻目录</title>
    <!-- 新 Bootstrap 核心 CSS 文件 -->
    <link href="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">

    <!-- jQuery文件。务必在bootstrap.min.js 之前引入 -->
    <script src="https://cdn.staticfile.org/jquery/2.1.1/jquery.min.js"></script>

    <!-- 最新的 Bootstrap 核心 JavaScript 文件 -->
    <script src="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body >
<div class="container" style="background-color: #5bc0de; height: 100%">
    <ul class="nav nav-pills" style="background-color: #c9e2b3">
        <li><a href="${pageContext.request.contextPath}/web/user">使用者：${user}</a></li>
        <li class="active"><a href="${pageContext.request.contextPath}/News/Table">目录</a></li>
        <li><a href="${pageContext.request.contextPath}/newNews.jsp">新建</a></li>
        <li><a href="#">查看</a></li>
    </ul>
  <table class="table table-hover table-bordered table-hover">
    <thead>
      <c:forEach items="${tables}" varStatus="t" var="table">
        <tr class="success">
          <td>${table.title}</td>
         <td>${table.author}</td>
          <td>${table.date}</td>
          <td>${table.temperature}</td>
          <td>
            <a href="${pageContext.request.contextPath}/News/detail?tt=${table.title}">查看</a>
           <a href="${pageContext.request.contextPath}/News/delete?title=${table.title}">删除</a>
          </td>
       </tr>
      </c:forEach>
    </tbody>
  </table>
    <dav class="col-sm-12">
        <a href="${pageContext.request.contextPath}/newNews.jsp" class="btn btn-default  col-sm-12 btn-warning" role="button">新建</a>
    </dav>
</div>
</table>
</body>
</html>
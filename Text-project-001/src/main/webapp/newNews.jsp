<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>新建新闻</title>
    <link rel="stylesheet" type="text/css" href="bootstrap/css/bootstrap.min.css"/>
</head>
<body>
    <div class="container" style="background-color: #5bc0de; height: 100%">
        <ul class="nav nav-pills" style="background-color: #c9e2b3">
            <li><a href="${pageContext.request.contextPath}/web/user">使用者：${user}</a></li>
            <li><a href="${pageContext.request.contextPath}/News/Table">目录</a></li>
            <li  class="active"><a href="${pageContext.request.contextPath}/newNews.jsp">新建</a></li>
            <li><a href="#">查看</a></li>
        </ul>
        <form action="${pageContext.request.contextPath}/News/insert" id="fff"  class="form-horizontal">
            <div class="form-group">
                <label for="title" class="col-sm-1 control-label">标题</label>
                <div class="col-sm-6 ">
                    <input type="text" class="form-control" name="title" id="title" placeholder="请输入标题">
                </div>
            </div>
            <div class="form-group">
                <label for="author" class="col-sm-1 control-label">作者</label>
                <div class="col-sm-6">
                    <input type="text" class="form-control" name="author" id="author" placeholder="请输入作者">
                </div>
            </div>
            <div class="form-group">
                <label for="date" class="col-sm-1 control-label">日期</label>
                <div class="col-sm-6">
                    <input type="date" class="form-control"name="date" id="date" placeholder="请输入日期">
                </div>
            </div>
            <div class="form-group">
                <label for="temperature" class="col-sm-1 control-label">热度</label>
                <div class="col-sm-6">
                    <input type="text" class="form-control" name="temperature" id="temperature" placeholder="请输入标题">
                </div>
            </div>
            <div class="form-group">
                <label for="text" class="col-sm-1 control-label">内容</label>
                <div class="col-sm-10 ">
                    <textarea cols="100" rows="20" name="text" form="fff" id="text"></textarea>
                </div>
            </div>
            <div class="form-group">
                <div class="col-sm-6 col-sm-offset-3">
                    <input type="submit" value="保存" class="btn  btn-success col-sm-4"/>
                    <a href="${pageContext.request.contextPath}/News/Table" class="btn btn-default col-sm-4">返回</a>
                </div>
            </div>
        </form>
    </div>
    <script src="bootstrap/jquery-1.6.min.js"></script>
    <script src="bootstrap/js/bootstrap.min.js"></script>
<%--<script src="https://cdn.jsdelivr.cn/npm/jquery@1.12.4/dist/jquery.min.js" integrity="sha384-nvAa0+6Qg9clwYCGGPpDQLVpLNn0fRaROjHqs13t4Ggj3Ez50XnGQqc/r8MhnRDZ" crossorigin="anonymous"></script>--%>
<%--<script src="bootstrap/js/bootstrap.min.js"></script>--%>
</body>
</html>

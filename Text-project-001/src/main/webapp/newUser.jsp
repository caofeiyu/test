<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <meta charset="utf-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <title>新用户注册</title>
  <link rel="stylesheet" type="text/css" href="bootstrap/css/bootstrap.min.css"/>
</head>
<body>
  <div class="container">
    <br><br><br><br><br>
    <form action="${pageContext.request.contextPath}/login/user" method="post"  >
      <div class="form-group col-sm-12 ">
        <label for="name" class="col-sm-1 control-label">姓名</label>
        <div class="col-sm-6 ">
          <input type="text" class="form-control" name="name" id="name" placeholder="请输入姓名">
        </div>
      </div>
      <div class="form-group col-sm-12">
        <label for="sex" class="col-sm-1 control-label">性别</label>
        <div class="col-sm-6 ">
          <input type="text" class="form-control" name="sex" id="sex" placeholder="请输入性别">
        </div>
      </div>
      <div class="form-group col-sm-12">
        <label for="user" class="col-sm-1 control-label">用户名</label>
        <div class="col-sm-6 ">
          <input type="text" class="form-control" name="user" id="user" placeholder="请输入用户名">
        </div>
      </div>
      <div class="form-group col-sm-12">
        <label for="email" class="col-sm-1 control-label">账号</label>
        <div class="col-sm-6 ">
          <input type="text" class="form-control" name="email" id="email" placeholder="请输入账号">
        </div>
      </div>
      <div class="form-group col-sm-12">
        <label for="password1" class="col-sm-1 control-label">密码</label>
        <div class="col-sm-6 ">
          <input type="text" class="form-control" name="password1" id="password1" placeholder="请输入密码">
        </div>
      </div>
      <div class="form-group col-sm-12">
        <label for="password2" class="col-sm-1 control-label">密码</label>
        <div class="col-sm-6 ">
          <input type="text" class="form-control" name="password2" id="password2" placeholder="请输入密码">
        </div>
      </div>
      <div class="form-group col-sm-12">
        <input type="submit" value="注册" class="btn btn-info col-sm-7">
      </div>
    </form>
  </div>
${requestScope.error}
<script src="https://cdn.jsdelivr.cn/npm/jquery@1.12.4/dist/jquery.min.js" integrity="sha384-nvAa0+6Qg9clwYCGGPpDQLVpLNn0fRaROjHqs13t4Ggj3Ez50XnGQqc/r8MhnRDZ" crossorigin="anonymous"></script>
<script src="bootstrap/js/bootstrap.min.js"></script>
</body>
</html>

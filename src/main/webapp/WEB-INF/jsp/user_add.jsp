<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
    <form action="/SSM/user/add.action" method="post">
        用户名：<input type="text" name="name"/><br/>
		年龄：<input type="text" name="age"/><br/>
		性别：<input type="text" name="gender"/><br/>
		<input type="submit" value="添加">	
    </form>
</body>
</html>
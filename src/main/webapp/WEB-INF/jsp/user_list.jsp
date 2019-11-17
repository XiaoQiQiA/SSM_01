<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="/SSM/bootstrap-3.3.7-dist/css/bootstrap.css"/>
		<script type="text/javascript">
			function deleteById(id) {
				var isDelete = confirm("您确认要删除么？");
				if (isDelete) {
					location.href = "/SSM/user/deleteById.action?id=" + id;
				}
			}
		</script>
</head>
<body>

<a href="/SSM/user/getUseraddPage.action" class="btn btn-success">添加</a>
<table border="1" cellpase="5px" align="center">
     <tr>
        <td>学号</td>
        <td>姓名</td>
        <td>性别</td>
        <td>年龄</td>
        <td>删除</td>
        <td>修改</td>
     </tr>
     <c:forEach items="${list}" var="user">
        <tr>
           <td>${user.id}</td>
           <td>${user.name}</td>
           <td>${user.gender}</td>
           <td>${user.age}</td>
           <td><a onclick="deleteById(${user.id})">删除</a></td>
           <td><a href="">修改</a>
        </tr>
     </c:forEach>
</table>
</body>
</html>
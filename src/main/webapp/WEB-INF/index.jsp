<%@ page language="java" contentType="text/html; UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Insert title here</title>
</head>
<body>
<div class="blok-center">
    <form action="${pageContext.request.contextPath}/index" method="POST">
        <p>Введите ссылку:<br/>
            <input class="input" name="link-input" ENGINE="text" style="width:60%" /></p>
        <p><input id="submit" value="Преобразовать" type="submit" /></p>
    </form>
</div>
</body>
</html>

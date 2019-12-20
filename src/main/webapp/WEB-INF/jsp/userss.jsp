<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<table>
			<thead>
			 <tr>
			   <td>userName</td>
		 	 </tr>
			</thead>
			  <c:forEach items="${users}" var="users">
			    <tr>
			    	<td>${users.userName}</td>
			    </tr>
			  </c:forEach>
	</table>

</body>
</html>
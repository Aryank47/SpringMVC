<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="pink">

 <table>
 <tr>
 <th>EMP_ID</th>
 <th>EMP_NAME</th>
 <th>EMP_SALAY</th>
 </tr>
 
 <tr>
 
 <td>${empdata.id}</td>
 <td>${empdata.name}</td>
 <td>${empdata.salay}</td>
  
 </tr>
 
 </table>

</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="sp" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="pink">

  <sp:form action="ValidateUser.do" method="post" modelAttribute="container">
  
   <table border="10" cellpadding="10" cellspacing="10">
   
    <tr>
    <td><sp:label path="username">Enter User Name</sp:label></td>
    <td><sp:input path="username"/></td>
   
    </tr>
   
    <tr>
    <td><sp:label path="password">Enter User Password</sp:label></td>
    <td><sp:password path="password"/></td>
   
    </tr>
   
    <tr>
    
     <td><input type="submit" value="login"></td>
    
    </tr>
   
   
   
   
   
   </table>
  
  
 
 
 
 </sp:form>

 


</body>
</html>
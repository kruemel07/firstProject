<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

<form name='f' action="j_spring_security_check" method='POST'>
<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
      <table>
         <tr>
            <td>User:</td>
            <td><input type='text' name='j_username' value=''></td>
         </tr>
         <tr>
            <td>Password:</td>
            <td><input type='password' name='j_password' /></td>
         </tr>
         <tr>
            <td><input name="submit" type="submit" value="submit" /></td>
         </tr>
      </table>
  </form>
</body>
</html>
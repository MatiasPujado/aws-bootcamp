<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.io.*,java.lang.*,java.util.*"%>
<%@ page import="main.ar.com.entities.User" %>
<%@ page import="main.ar.com.services.UserService" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html lang="en">
<%--    User: coder       Date: 5/30/22        Time: 11:07 PM   --%>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta http-equiv="X-UA-Compatible" content="ie=edge">
<meta name="Description" content="Enrollment of users"/>
<link type="text/css" rel="stylesheet" href="main/webapp/style.css">
<link href="favicon.ico" rel="icon" type="image/x-icon" />
<%
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + request.getContextPath() + "/";
%>
<base href="<%=basePath%>" />

<title>UsersIO</title>
</head>
<body>

<%--Navbar--%>
<header>
    <div class="container">
      <h1 class="logo">UsersIO App <p>with Maven</p></h1>
      <nav>
        <ul>
          <li><a href="">Home</a></li>
          <li><a href="insert">Join</a></li>
        </ul>
      </nav>
    </div>
</header>

<%--Enrollment form--%>
<main>
<h2 class="title">Fill in the form</h2>
<div id="form-container">
    <form  id="form" action="insert" method="post">
        <input placeholder="Name" id="name" type="text" name="name" autofocus required>
        <input placeholder="Surname" id="surname" type="text" name="surname" required>
        <input placeholder="ID#" id="idNumber" type="text" name="idNumber" required>
        <div id="bday">
            <input placeholder="Birthday" id="birthday" type="date" name="birthday" required>
        </div>
        <input placeholder="Profession" id="profession" type="text" name="profession" required>
         <%--Submit Button--%>
         <div id="bttn">
            <button id="submitBttn" type="submit" name="submit" value="submit">Submit</button>
         </div>
    </form>
</div>
</main>
</body>
</html>

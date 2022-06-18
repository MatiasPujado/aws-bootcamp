<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.io.*,java.lang.*,java.util.*"%>
<%@ page import="ar.com.entities.User" %>
<%@ page import="ar.com.services.UserService" %>
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
<link type="text/css" rel="stylesheet" href="ar/com/web/style.css">
<link href="ar/com/web/resources/favicon.ico" rel="icon" type="image/x-icon" />
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
      <h1 class="logo">UsersIO App</h1>
      <nav>
        <ul>
          <li><a href="">Home</a></li>
          <li><a href="insert">Join</a></li>
        </ul>
      </nav>
    </div>
</header>

<%--List of Users--%>
<main>
<div></div>
<h1 class="title">List of enrolled users</h1>
<div id="tbl-list">
    <table>
        <colgroup>
            <col>
            <col span="2">
            <col span="2">
            <col span="2">
            <col span="2">
            <col span="2">
            <col span="2">
        </colgroup>
        <thead>
            <tr id="t-row" >
                <th scope="col">Name</th>
                <th scope="col">Last Name</th>
                <th scope="col">ID#</th>
                <th scope="col">Birthday</th>
                <th scope="col">Profession</th>
            </tr>
        </thead>
        <tbody>
            <%
            for(User user : (List<User>)request.getAttribute("userList")) {
                if(Objects.equals(user.getName(), "null") && Objects.equals(user.getLastName(), "null") && Objects.equals(user.getIdNumber(), "null") && Objects.equals(user.getDateOfBirth(), "null") && Objects.equals(user.getProfession(), "null")) {
            %>
            <tr id="t-row" ></tr>
            <%
                } else {
            %>
            <tr id="t-row" >
                <td><%= user.getName() %></td>
                <td><%= user.getLastName() %></td>
                <td><%= user.getIdNumber() %></td>
                <td><%= user.getDateOfBirth() %></td>
                <td><%= user.getProfession() %></td>
                <td><a href="update" value="getServletContext().setAttribute("idNumber", user.getIdNumber())" ><img src="ar/com/web/resources/update.png" alt="Update" width="20px" ></a></td>
                <td><a href="delete" value="getServletContext().setAttribute("idNumber", user.getIdNumber())" ><img src="ar/com/web/resources/bin-white.png" alt="Delete" width="20px" ></a></td>
            </tr>
            <%
                }
            }
            %>
        </tbody>
    </table>
</div>
</main>
</body>
</html>

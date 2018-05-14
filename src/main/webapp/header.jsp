<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8"/>
    <!--[if lt IE 9]>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/html5shiv/3.7.3/html5shiv.min.js"></script><![endif]-->
    <title></title>
    <meta name="keywords" content=""/>
    <meta name="description" content=""/>
    <link href="../sources/style.css" rel="stylesheet">
</head>

<body>

<div class="wrapper">

    <header class="header">
        <h1>Система учета студентов</h1>
        <%if (request.getSession().getAttribute("login") != null) {%>
        <div class="logout">
            <%=(String) request.getSession().getAttribute("login")%>&nbsp;
            <a href="${pageContext.request.contextPath}/login?action=logout">Выйти</a>
        </div>
        <%}%>
    </header><!-- .header-->
    <div class="middle">
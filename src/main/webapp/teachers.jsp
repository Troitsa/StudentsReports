<%@ page import="pojo.Teacher" %>
<%@ page import="service.TeacherService" %>
<%@ page import="java.util.List" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ include file="header.jsp" %>
<%
    TeacherService teacherService = new TeacherService();
    List<Teacher> teachers = teacherService.getAllTeachers();
    request.setAttribute("teachers", teachers);
%>
<div class="container">
    <main class="content">
        <h1>Преподаватели</h1>
        <ul>
            <c:forEach var="teacher" items="${teachers}">
                <li>${teacher.name} ${teacher.surname}</li>
            </c:forEach>
        </ul>
    </main><!-- .content -->
</div>
<!-- .container-->
<%@ include file="aside.jsp" %>
<%@ include file="footer.jsp" %>
<%@ page import="service.GroupsService" %>
<%@ page import="pojo.Student" %>
<%@ page import="java.util.List" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ include file="header.jsp" %>
<%
    GroupsService groupsService = new GroupsService();
    int id = Integer.parseInt(request.getParameter("id"));
    List<Student> studentList = groupsService.getAllStudentsByGroupId(id);
    request.setAttribute("id", id);
    request.setAttribute("studentList", studentList);
%>
<div class="container">
    <main class="content">
        <h1>Группа ${id}</h1>
        <ul>
            <c:forEach var="student" items="${studentList}">
                <li><a href="student-report.jsp?studentId=${student.id}">${student.surname} ${student.name}</a></li>
            </c:forEach>
        </ul>
    </main><!-- .content -->
</div>
<!-- .container-->
<%@ include file="aside.jsp" %>
<%@ include file="footer.jsp" %>
<%@ page import="service.GroupsService" %>
<%@ page import="pojo.Student" %>
<%@ page import="java.util.List" %>
<%@ page import="service.StudentService" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ include file="header.jsp" %>
<%
    StudentService studentService = new StudentService();
    String studentId = request.getParameter("id");
    Student student = studentService.getStudentById(Integer.parseInt(studentId));
    request.setAttribute("student", student);
%>
<div class="container">
    <main class="content">
        <%
            if(student==null) {
        %>
        <h1>Запрашиваемый студент не существует.</h1>
        <%
            } else {
        %>
        <h1><%=student.getName()%>  <%=student.getSurname()%></h1>
        <form action="${pageContext.request.contextPath}/student" method="post">
            <input type="hidden" name="id" value="<%=student.getId()%>">
            <input type="text" value="<%=student.getName()%>" name="name"><BR>
            <input type="text" value="<%=student.getSurname()%>" name="surname"><BR>
            <input type="text" value="<%=student.getGroupsId()%>" name="group_id"><BR>
            <input type="submit" value="OK">
        </form>

        <%
          }
        %>
    </main><!-- .content -->
</div>
<!-- .container-->
<%@ include file="aside.jsp" %>
<%@ include file="footer.jsp" %>
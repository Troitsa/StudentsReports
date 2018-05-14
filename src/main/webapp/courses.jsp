<%@ page import="service.CourseService" %>
<%@ page import="pojo.Course" %>
<%@ page import="java.util.List" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ include file="header.jsp" %>
<%
    CourseService courseService = new CourseService();
    List<Course> courses = courseService.getAllCourses();
    request.setAttribute("courses", courses);
%>
<div class="container">
    <main class="content">
        <h1>Курсы</h1>
        <ul>
            <c:forEach var="course" items="${courses}">
                <li><a href="course.jsp?courseId=${course.id}">${course.title}</a></li>
            </c:forEach>
        </ul>
    </main><!-- .content -->
</div>
<!-- .container-->
<%@ include file="aside.jsp" %>
<%@ include file="footer.jsp" %>
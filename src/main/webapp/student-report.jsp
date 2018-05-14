<%@ page import="pojo.Student" %>
<%@ page import="pojo.Marks" %>
<%@ page import="service.StudentsReportService" %>
<%@ page import="java.util.List" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ include file="header.jsp" %>
<div class="container">
    <main class="content">
        <%
            StudentsReportService studentsReportService = new StudentsReportService();
            String studentId = request.getParameter("studentId");
            Student student = studentsReportService.getStudentById(Integer.parseInt(studentId));
            List<Marks> marks = studentsReportService.getMarksByStudentId(Integer.parseInt(studentId));
            request.setAttribute("student", student);
            request.setAttribute("marks", marks);
        %>
        <%
            if(student!=null) {
        %>
            <h1><%=student.getName()%>  <%=student.getSurname()%></h1>
            <% if (!marks.isEmpty()) {%>
                <table border="1">
                    <tr>
                        <th>Дата</th>
                        <th>Лекция</th>
                        <th>Оценка</th>
                    </tr>
                    <% for (Marks mark : marks) {%>
                    <tr>
                        <td><%=mark.getDate()%></td>
                        <td><%=mark.getLectureTitle()%></td>
                        <td><%=mark.getMark()%></td>
                    </tr>
                    <% } %>
                </table>
            <% } else { %>
                <p>Оценок пока нет.</p>
            <% }
        }
        %>
    </main><!-- .content -->
</div>
<!-- .container-->
<%@ include file="aside.jsp" %>
<%@ include file="footer.jsp" %>
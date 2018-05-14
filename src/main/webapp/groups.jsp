<%@ page import="pojo.Group" %>
<%@ page import="service.GroupsService" %>
<%@ page import="java.util.List" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ include file="header.jsp" %>
<%
    GroupsService groupsService = new GroupsService();
    List<Group> groupList = groupsService.getAllGrops();
    request.setAttribute("groupList", groupList);
%>
<div class="container">
    <main class="content">
        <h1>Группы</h1>
        <ul>
            <c:forEach var="group" items="${groupList}">
                <li><a href="group.jsp?id=${group.id}">Группа ${group.id}</a></li>
            </c:forEach>
        </ul>
    </main><!-- .content -->
</div>
<!-- .container-->
<%@ include file="aside.jsp" %>
<%@ include file="footer.jsp" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>主页</title>
</head>
<body>
<h3>欢迎，${user.username }</h3>
<%--<s:property value="#user.username"></s:property>--%>
<%--<c:out value="${user.username}"></c:out>
<%=request.getSession().getAttribute("user")%>
<c:if test="1==1" >
    aaaaaaaaaaa
</c:if>
<c:set var="lccc" value="lccc"></c:set>--%>
<%--<s:set name="lcc" value="lcc"></s:set>
<s:property value="#lcc"></s:property>--%>

</body>
</html>
<%-- 
    Document   : index
    Created on : 24-01-2018, 15:41:10
    Author     : alumnossur
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page import="cl.inacap.demoPersistence.beans.ServicioBean"%>
<%@page import="javax.naming.InitialContext"%>
<%@page import="cl.inacap.demoPersistence.beans.ServicioBeanLocal"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%! private ServicioBeanLocal service;%>
        <%
            InitialContext ctx = new InitialContext();
            this.service = (ServicioBeanLocal) ctx.lookup("java:global/DemoPersistence/ServicioBean!cl.inacap.demoPersistence.beans.ServicioBeanLocal");
        %>
        <c:set var="perfil" scope="page" value="<%=this.service.getPerfiles()%>"></c:set>

        <table>
            <thead>
                <tr>
                    <th>id</th>
                    <th>nombrePerfil</th>
                    <th>descripcionPerfil</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach items="${pageScope.perfil}" var="p">
                    <tr>
                        <td>${p.idPerfil}</td>
                        <td>${p.nombrePerfil}</td>
                        <td>${p.descripcionPerfil}</td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>
    </body>
</html>

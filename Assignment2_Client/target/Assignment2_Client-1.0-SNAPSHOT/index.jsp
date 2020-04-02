<%-- 
    Document   : home
    Created on : 8-Mar-2020, 9:10:44 PM
    Author     : CBui
--%>

<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Administrator page</title>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css"
              integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
    </head>
    <body>
        <div class="row">
             <div class="w-50 mx-auto">
                <h1 align="center">List Movies</h1>
                <a href="addmovie.jsp" class="btn btn-info" role="button">Add Movie</a>
                <table class="table table-hover table-responsive">
                    <th scope="col">Id</th><th scope="col">Name</th><th scope="col">Description</th><th colspan="3">Actions</th>
                        <c:forEach items="${movies}" var= "movie">
                        <tr>
                            <td><c:out value="${movie.id}"></c:out> </td>
                            <td><c:out value="${movie.name}"></c:out> </td>
                            <td><c:out value="${movie.description}"></c:out> </td>
                            <td><a href="Edit?id=<c:out value='${movie.id}' />" >Edit</a></td>
                            <td><a href="Delete?id=<c:out value='${movie.id}' />" >Delete</a></td>
                            <td><a href="Download?id=<c:out value='${movie.id}' />" >Download</a></td> 
                        </tr>
                    </c:forEach>
                </table>
            </div>
        </div>
        <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"
                integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo"
        crossorigin="anonymous"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js"
                integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49"
        crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js"
                integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy"
        crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/vue/dist/vue.js"></script>
        <script src="index.js"></script>
    </body>
</html>

<%-- 
    Document   : edit
    Created on : 11-Mar-2020, 1:00:39 AM
    Author     : CBui
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Edit Movie Page</title>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css"
              integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
    </head>
</head>
<body>
    <div class="container">
        <div class="row">
            <div class="w-50 mx-auto">
                <h1 align="center">Update Movie</h1>
                <form method="post" action="Edit" enctype="multipart/form-data">
                    <table class="table table-bordered">
                        <input type="hidden" name="id" value="${movie.id}">
                        <tr><td>File name: </td><td><input type="file" name="file" value="${movie.name}" /></td></tr>
                        <tr rowspan="5"><td>Description: </td><td><textarea rows = "3" cols = "50" name="description" >${movie.description}</textarea></td><tr>
                        <tr ><td colspan="2" align="center"><input type="submit" value="Update"  class="btn btn-info" /></td></tr>
                </form>
            </div>
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

<%-- 
    Document   : Index
    Created on : 11/07/2016, 05:40:48 PM
    Author     : Juan Pablo Guzmán G
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <jsp:include page="_head.html" />
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>LOGIN IKEA</title>
    </head>
    <body>
          <div class="content">
            <div class="container-fluid">
                <div class="row">
                    <div class="col-md-offset-3 col-md-6 col-sm-offset-3 col-sm-6">
                        <div class="row">
                            <div class="alert alert-danger" id="errorLogin">${errorLogin}</div>
                            <form class="form-horizontal" role="form" action="User" method="post">
                                <div class="form-group">
                                    <label for="username" class="col-sm-2 col-md-2 control-label">Username</label>
                                    <div class="col-sm-10 col-md-10">
                                        <input type="text" class="form-control" id="username" name="username" placeholder="Username">
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label for="password" class="col-sm-2 col-md-2 control-label">Password</label>
                                    <div class="col-sm-10 col-md-10">
                                        <input type="password" class="form-control" id="password" name="password" placeholder="Password">
                                    </div>
                                </div>
                                <input type="hidden" name="roleId" value="1"/>
                                <div class="form-group">
                                    <div class="col-sm-offset-2 col-sm-10 col-md-offset-2 col-md-10">
                                        <button type="submit" class="btn btn-default">Sign in</button>
                                    </div>
                                </div>
                            </form>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <script type="text/javascript" src="assets/js/footer.js"></script>
    </body>
    </body>
</html>

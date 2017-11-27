<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>EssenciAll - Login</title>
        
        <!-- Bootstrap core CSS -->
        <link href="bootstrap/dist/css/bootstrap.min.css" rel="stylesheet">

        <!-- Custom styles for this template -->
        <link href="bootstrap/dist/css/signin.css" rel="stylesheet">
        
    </head>
    <body>
        <div class="container">

            <form class="form-signin" action="GerenciaLogin" method="post">
              <h2 class="form-signin-heading">EssenciAll Login</h2>
              <label for="inputLogin" class="sr-only">Login</label>
              <input type="text" id="inputLogin" class="form-control" name="login" placeholder="Login" required autofocus>
              <label for="inputPassword" class="sr-only">Senha</label>
              <input type="password" id="inputPassword" class="form-control" name="senha" placeholder="Senha" required>
              <!-- <div class="checkbox">
                <label>
                  <input type="checkbox" value="remember-me"> Remember me
                </label>
              </div> -->
              <button class="btn btn-lg btn-primary btn-block" type="submit" name="acao" value="login">Sign in</button>
            </form>

          </div> <!-- /container -->
    </body>
</html>

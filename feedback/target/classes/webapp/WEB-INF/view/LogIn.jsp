<html>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<h3>Sign In</h3><br>
<style>
p{
text-align: center;
}
</style>
<body>
  <p>Don't have an account?</p><a href="signup">Sign Up</a>
  <form action="loginprocess.jsp" method="post">
  Email:<input type="text" name="email"/><br/><br/>
  Password:<input type="password" name="password"/><br/><br/>
  <p><a href="forget">Forgot your password?</a></p> 
  <input type="submit" value="Sign In">
  </form>
</body>
</html>
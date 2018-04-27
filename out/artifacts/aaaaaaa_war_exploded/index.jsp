<%--
  Created by IntelliJ IDEA.
  User: tinca
  Date: 4/27/2018
  Time: 11:00 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Login</title>
    <style type="text/css">
      .login{
        height: 250px;
        width: 250px;
        color: black;
        margin: auto;
        padding: 50px;
      }
      .login input{
        padding: 10px;
        margin: 5px;
      }
    </style>
  </head>
  <body>
  <form method="post" action="/aa">
    <div class="login">
      <h2>Product Discount Calculator</h2>
      <input type="text" name="ProductDescription" size="30" placeholder="Product Description">
      <input type="text" name="ListPrice" size="30" placeholder="List Price">
      <input type="text" name="DiscountPercent" size="30" placeholder="Discount Percent">
      <input type="submit" value="Calculate Discount">
    </div>
  </form>
  </body>
</html>

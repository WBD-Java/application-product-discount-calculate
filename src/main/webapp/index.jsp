<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 7/26/2018
  Time: 4:17 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Product Description</title>
    <link rel="stylesheet" href="style.css" type="text/css">
  </head>
  <body>
  <form method="post" action="/display-discount">
    <div class="product">
      <h2>Product Discount Calculator</h2>
      <label>Product Description:</label>
      <input type="text" name="description"><br>
      <label>List Price:</label>
      <input type="number" name="price"><br>
      <label>Discount Percent:</label>
      <input type="number" name="discount_percent"><br>
      <label>    </label>
      <input type="submit" value="Calculate Discount">
    </div>
  </form>
  </body>
</html>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.*"%>
  
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
 <head>
<!-- <link rel="stylesheet"  type="text/css"  href="Style/myCss.css"/>-->
</head> 
<script type="text/javascript" src="../scripts/javascripts.js"></script> 
<table  border='1' >
    <tr>
        <td>id</td>
        <td>name</td>
        <td>price</td>
        <td>edit</td>
        <td>delete</td>
    </tr>
    <c:forEach items="${cs}" var="c" varStatus="st">
        <tr>
            <td>${c.id}</td>
            <td>${c.name}</td>
            <td>${c.price}</td>
            <td><a href="editProduct?id=${c.id}">edit</td>  
            <td><a href="deleteProduct?id=${c.id}">delete</td>   
        </tr>
    </c:forEach>
</table>
<br>
		<form method="post" action="addProduct" onsubmit ="return checkform(this)">
			productname： <input id ="pname" name="name" value="" type="text" required> <br><br>
			productprice： <input id = "pprice" name="price" value="" type="text" required> <br><br>
			CategoryId:<input id="category.id" value="" type = "text"> <br><br>
			<input type="submit" value="增加产品" onclick="checkempty()">
		</form>
		
<br>
<p><a href="listProduct"/> All Product</p>
<p><a href = "listCategory"/> All Category</p>




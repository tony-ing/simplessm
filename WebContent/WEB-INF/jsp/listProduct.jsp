<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.*"%>
  
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
 <script type="text/javascript" src="../scripts/javascripts.js"></script>
<table  border='1' >
    <tr>
        <td>id</td>
        <td>name</td>
        <td>price</td>
        <td>modify date</td>
        <td>edit</td>
        <td>delete</td>
    </tr>
    <c:forEach items="${cs}" var="c" varStatus="st">
        <tr>
            <td>${c.id}</td>
            <td>${c.name}</td>
            <td>${c.price}</td>
        	<td>${c.addDate}</td>
            <td><a href="editProduct?id=${c.id}">edit</td>  
            <td><a href="deleteProduct?id=${c.id}">delete</td>   
        </tr>
    </c:forEach>
</table>

<br>
<p> Add New Proeuct</p>
		<form method="post" action="addProduct" onsubmit ="return checkform(this)">
			Product name:  <input name="name" value="" type="text" required> <br><br>
			Product price: <input name="price" value="" type="text" required> <br><br>
						 <!--  <input name="category.id" value="${category.id}" type = "hidden"> --><br><br>
			<input type="submit" value="增加产品">
		</form>
		


<p><a href = "listCategory"/> All Category</p>


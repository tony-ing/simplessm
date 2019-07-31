<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.*"%>
  
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
  <script type="text/javascript" src="../scripts/javascripts.js"></script>
<table  border='1' >
    <tr>
        <td>id</td>
        <td>name</td>
        <td>edit</td>
        <td>delete</td>
 
    </tr>
    <c:forEach items="${cs}" var="c" varStatus="st">
        <tr>
            <td>${c.id}</td>
            <td><a href = "showProduct?id=${c.id}"/>${c.name}</td>
      		<td><a href = "editCategory?id=${c.id}"/>edit</td>
      		<td><a href = "deleteCategory?id=${c.id}"/>delete</td>
               
        </tr>
    </c:forEach>
</table>
<br>
<br>
		<form method="post" action="addCategory" onsubmit ="return checkform(this)">
			categoryname： <input name="name" value="" type="text" required> <br><br>
			<input type="submit" value="增加分类">
		</form>

<p><a href="listProduct"/> All Product</p>



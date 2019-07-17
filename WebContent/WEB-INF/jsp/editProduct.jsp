<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.*"%>
 
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
 <script type="text/javascript" src="../scripts/javascripts.js"></script>
 <div style="width:500px;margin:0px auto;text-align:center">
	
	
	<div style="text-align:center;margin-top:40px">
		
		<form method="post" action="updateProduct" onsubmit ="return checkform(this)">
			产品名称： <input name="name" value="${p.name}" type="text" required> <br><br>
			产品价格： <input name="price" value="${p.price}" type="text" required> <br><br>
			
			<input type="hidden" value="${p.id}" name="id">
			CategoryID: <input name="category.id" value="${p.category.id}" required> <br><br>
			<input type="submit" value="修改产品">
		</form>

	</div>	
 </div>


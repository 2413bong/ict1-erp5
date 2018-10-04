<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8" />
<title>Insert title here</title>
</head>
<body>
<form action="/levelinfo" method="get">
	liname : <input type="text" name="liname">
	<button>검색</button>	
</form>
	<table border="1">
		<thead>
			<tr>
				<th>linum</th>
				<th>lilevel</th>
				<th>liname</th>
				<th>lidesc</th>
			</tr>
		</thead>
		<tbody>
			<c:if test="${empty liList}">
				<tr>
					<td colspan="4">암것도없음</td>
				</tr>
			</c:if>
			<c:forEach items="${liList}" var="li">
				<tr>
					<th>${li.linum}</th>
					<th>${li.lilevel}</th>
					<th>${li.liname}</th>
					<th>${li.lidesc}</th>
				</tr>
			</c:forEach>
		</tbody>
	</table>

</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false"%>
<%--
작성자 - 이주연
내용 - 결제내역 페이지
시작날짜 - 2016/07/17
수정날짜 - 
변경내용 - 
 --%>
<!DOCTYPE html>
<html>
<head>
<link href="/resources/bootstrap/css/bootstrap.css" rel="stylesheet" type="text/css" />
<script src="/resources/bootstrap/js/jquery-2.2.3.min.js"></script>
<script src="/resources/bootstrap/js/bootstrap.min.js"></script>
<script src="/resources/bootstrap/css/bootstrap.css" type="text/css"></script>
</head>
<body>
	<!-- 상단 tab start -->
	<div class="container">
		<br /> <br />
		<ul class="nav nav-tabs">
			<li class="active"><a href="payment">결제내역</a></li>
		</ul>
	</div>
	<!-- end -->
	<br /><br /><br />
	
	<!-- 결제한 곡에 대한 정보 start -->
	<div class="container">
		<div class="col-md-6 col-md-offset-3" align="center">
			<table class="table" >
				<tr>
					<th>날짜</th>
					<th>곡</th>
					<th>아티스트</th>
					<th>금액</th>
				</tr>
				<tr>
					<td>2016-07-17</td>
					<td><a href="download">Why</a></td>
					<td>태연</td>
					<td>$2</td>
				</tr>
				<tr>
					<td></td>
					<td></td>
					<td><strong>총 금액</strong></td>
					<td>$2</td>
				</tr>
			</table>
			</div>
		</div>
	<!-- end -->
</body>
</html>

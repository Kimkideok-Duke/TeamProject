<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
body {
	margin: 0;
	color: rgb(94, 94, 94);
}
#header {
	position: fixed;
	top: 0;
	width: 100%;
	z-index: 2;
}
.banner {
	background-color: #ffffff;
	text-align: center;
	margin: 0;
}

.banner>img {
	width: 100px;
	height:100px;
}

ul {
	list-style-type: none;
	margin: 0;
	padding: 0;
	overflow: hidden;
	background-color: #ffffff;
	font-size: 16px;
}

li {
	float: left;
	margin: 0 50px 0 0;
}

li a {
	display: inline-block;
	width: 100px;
	color: rgb(94, 94, 94);
	text-align: center;
	padding: 10px 25px;
	text-decoration: none;
}

li a:hover {
	color: #ffffff;
	background-color: rgba(250, 80, 120, 0.9);
}

#guard{
	height: 145px;
	width: 0;
}
</style>
</head>
<body>
<div id="header">
	<div class="banner" href="#">
		<img
			src="V.jpg">
	</div><!--
 --><div class="navigationbar">
		<ul>
			<li><a href="#">홈</a></li>
			<li><a href="#">매칭하기</a></li>
			<li><a href="#">마이프로필</a></li>
			<li><a href="#">커뮤니티</a></li>
			<li><a href="#">이벤트</a></li>
		</ul>
	</div>
</div>
<div id="guard"></div>

<div id="login">

</div>



</body>
</html>
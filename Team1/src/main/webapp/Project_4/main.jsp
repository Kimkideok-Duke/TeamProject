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
.contents-slider {
	background-color: #ffaaaa;
	height: 400px;
}

.contents-slider .slick-arrow {
	display: block;
	position: absolute;
	left: 95%;
	top: 50%;
	z-index: 1;
}

.contents-slider .slick-dots {
	display: inline;
	text-align: center;
}

.cotents-review {
	display: inline-block;
	padding: 10px 0 0 0;
	width: 50%;
	height: 260px;
	background-color: #F38FAE;
}

.contents-FAQ {
	display: inline-block;
	text-align: right;
	padding: 10px 0 0 0;
	width: 50%;
	height: 260px;
	background-color: #F56694;
}

.footer {
	width: 100%;
	height: 150px;
	background-color: #D4DADE;
}
/*
	.category{height: 60px;}
	
	.category>a{margin: 20px 20px 20px 20px; }
	.category>a:link{color: black; text-decoration: none;}
	.category>a:visited {color: black;}
	.category>a:hover {color: black; text-decoration: underline;}
	*/
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

	<div class="contents-slider">

		<div class="post">1</div>
		<div class="post">2</div>
		<div class="post">3</div>
		<div class="post">4</div>
		<div class="post">5</div>
	</div>

	<script src="//code.jquery.com/jquery-3.3.1.min.js"></script>
	<script
		src="//cdn.jsdelivr.net/npm/slick-carousel@1.8.1/slick/slick.min.js"></script>
	<link rel="stylesheet"
		href="//cdn.jsdelivr.net/npm/slick-carousel@1.8.1/slick/slick.css" />
	<link rel="stylesheet"
		href="//cdn.jsdelivr.net/npm/slick-carousel@1.8.1/slick/slick-theme.css" />

	<script>
		$( document ).ready( function() {
		$('.contents-slider').slick({
		  autoplay : true, 
		  arrows : true,
		  infinite: true,
		  speed: 600,
		  slidesToShow: 1,
		  adaptiveHeight: true
		});
		});
	</script>

	<div class="cotents-review">리뷰</div><!--

 --><div class="contents-FAQ">FAQ</div>

	<div class="footer">회사소개</div>
</body>
</html>



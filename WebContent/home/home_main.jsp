<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
	<link href="../css/reset.css" type= "text/css" rel="stylesheet">
	<link href="../css/home/home_main.css" type= "text/css" rel="stylesheet">
</head>
<body>
		<header id ="header">
		<div class = "content-container">
		<h1 id = "logo">
			<img src="../images/logo2.png" alt ="TalentOn"/>
		</h1>
		
		<h2 class = "hidden">회원메뉴</h2>
			<ul id ="join-menu" class="clearfix">
				<li><a href = "../home/home_main.jsp">JOIN</a></li>
			   	<li><a href = "../home/home_uploadProduct.jsp">UPLOAD</a></li>
			    <li><a href = "../home/home_login.jsp">LOGIN</a></li>
			</ul>
	
		<form id = "main-search">
			<fieldset>
				<legend class = "hidden">전체검색필드</legend>
				<input type = "text"/>
				<input type = "submit" value = "검색"/>
			</fieldset>
		</form>
		</div>
	</header>
	
	
    <div id = "body" class = "clearfix"> 
    	<div class = "content-container ">   
 	    	<div id = "main">  
	 	   		<h1  class = "hidden">메인메뉴</h1>
	 	   		<ul  id = "main-menu" >
					<li><a href = "../company/company_main.jsp">브랜드</a></li>
				   	<li><a href = "">작품보기</a></li>
				    <li><a href = "../home/home_uploadProduct.jsp">작품등록</a></li>
				    <li><a href = "">전체보기</a></li>
				</ul>
				
				<h1 class = "hidden">카테고리메뉴</h1>
				<ul id = "category-menu" class = "clearfix">
					<li><a href = ""><img src ="../images/candle.png" alt ="공예"></a></li>
				   	<li><a href = ""><img src ="../images/furniture.png" alt ="가구"></a></li>
				    <li><a href = ""><img src ="../images/jungkart.png" alt ="정크아트"></a></li>
				    <li><a href = ""><img src ="../images/art.png" alt ="미술"></a></li>
				    <li><a href = ""><img src ="../images/photo.png" alt ="사진"></a></li>
				    <li><a href = ""><img src ="../images/art1.png" alt ="미술2"></a></li>
				    <li><a href = ""><img src ="../images/cup.png" alt ="컵"></a></li>
				    <li><a href = ""><img src ="../images/art2.png" alt ="공예"></a></li>
				    <li><a href = ""><img src ="../images/case.png" alt ="케이스"></a></li>
				    <li><a href = ""><img src ="../images/art3.png" alt ="공예"></a></li>
				</ul>
				<div id = "visual">
                	<div class = "content-container">  
                	</div>
             	</div>
 	   		</div>
 	 	 </div> 
 	</div>
 	
 	<footer id ="footer">
 		<div class = "content-container">
    	<section>
	    	<h1 class="hidden">회사정보</h1>
	    	<nav id ="company-menu">
				<h1 class = "hidden">회사메뉴</h1>
				<ul class="clearfix">
					<li><a href = "../company/company_main.jsp">회사소개</a></li>
				   	<li><a href = "">웹사이트 이용안내</a></li>
				    <li><a href = "">웹사이트 공유</a></li>
				    <li><a href = "../company/company_inquiry.jsp">문의사항</a></li>
				    <li><a href = "">관련법규</a></li>
				    <li><a href = "">웹사이트 공유</a></li> 
				</ul>
			</nav>
		    <!-- <section>
			    <h1>회사소개내용</h1>
			   	<dl>
			   		<dt>주소:</dt> <dd> 서울시 동대문구</dd>
			   		<dt>관리자 메일 :</dt> <dd> yc203159@hanmail.net</dd>
			   		<dt>사업자 등록번호 :</dt> <dd>020-22-3-33</dd>
			   	</dl>
		   	</section>
		   	
		   	<section>
			   	<h1>권한정보</h1>
				<p>Copyright ⓒ newlecture.com 2012-2014 All Right Reserved. Contact admin@newlecture.com for more information</p> 
			</section>  	 -->
		</section> 
		</div>
 	</footer>
</body>
</html>
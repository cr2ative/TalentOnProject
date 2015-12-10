<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
	<link href="../css/reset.css" type= "text/css" rel="stylesheet">
	<link href="../css/home/home_login.css" type= "text/css" rel="stylesheet">
</head>
<body>
		<header id ="header">
		<div class = "content-container">
		<h1 id = "logo"><a href="../home/home_main.jsp" >
			<img src="../images/logo6.PNG" alt ="TalentOn"/>
			</a>
		</h1>
		
		<h2 class = "hidden">회원메뉴</h2>
		<ul id ="join-menu" class="clearfix">
			<li><a href = "../home/home_main.html">HOME</a></li>
			<li><a href = "../home/home_main.html">UPLOAD</a></li>
			<li><a href = "">LOGIN</a></li>
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
	
	<div id ="body">
		<div id = "content" class="page-content">
			<div class="wrapper">
				<header class="page-header">
					<h2 class="primary-title">LOGIN</h2>
					<h3 class="secondary-title" >로그인하시면 TALENT ON의 각종 서비스를 
					이용하실 수 있습니다.</h3>
				</header>
				<div class="board-write">
					<form>
						<input type="hidden" name="returnUrl" value>
						<input type="hidden" name="save_id" value>
						<section class="board-write-field">
							<table class="board-table">
								<tbody>
									<tr>
										<td class="loginlabel">
											<p>아이디</p>
										</td>
										<td>
											<input type="text" name="member_id" value tabindex="1">
										</td>
										<td rowspan="2">
											<div>
												<input type="submit" style="cursor:hand" class="btn btn-large btn-color" value="LOGIN" tabindex="3">
											</div>
										</td>
									</tr>
									<tr>
										<td class="loginlabel">
											<p>비밀번호</p>
										</td>
										<td>
											<input type="password" name="member_pass" value id="pass"  tabindex="1">
										</td>
									</tr>	
								</tbody>
							</table>
						</section>
					</form>
				</div>
				<div class="board-btns">
					<a href="" class = "btn btn-color">회원가입</a>
					<a href="../home/home_searchId.jsp" class = "btn btn-gray">아이디찾기</a>
					<a href="../home/home_searchPwd.jsp" class = "btn btn-gray">비밀번호찾기</a>
				</div>
			</div>
		</div>
	</div>
	
	
	
	<!-- <div class="content-container clear">
			<div id ="main" >
					<form id="login">
						<fieldset>
							<legend class = "hidden">아이디입력필드</legend>
							<label>아이디</label> <input type="text" /><p/>
							<label>비밀번호</label> <input type="password" /><p/>
							<input type = "submit" value = "login"/>
						</fieldset>
					</form>
			</div>
		</div> -->
	<footer id ="footer">
 		<div class = "content-container">
    	<section>
	    	<h1 class="hidden">회사정보</h1>
	    	<nav id ="company-menu">
				<h1 class = "hidden">회사메뉴</h1>
				<ul class="clearfix">
					<li><a href = "">회사소개</a></li>
				   	<li><a href = "">웹사이트 이용안내</a></li>
				    <li><a href = "">웹사이트 공유</a></li>
				    <li><a href = "../company/company_inquiry.jsp">문의사항</a></li>
				    <li><a href = "">관련법규</a></li>
				    <li><a href = "">웹사이트 공유</a></li> 
				</ul>
			</nav>
		</section> 
		</div>
 	</footer>

</body>
</html>
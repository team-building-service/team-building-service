<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>Insert title here</title>
	<script>
		alert('세션 초기화됨');
		location.href = '${app}/';
	</script>
</head>

<body>
<%
	// 세션 초기화
	session.invalidate();

	//전체 쿠키 삭제하기 
	Cookie[] cookies = request.getCookies() ;
	if(cookies != null){
		for(int i=0; i < cookies.length; i++){
			// 쿠키의 유효시간을 0으로 설정하여 만료시킨다
			cookies[i].setMaxAge(0) ; 
			// 응답 헤더에 추가한다 
			response.addCookie(cookies[i]) ;
	}}
%>
</body>
</html>
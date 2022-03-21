<%@page import="auth.businessLogic.UserDAO"%>
<%@page import="auth.businessLogic.UserVO"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%
	request.setCharacterEncoding("EUC_KR");
	System.out.println(session.getAttribute("test"));
	UserVO userVO = (UserVO)session.getAttribute("test");
	UserDAO userDAO = new UserDAO();
	System.out.println("session에 저장된 UserVO 유무 확인"+userVO);
	
	String id ="";
	String passwd ="";
	
	if( !(userVO.getId() == null && (userVO.getPasswd()==null))){
		id = userVO.getId();
		passwd = userVO.getPasswd();
		
		System.out.println("updateUser.jsp 19번행 ==>id,pwd체크"+id+passwd);
		
		userVO.setPasswd(request.getParameter("passwd"));
		userVO.setName(request.getParameter("name"));
		userVO.setEducation(request.getParameter("education"));
		userVO.setJob(request.getParameter("jobs"));
		userVO.setChildnum(request.getParameter("childnum"));
		userVO.setPhonenum(request.getParameter("phone"));
		userVO.setAdress(request.getParameter("adress"));
		
		userDAO.updateUser(userVO, id, passwd);
		System.out.println("updateUser.jsp 30번행 ==>userVO"+userVO);
	}	
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<%= userVO %>
	<h2>수정완료</h2>
	<a>메인으로</a>
</body>
</html>
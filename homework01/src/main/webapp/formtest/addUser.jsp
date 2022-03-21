<%@page import="auth.businessLogic.UserDAO"%>
<%@page import="auth.businessLogic.UserVO"%>
<%@page import="java.util.Enumeration"%>
<%@page import="java.util.HashMap"%>
<%@page import="java.util.Map"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%
	request.setCharacterEncoding("EUC_KR");
	response.setContentType("text/html;charset=EUC_KR");

	System.out.println("AddUser Servlet start");  
	Map<String, String> UM = new HashMap<String,String>();
	
	if(request.getParameter("id") == null || request.getParameter("passwd") == null){
		response.sendRedirect("addUser.html");
		return;
	}
	
	Enumeration<String> en = request.getParameterNames();

	while(en.hasMoreElements()){
		String name = en.nextElement();			
	
		if(name.equals("cal")) {
			String calin = "";
			String[] Cal = request.getParameterValues("cal");			
			for(int i=0; i<Cal.length; i++) {
				if(i <Cal.length-1) {
				    calin+=Cal[i]+"/";
					out.print(Cal[i]+"-");
				} else {
					calin+=Cal[i];
					UM.put(name, calin);
					out.print(Cal[i]);
				}
			}
		} else if(name.equals("phone")) {
			String[] num = request.getParameterValues("phone");
			String phonenum ="";
			for(int i=0;i<num.length;i++){
				if(i <num.length-1) {
					phonenum+=num[i]+"-";
				    out.print(num[i]+"-");
				} else {
					phonenum+=num[i];
					UM.put(name, phonenum);
					out.print(num[i]);
				}
			}				
		} else {
				String value = request.getParameter(name);
				UM.put(name, value);
			}
		}

	UserVO userVO = new UserVO();
	userVO.setAll(UM);
	System.out.println(userVO);

	// DB접근 Data 검색 비교 UserVO.active true/false 변경
	UserDAO useDao = new UserDAO();
	useDao.addUser(userVO);

	System.out.println("AddUser Servlet end");	
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<h2>회원가입 완료</h2>
	<%if(userVO.isActive()) {%>
		<%=userVO.getId()%>님 환영합니다.
	<% session.setAttribute("test",userVO); %>
	<%} else {%>
		회원가입 실패, 기입된 값이 올바르지 않습니다.
	<%} %>
	<p><p><a href='findUser.jsp'>내정보보기</a>
	<p><p><a href='findUser.html'>정보보기</a>
</body>
</html>
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

	// DB���� Data �˻� �� UserVO.active true/false ����
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
	<h2>ȸ������ �Ϸ�</h2>
	<%if(userVO.isActive()) {%>
		<%=userVO.getId()%>�� ȯ���մϴ�.
	<% session.setAttribute("test",userVO); %>
	<%} else {%>
		ȸ������ ����, ���Ե� ���� �ùٸ��� �ʽ��ϴ�.
	<%} %>
	<p><p><a href='findUser.jsp'>����������</a>
	<p><p><a href='findUser.html'>��������</a>
</body>
</html>
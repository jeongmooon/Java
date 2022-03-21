<%@page import="auth.businessLogic.UserDAO"%>
<%@page import="auth.businessLogic.UserVO"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%
	request.setCharacterEncoding("EUC_KR");
	System.out.println(session.getAttribute("test"));
	UserVO userVO = (UserVO)session.getAttribute("test");
	System.out.println("session�� ����� UserVO ���� Ȯ��"+userVO);
	
	if(request.getMethod().equals("GET")){
		String id = request.getParameter("id");

		if(!(id==null || id.equals(""))) {
			userVO = new UserVO();
			UserDAO userDao = new UserDAO();
			userVO=userDao.findUser(id);
			System.out.println(userVO);
		}
	}
	
%>
<!DOCTYPE html>
<html lang="en">
<head>	
    <meta charset="EUC-KR">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="./appendFormTest/addUser.css" />
    <title>MemberSheet</title>
</head>
<body>
	<!-- ��Ÿ ���� ���ۺκ�(css�ϱ� ���� ��������) -->
    <div class="membertitle">
        <h2>��������</h2>
        <p>����</p>
    </div>
    <br />
    <!-- ��Ÿ ���� ����κ�(css�ϱ� ���� ��������) -->    
    
    <!-- ū ���̺� ���ۺκ�(css�ϱ� ���� ��������) -->
    <div class="member__table">
    	<!-- form�±� ���� -->
        <form method="Post" action="updateUserView.jsp">
        
        	<!-- table�� ���� �κ� ���� -->
            <table class="tablesheet">
            	<tr>
                    <td class="title">���̵�</td>
                    <td colspan="3"><div name="id" id="id"></div></td>
                </tr>
                <tr>
                    <td class="title">��й�ȣ</td>
                    <td colspan="3"><div name="passwd" id="passwd"></div></td>
                </tr>
                <tr>
                    <td class="title">�̸�(�ѱ۽Ǹ�)</td>
                    <td colspan="3"><div name="name" id="name"></div></td>
                </tr>

                <tr>
                    <td class="title">����</td>
                    <td colspan="3"><div id="gender"></div></td>
                </tr>
                <tr>
                    <td class="title">�������</td>
                    <td colspan="3" class="calendar">
                    	<div id="luCal"></div><br/>
                    	<div id="cal"></div>
                    </td>
                </tr>
                <tr>
                    <td class="title">�����з�</td>
                    <td colspan="3">
                        <div class="text_select" id="education" name="education"></div>
                    </td>
                </tr>
                <tr>
                    <td class="title">����</td>
                    <td>
                        <div class="text_select" name="jobs" id="jobs">
                        </div>
                    </td>
                    <td class="title">�Ҽ�</td>
                    <td><div type="text"></div></td>
                </tr>
                <tr>
                    <td class="title">��ȥ����</td>
                    <td>
                    	<div id="merry"></div>
                    </td>
                    <td class="title">�ڳ��</td>
                    <td class="childenumBlock">
                        <div id="childnum" name="childnum"></div>��                       
                    </td>
                </tr>
                <tr>
                    <th rowspan="3" class="title">����ó</th>            
                    <td colspan="3">��ȭ��ȣ 
                        <input type="text" class="table__number" />-<input type="text" class="table__number" />-<input type="text" class="table__number" /> 
                        <input type="radio" checked="true" name="contactnum" value="��" />�� 
                        <input type="radio" name="contactnum" value="����" />����
                    </td>
                </tr>
                <tr>
                    <td colspan="3">�޴��� :
                        <div type="text" id="phone"  name="phone"></div>
                    </td>
                </tr>
                <tr>
                    <td colspan="3">��ȭ��ȣ�� �޴�����ȣ 2���� �� �ϳ��� �ݵ�� �Է��ϼž� �մϴ�.</td>
                </tr>
                <tr>
                    <td class="title">������ �ּ�</td>
                    <td colspan="3">
	                    <div  class="adBtnSet">
	                    	<div class="adBtn">����</div>
	                    	<div class="adBtn">����</div>                	
                    		<div class="addinput" type="text" name="adress" id="adress"></div>
                    	</div>
                    </td>
                </tr>        
            </table>
            <!-- table�� ���� �κ� ���� -->
			
			<!-- button�� ���� �κ� ���� -->
            <div class="btnSet">
            	<div>
            		<button class="setButton" type="button" value="�ڷ�"><a href='/Homework01'>�ڷ�</a></button>
            	</div>
            	<div>
	            	<%if(userVO.isActive()) {%>
	            		<button class="setButton" value="����" onClick="updateUserView.jsp">����</button>
	            	<%} else {}%>	            		            	
            	</div>
            </div>
            <!-- button�� ���� �κ� ���� -->
        </form>
        <!-- form�±� ���� -->
    </div>
    <!-- ū ���̺� ����κ�(css�ϱ� ���� ��������) -->
</body>
</html>

<script>
	document.getElementById("id").append('<%= userVO.getId()%>');
	document.getElementById("passwd").append('<%=userVO.getPasswd()%>');
	document.getElementById("name").append('<%=userVO.getName()%>');
	document.getElementById("gender").append('<%=userVO.getGender()%>');
	document.getElementById("cal").append('<%=userVO.getCal()%>');
	document.getElementById('luCal').append('<%=userVO.getLuCal()%>');
	document.getElementById("education").append('<%=userVO.getEducation()%>');
	document.getElementById("jobs").append('<%=userVO.getJob()%>');
	document.getElementById("merry").append('<%=userVO.getMerry()%>');
	document.getElementById("childnum").append('<%=userVO.getChildnum()%>');
	document.getElementById("phone").append('<%=userVO.getPhonenum()%>');
	document.getElementById("adress").append('<%=userVO.getAdress()%>');	
</script>
<%@page import="auth.businessLogic.UserDAO"%>
<%@page import="auth.businessLogic.UserVO"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%
	request.setCharacterEncoding("EUC_KR");
	System.out.println(session.getAttribute("test"));
	UserVO userVO = (UserVO)session.getAttribute("test");
	System.out.println("session에 저장된 UserVO 유무 확인"+userVO);
	
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
	<!-- 기타 내용 시작부분(css하기 쉽게 블럭지정용) -->
    <div class="membertitle">
        <h2>개인정보</h2>
        <p>도움말</p>
    </div>
    <br />
    <!-- 기타 내용 종료부분(css하기 쉽게 블럭지정용) -->    
    
    <!-- 큰 테이블 시작부분(css하기 쉽게 블럭지정용) -->
    <div class="member__table">
    	<!-- form태그 시작 -->
        <form method="Post" action="updateUserView.jsp">
        
        	<!-- table블럭 세팅 부분 시작 -->
            <table class="tablesheet">
            	<tr>
                    <td class="title">아이디</td>
                    <td colspan="3"><div name="id" id="id"></div></td>
                </tr>
                <tr>
                    <td class="title">비밀번호</td>
                    <td colspan="3"><div name="passwd" id="passwd"></div></td>
                </tr>
                <tr>
                    <td class="title">이름(한글실명)</td>
                    <td colspan="3"><div name="name" id="name"></div></td>
                </tr>

                <tr>
                    <td class="title">성별</td>
                    <td colspan="3"><div id="gender"></div></td>
                </tr>
                <tr>
                    <td class="title">생년월일</td>
                    <td colspan="3" class="calendar">
                    	<div id="luCal"></div><br/>
                    	<div id="cal"></div>
                    </td>
                </tr>
                <tr>
                    <td class="title">최종학력</td>
                    <td colspan="3">
                        <div class="text_select" id="education" name="education"></div>
                    </td>
                </tr>
                <tr>
                    <td class="title">직업</td>
                    <td>
                        <div class="text_select" name="jobs" id="jobs">
                        </div>
                    </td>
                    <td class="title">소속</td>
                    <td><div type="text"></div></td>
                </tr>
                <tr>
                    <td class="title">결혼여부</td>
                    <td>
                    	<div id="merry"></div>
                    </td>
                    <td class="title">자녀수</td>
                    <td class="childenumBlock">
                        <div id="childnum" name="childnum"></div>명                       
                    </td>
                </tr>
                <tr>
                    <th rowspan="3" class="title">연락처</th>            
                    <td colspan="3">전화번호 
                        <input type="text" class="table__number" />-<input type="text" class="table__number" />-<input type="text" class="table__number" /> 
                        <input type="radio" checked="true" name="contactnum" value="집" />집 
                        <input type="radio" name="contactnum" value="직장" />직장
                    </td>
                </tr>
                <tr>
                    <td colspan="3">휴대폰 :
                        <div type="text" id="phone"  name="phone"></div>
                    </td>
                </tr>
                <tr>
                    <td colspan="3">전화번호나 휴대폰번호 2가지 중 하나는 반드시 입력하셔야 합니다.</td>
                </tr>
                <tr>
                    <td class="title">거주지 주소</td>
                    <td colspan="3">
	                    <div  class="adBtnSet">
	                    	<div class="adBtn">국내</div>
	                    	<div class="adBtn">국외</div>                	
                    		<div class="addinput" type="text" name="adress" id="adress"></div>
                    	</div>
                    </td>
                </tr>        
            </table>
            <!-- table블럭 세팅 부분 종료 -->
			
			<!-- button블럭 세팅 부분 시작 -->
            <div class="btnSet">
            	<div>
            		<button class="setButton" type="button" value="뒤로"><a href='/Homework01'>뒤로</a></button>
            	</div>
            	<div>
	            	<%if(userVO.isActive()) {%>
	            		<button class="setButton" value="전송" onClick="updateUserView.jsp">수정</button>
	            	<%} else {}%>	            		            	
            	</div>
            </div>
            <!-- button블럭 세팅 부분 종료 -->
        </form>
        <!-- form태그 종료 -->
    </div>
    <!-- 큰 테이블 종료부분(css하기 쉽게 블럭지정용) -->
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
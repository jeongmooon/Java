<%@page import="auth.businessLogic.UserDAO"%>
<%@page import="auth.businessLogic.UserVO"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%
	request.setCharacterEncoding("EUC_KR");
	System.out.println(session.getAttribute("test"));
	UserVO userVO = (UserVO)session.getAttribute("test");
	System.out.println("session에 저장된 UserVO 유무 확인"+userVO);
		
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
        <form method="Post" action="updateUser.jsp">
        
        	<!-- table블럭 세팅 부분 시작 -->
            <table class="tablesheet">
            	<tr>
                    <td class="title">아이디</td>
                    <td colspan="3"><input type="text"  name="id" id="id" /></td>
                </tr>
                <tr>
                    <td class="title">비밀번호</td>
                    <td colspan="3"><input type="text"  name="passwd" id="passwd" /></td>
                </tr>
                <tr>
                    <td class="title">이름(한글실명)</td>
                    <td colspan="3"><input type="text"  name="name" id="name" /></td>
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
                        <select class="text_select" id="education" name="education">
                        </select>
                    </td>
                </tr>
                <tr>
                    <td class="title">직업</td>
                    <td>
                        <select class="text_select" name="jobs" id="jobs">
                        </select>
                    </td>
                    <td class="title">소속</td>
                    <td><input type="text"/></td>
                </tr>
                <tr>
                    <td class="title">결혼여부</td>
                    <td>
                    	<div id="merry"></div>
                    </td>
                    <td class="title">자녀수</td>
                    <td>
                        <select id="childnum" name="childnum"></select>
                        명
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
                        <input type="text" id="phone"  name="phone"/>
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
                    		<input class="addinput" type="text" name="adress" id="adress">
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
	            	<button class="setButton" type="submit" value="전송">전송</button>
	            	<button class="setButton" type="reset" value="취소">취소</button>
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
// 함수호출
education();
// 학력<option>넣기
// 나중에 Education 배열에 DB에서 받아온 학력테이블 컬럼값 넣으면됨
function education(){
    const Education = ["선택하세요","초등학교","중학교","고등학교","전문대학교","인문대학교"];
    
    for(let i=0; i<Education.length; i++){
        document.getElementById('education').options[i] = new Option(Education[i],Education[i]);
    }
}

// 함수호출
childnum();
// 자녀수<option>넣기
// 나중에 childnum 배열에 DB에서 받아온 자녀수테이블 컬럼값 넣으면됨
function childnum(){
	const childnum =["선택","없음",1,2,3,4,5,6,7,8];

	for(let i=0; i<childnum.length; i++){
        document.getElementById('childnum').options[i] = new Option(childnum[i],childnum[i]);
    }
}

// 함수호출
jobs();
// 자녀수<option>넣기
// 나중에 childnum 배열에 DB에서 받아온 자녀수테이블 컬럼값 넣으면됨
function jobs(){
	const jobs =["선택하세요","학생","직장인","주부","공무원"];

	for(let i=0; i<jobs.length; i++){
        document.getElementById('jobs').options[i] = new Option(jobs[i],jobs[i]);
    }
}

	document.getElementById("id").value = '<%= userVO.getId()%>';
	document.getElementById("passwd").value = '<%=userVO.getPasswd()%>';
	document.getElementById("name").value = '<%=userVO.getName()%>';
	document.getElementById("gender").append('<%=userVO.getGender()%>');
	document.getElementById("cal").append('<%=userVO.getCal()%>');
	document.getElementById('luCal').append('<%=userVO.getLuCal()%>');
	document.getElementById("education").value = '<%=userVO.getEducation()%>';
	document.getElementById("jobs").value ='<%=userVO.getJob()%>';
	document.getElementById("merry").append('<%=userVO.getMerry()%>');
	document.getElementById("childnum").value ='<%=userVO.getChildnum()%>';
	document.getElementById("phone").value ='<%=userVO.getPhonenum()%>';
	document.getElementById("adress").value ='<%=userVO.getAdress()%>';	
</script>
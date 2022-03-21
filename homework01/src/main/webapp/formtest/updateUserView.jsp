<%@page import="auth.businessLogic.UserDAO"%>
<%@page import="auth.businessLogic.UserVO"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%
	request.setCharacterEncoding("EUC_KR");
	System.out.println(session.getAttribute("test"));
	UserVO userVO = (UserVO)session.getAttribute("test");
	System.out.println("session�� ����� UserVO ���� Ȯ��"+userVO);
		
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
        <form method="Post" action="updateUser.jsp">
        
        	<!-- table�� ���� �κ� ���� -->
            <table class="tablesheet">
            	<tr>
                    <td class="title">���̵�</td>
                    <td colspan="3"><input type="text"  name="id" id="id" /></td>
                </tr>
                <tr>
                    <td class="title">��й�ȣ</td>
                    <td colspan="3"><input type="text"  name="passwd" id="passwd" /></td>
                </tr>
                <tr>
                    <td class="title">�̸�(�ѱ۽Ǹ�)</td>
                    <td colspan="3"><input type="text"  name="name" id="name" /></td>
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
                        <select class="text_select" id="education" name="education">
                        </select>
                    </td>
                </tr>
                <tr>
                    <td class="title">����</td>
                    <td>
                        <select class="text_select" name="jobs" id="jobs">
                        </select>
                    </td>
                    <td class="title">�Ҽ�</td>
                    <td><input type="text"/></td>
                </tr>
                <tr>
                    <td class="title">��ȥ����</td>
                    <td>
                    	<div id="merry"></div>
                    </td>
                    <td class="title">�ڳ��</td>
                    <td>
                        <select id="childnum" name="childnum"></select>
                        ��
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
                        <input type="text" id="phone"  name="phone"/>
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
                    		<input class="addinput" type="text" name="adress" id="adress">
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
	            	<button class="setButton" type="submit" value="����">����</button>
	            	<button class="setButton" type="reset" value="���">���</button>
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
// �Լ�ȣ��
education();
// �з�<option>�ֱ�
// ���߿� Education �迭�� DB���� �޾ƿ� �з����̺� �÷��� �������
function education(){
    const Education = ["�����ϼ���","�ʵ��б�","���б�","����б�","�������б�","�ι����б�"];
    
    for(let i=0; i<Education.length; i++){
        document.getElementById('education').options[i] = new Option(Education[i],Education[i]);
    }
}

// �Լ�ȣ��
childnum();
// �ڳ��<option>�ֱ�
// ���߿� childnum �迭�� DB���� �޾ƿ� �ڳ�����̺� �÷��� �������
function childnum(){
	const childnum =["����","����",1,2,3,4,5,6,7,8];

	for(let i=0; i<childnum.length; i++){
        document.getElementById('childnum').options[i] = new Option(childnum[i],childnum[i]);
    }
}

// �Լ�ȣ��
jobs();
// �ڳ��<option>�ֱ�
// ���߿� childnum �迭�� DB���� �޾ƿ� �ڳ�����̺� �÷��� �������
function jobs(){
	const jobs =["�����ϼ���","�л�","������","�ֺ�","������"];

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
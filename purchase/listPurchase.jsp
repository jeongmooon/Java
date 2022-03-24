<%@page import="java.util.ArrayList"%>
<%@page import="com.model2.mvc.service.user.vo.UserVO"%>
<%@page import="com.model2.mvc.service.purchase.vo.PurchaseVO"%>
<%@page import="java.util.List"%>
<%@page import="com.model2.mvc.common.SearchVO"%>
<%@page import="java.util.Map"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    
<%
	Map<String, Object> map =(Map<String,Object>)request.getAttribute("map");
	System.out.println("üũ��"+map.get("count"));
	SearchVO searchVO = (SearchVO)request.getAttribute("searchVO");
	UserVO userVO = (UserVO)session.getAttribute("user");
	
	int total = 0;
	List<PurchaseVO> dumy = null;
	if(map != null){
		total = ((Integer)map.get("count")).intValue();
		System.out.println("total��"+total);
		System.out.println("list��"+((List<PurchaseVO>)map.get("list")).get(0));
		dumy = (List<PurchaseVO>)map.get("list");
	}
	
	
	List<PurchaseVO> list = new ArrayList<PurchaseVO>();
	
	for(int i=0; i<dumy.size(); i++) {
		PurchaseVO vo = dumy.get(i);
		//System.out.println(vo.getBuyer().getUserId().equals(userVO.getUserId()));
		if(vo.getBuyer().getUserId().equals(userVO.getUserId())){
			//System.out.println("vovovovo"+vo);
			list.add(vo);
		}	
	}
	
	int currentPage = searchVO.getPage();
	
	int totalPage=0;
	if(total>0){
		totalPage=total/searchVO.getPageUnit();
		if(total%searchVO.getPageUnit()>0){
			totalPage +=1;
		}
	}
%>
<!DOCTYPE html>
<html>
<head>
<title>���� �����ȸ</title>

<link rel="stylesheet" href="/css/admin.css" type="text/css">

<script type="text/javascript">
	function fncGetUserList() {
		document.detailForm.submit();
	}
</script>
</head>

<body bgcolor="#ffffff" text="#000000">

<div style="width: 98%; margin-left: 10px;">

<form name="detailForm" action="/listUser.do" method="post">

<table width="100%" height="37" border="0" cellpadding="0"	cellspacing="0">
	<tr>
		<td width="15" height="37"><img src="/images/ct_ttl_img01.gif"width="15" height="37"></td>
		<td background="/images/ct_ttl_img02.gif" width="100%" style="padding-left: 10px;">
			<table width="100%" border="0" cellspacing="0" cellpadding="0">
				<tr>
					<td width="93%" class="ct_ttl01">���� �����ȸ</td>
				</tr>
			</table>
		</td>
		<td width="12" height="37"><img src="/images/ct_ttl_img03.gif"	width="12" height="37"></td>
	</tr>
</table>

<table width="100%" border="0" cellspacing="0" cellpadding="0"	style="margin-top: 10px;">
	<tr>
		<td colspan="11">��ü <%=total %>�Ǽ�,<%=currentPage %>������</td>
	</tr>
	<tr class="ct_list_pop">
		<td class="ct_list_b" width="100">No</td>
		<td class="ct_line02"></td>
		<td class="ct_list_b" width="150">ȸ��ID</td>
		<td class="ct_line02"></td>
		<td class="ct_list_b" width="150">ȸ����</td>
		<td class="ct_line02"></td>
		<td class="ct_list_b">��ȭ��ȣ</td>
		<td class="ct_line02"></td>
		<td class="ct_list_b">�����Ȳ</td>
		<td class="ct_line02"></td>
		<td class="ct_list_b">��������</td>
	</tr>
	<tr>
		<td colspan="11" bgcolor="808285" height="1"></td>
	</tr>
	<%
		int no =list.size();
		for(int i=0; i<list.size(); i++){
			PurchaseVO vo =(PurchaseVO)list.get(i);
	%>
	<tr>
		<td align="center"><%=no--%></td>
		<td></td>
		<td class="ct_list_b" width="150"><a href="/getProduct.do?prodNo=<%=vo.getTranNo() %>"><%= vo.getBuyer().getUserId() %></a></td>
		<td class="ct_line02"></td>
		<td class="ct_list_b" width="150"><%= vo.getBuyer().getUserName() %></td>
		<td class="ct_line02"></td>
		<td class="ct_list_b"><%= vo.getBuyer().getPhone() %></td>
		<td class="ct_line02"></td>
		<td class="ct_list_b"><%= vo.getTranCode() %></td>
		<td class="ct_line02"></td>
		<td class="ct_list_b"><%= vo.getTranCode() %></td>
	</tr>
	<tr>
		<td colspan="11" bgcolor="808285" height="1"></td>
	</tr>
	<!-- 
	<tr class="ct_list_pop">
		<td align="center"><%=no--%></td>
		<td></td>
		<td align="left">
			<a href="/getProduct.do?prodNo=<%=vo.getTranNo() %>"><%= vo.getTranNo() %></a>
		</td>
		<td></td>
			<td align="left"><%= vo.getBuyer().getUserId() %></td>
		<td></td>
			<td align="left"><%= vo.getBuyer().getUserName() %>
		</td>
			<td align="left"><%= vo.getBuyer().getPhone() %>
		</td>
		</td>
			<td align="left"><%= vo.getTranCode() %>
		</td>
		</td>
			<td align="left"><%= vo.getTranCode() %>
		</td>
	</tr>
	<tr>
		<td colspan="11" bgcolor="D6D7D6" height="1"></td>
	</tr>
	 -->
	<% } %>
</table>

<table width="100%" border="0" cellspacing="0" cellpadding="0" style="margin-top: 10px;">
	<tr>
		<td align="center">
		<% for(int i=1; i<=totalPage; i++) {%>
			<a href="/listPurchase.do?page=<%=i%>"><%=i %></a>
		<%} %>
		</td>
	</tr>
</table>

<!--  ������ Navigator �� -->
</form>

</div>
</body>
</html>
<script>
	function fncGetProductList(){
		document.detailForm.submit();
	}
</script>
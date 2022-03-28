package com.model2.mvc.view.purchase;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.model2.mvc.common.Page;
import com.model2.mvc.common.Search;
import com.model2.mvc.framework.Action;
import com.model2.mvc.service.domain.Product;
import com.model2.mvc.service.domain.Purchase;
import com.model2.mvc.service.purchase.PurchaseService;
import com.model2.mvc.service.purchase.impl.PurchaseServiceImpl;

public class ListSaleAction extends Action {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		System.out.println("saleList����");
		Search search = new Search();
		String menu = request.getParameter("menu");
		
		int currentPage = 1;
		if(request.getParameter("currentPage") != null) {
			currentPage=Integer.parseInt(request.getParameter("currentPage"));
		}
		search.setCurrentPage(currentPage);
		//System.out.println(searchVO.getCurrentPage()+"PAGE��ˤ�������");
		
		
		// web.xml  meta-data �� ���� ��� ���� 
		int pageSize = Integer.parseInt( getServletContext().getInitParameter("pageSize"));
		int pageUnit  =  Integer.parseInt(getServletContext().getInitParameter("pageUnit"));
		search.setPageSize(pageSize);		
				
		Map<String, Object> map =(HashMap<String,Object>)request.getAttribute("map"); // product
		List<Product> nList = new ArrayList<Product>();					//product
		List<Product> pList= (List<Product>)request.getAttribute("list");
		
		String num = "";
		if(map !=null) {
			for(int i=0; i<pList.size(); i++) {				
				num += ","+pList.get(i).getProdNo();				
			}			
		}
		String sSearch = request.getParameter("searchKeyword")+num;
		
		search.setSearchCondition(request.getParameter("searchCondition"));
		search.setSearchKeyword(sSearch);		

		PurchaseService service = new PurchaseServiceImpl();
		Map<String,Object> pmap=service.getPurchaseList(search);//purchase
		
		List<Purchase> PurchaseList = (List<Purchase>)pmap.get("list");
		
		if(pmap !=null) {
			Product po = null;
			for(int i=0; i<pList.size(); i++) {
				po = pList.get(i);
				for(int j=0; j<PurchaseList.size(); j++) {
					if(po.getProdNo()==PurchaseList.get(j).getPurchaseProd().getProdNo()) {
						po.setProTranCode(PurchaseList.get(j).getTranCode());
					}
				}
				nList.add(po);
			}			
		}
		for (Product p12 : nList) {
			System.out.println(p12);
		}
		
		// Model View ����
		request.setAttribute("listp", nList);
//		request.setAttribute("search", search);
//		request.setAttribute("resultPage", resultPage);				
		
		return "forward:/product/listProduct.jsp";
	}

}

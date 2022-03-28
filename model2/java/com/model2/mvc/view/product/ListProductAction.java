package com.model2.mvc.view.product;

import java.util.ArrayList;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.model2.mvc.common.Page;
import com.model2.mvc.common.Search;
import com.model2.mvc.framework.Action;
import com.model2.mvc.service.domain.Product;
import com.model2.mvc.service.product.ProductService;
import com.model2.mvc.service.product.impl.ProductServiceImpl;

public class ListProductAction extends Action {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		Search search = new Search();
		
		int currentPage = 1;
		if(request.getParameter("currentPage") != null) {
			currentPage=Integer.parseInt(request.getParameter("currentPage"));
		}
		search.setCurrentPage(currentPage);
		//System.out.println(searchVO.getCurrentPage()+"PAGE��ˤ�������");
		
		search.setSearchCondition(request.getParameter("searchCondition"));
		search.setSearchKeyword(request.getParameter("searchKeyword"));
		
		// web.xml  meta-data �� ���� ��� ���� 
		int pageSize = Integer.parseInt( getServletContext().getInitParameter("pageSize"));
		int pageUnit  =  Integer.parseInt(getServletContext().getInitParameter("pageUnit"));
		search.setPageSize(pageSize);
		
		// ��������
		ProductService service = new ProductServiceImpl();
		Map<String,Object> map=service.getProductList(search);
		
		Page resultPage	= 
				new Page( currentPage, ((Integer)map.get("totalCount")).intValue(), pageUnit, pageSize);
		System.out.println("ListUserAction ::"+resultPage);
		ArrayList<Product> pList=(ArrayList<Product>)map.get("list");
		for (Product product : pList) {
			System.out.println(product);
		}
		// Model View ����
		request.setAttribute("list", map.get("list"));
		request.setAttribute("search", search);
		request.setAttribute("resultPage", resultPage);
				
		return "forward:/listSale.do";
	}

}

package com.model2.mvc.view.product;

import java.net.URLDecoder;
import java.net.URLEncoder;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.model2.mvc.framework.Action;
import com.model2.mvc.service.domain.Product;
import com.model2.mvc.service.product.ProductService;
import com.model2.mvc.service.product.impl.ProductServiceImpl;

public class GetProductAction extends Action {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		int prodNO=Integer.parseInt(request.getParameter("prodNo"));
		
		ProductService service = new ProductServiceImpl();
		Product vo=service.getProduct(prodNO);		
		request.setAttribute("vo", vo);
		
		Cookie[] cookies = request.getCookies();
		Cookie cookie =null;
		String history = null;		
		
		if(cookies!=null && cookies.length > 0) {
			for (int i = 0; i < cookies.length; i++) {
				
				cookie = cookies[i];
				if (cookie.getName().equals("history")) {
					history =URLDecoder.decode(cookie.getValue(), "euc_kr");
					System.out.println("getCOokie histpry"+history);
					Cookie nCookie = new Cookie("history",URLEncoder.encode(history+","+Integer.toString(vo.getProdNo()),"EUC_KR"));					
					nCookie.setMaxAge(-1);
					response.addCookie(nCookie);
				} else {
					cookie = new Cookie("history", URLEncoder.encode(Integer.toString(vo.getProdNo()),"EUC_KR"));
					cookie.setMaxAge(-1);
					response.addCookie(cookie);
				}
			}
		} 
		
		return "forward:/product/getProduct.jsp";
	}

}

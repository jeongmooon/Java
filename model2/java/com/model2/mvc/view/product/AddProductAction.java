package com.model2.mvc.view.product;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.model2.mvc.framework.Action;
import com.model2.mvc.service.domain.Product;
import com.model2.mvc.service.product.ProductService;
import com.model2.mvc.service.product.impl.ProductServiceImpl;
import com.model2.mvc.service.user.UserService;
import com.model2.mvc.service.user.impl.UserServiceImpl;

public class AddProductAction extends Action {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		Product product = new Product();
		product.setFileName(request.getParameter("fileName"));		
		product.setManuDate(request.getParameter("manuDate").replace("-",""));
		product.setPrice(Integer.parseInt(request.getParameter("price")));
		product.setProdDetail(request.getParameter("prodDetail"));
		product.setProdName(request.getParameter("prodName"));
			
		System.out.println(product);
		
		ProductService service=new ProductServiceImpl();
		service.addProduct(product);
				
		return "redirect:/listProduct.do";
	}

}

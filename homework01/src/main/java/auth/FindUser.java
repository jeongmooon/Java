package auth;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import auth.businessLogic.UserDAO;
import auth.businessLogic.UserVO;

public class FindUser extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("EUC_KR");
		response.setContentType("text/html;charset=UTF-8");
		
		String userId = request.getParameter("id");
		//유저 아이디 쿠키받아와야함 or jwt
		UserDAO userDao = new UserDAO();
		UserVO userVO = new UserVO();
		userVO=userDao.findUser(userId);
		System.out.println(userVO);
		
		String JavaScriptObjectN =null; //"{"+info+"}";
		PrintWriter out = response.getWriter();
		response.setContentType("application/json");
		response.setHeader("Access-Control-Allow-Origin","*");
		out.println(userVO);
		out.flush();
	}

}

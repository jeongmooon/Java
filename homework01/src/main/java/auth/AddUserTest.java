package auth;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import auth.businessLogic.UserDAO;
import auth.businessLogic.UserVO;

@WebServlet("/AddUserTest")
public class AddUserTest extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddUserTest() {
        super();
    }

	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		req.setCharacterEncoding("EUC_KR");
		res.setContentType("text/html;charset=EUC_KR");
		res.setContentType("application/json");
		res.setHeader("Access-Control-Allow-Origin","*");
		PrintWriter out = res.getWriter();
		
		System.out.println("AddUser Servlet start");
		Enumeration<String> parameterNames = req.getParameterNames();
		
		
		
		String email = req.getParameter("email");
		String password = req.getParameter("password");
		String name = req.getParameter("name");
		String job = req.getParameter("job");
		System.out.println(email);
		UserVO uVO = new UserVO();
		uVO.setPasswd(password);
		uVO.setId(email);
		uVO.setName(name);
		uVO.setJob(job);
		System.out.println(uVO);
		UserDAO uDAO = new UserDAO();
		uDAO.addUser(uVO);
		
		HttpSession session = req.getSession(true);
		if(uVO.isActive()) {
			session.setAttribute("test",uVO);
			out.flush();
		} else {
			res.setStatus(500);
		}
	}

}

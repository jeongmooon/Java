package auth;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import auth.businessLogic.UserDAO;
import auth.businessLogic.UserVO;

//@WebServlet("/AddUser")
public class AddUser extends HttpServlet {
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		req.setCharacterEncoding("EUC_KR");
		res.setContentType("text/html;charset=EUC_KR");		
		PrintWriter out = res.getWriter();
		
		System.out.println("AddUser Servlet start");
		Map<String, String> UM = new HashMap<String,String>();
		Enumeration<String> en = req.getParameterNames();
		
		while(en.hasMoreElements()){
			String name = en.nextElement();			
			
			if(name.equals("cal")) {
				String calin = "";
				String[] Cal = req.getParameterValues("cal");
				out.print("<li>선택한 "+name+" : ");				
				for(int i=0; i<Cal.length; i++) {
					if(i <Cal.length-1) {
					    calin+=Cal[i]+"/";
						out.print(Cal[i]+"-");
					} else {
						calin+=Cal[i];
						UM.put(name, calin);
						out.print(Cal[i]);
					}
				}
			} else if(name.equals("phone")) {
				String[] num = req.getParameterValues("phone");
	            out.print("<li>선택한 "+name+" : ");	
				String phonenum ="";
				for(int i=0;i<num.length;i++){
					if(i <num.length-1) {
						phonenum+=num[i]+"-";
					    out.print(num[i]+"-");
					} else {
						phonenum+=num[i];
						UM.put(name, phonenum);
						out.print(num[i]);
					}
				}				
			} else {
				String value = req.getParameter(name);
				UM.put(name, value);
				out.println("<li> "+name+" : "+value);
			}
		}
		
		UserVO userVO = new UserVO();
		userVO.setAll(UM);
		System.out.println(userVO);
		
		// session 생성 
		HttpSession session = req.getSession(true);		
		
		// DB접근 Data 검색 비교 UserVO.active true/false 변경
		UserDAO useDao = new UserDAO();
		useDao.addUser(userVO);
		
		out.println("<html>");
		out.println("<head></head>");
		out.println("<body>");
		
		out.println("<h2>Login 화면</h2>");
		
		if(userVO.isActive()) {
			out.println(userVO.getId()+"님 환영합니다.");
			// 세션 저장
			session.setAttribute("test",userVO);
		} else {
			out.println("Login 실패 id,pwd 확인하세요.");
		}
		
		out.println("<p><p><a href='/Homework01/auth/findUser?id="+userVO.getId()+"'>뒤로</a>");
		out.println("</body>");
		out.println("</html>");
		System.out.println("AddUser Servlet end");
	}

}

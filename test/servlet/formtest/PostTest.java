package formtest;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.*;
import javax.servlet.http.*;

public class PostTest extends HttpServlet{

	public void doPost(HttpServletRequest req,HttpServletResponse res) throws ServletException, IOException{
		
		req.setCharacterEncoding("EUC-KR");

		res.setContentType("text/html;charset=EUC-KR");
		PrintWriter out = res.getWriter();		
		
		out.println("<html>");                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          
		out.println("<head><title>"+req.getParameter("name")+"�� ����</title></head>");
		out.println("<body>");
		
		Enumeration<String> en = req.getParameterNames();	
		
		out.println("<h2>"+req.getParameter("name")+"�� ����</h2>");
		
		while(en.hasMoreElements()){
			String name = en.nextElement();
			if(name.equals("cal")) {
				String[] Cal = req.getParameterValues("cal");
				out.println("<li>������ "+name+" : ");
				for(int i=0; i<Cal.length; i++) {
					if(i <Cal.length-1) {
					    out.print(Cal[i]+"-");
					} else {
						out.print(Cal[i]);
					}
				}
			} else if(name.equals("phone")) {
				String[] num = req.getParameterValues("phone");
	            out.print("<li>������ "+name+" : ");	
				
				for(int i=0;i<num.length;i++){
					if(i <num.length-1) {
					    out.print(num[i]+"-");
					} else {
						out.print(num[i]);
					}
				}				
			} else {
				String value = req.getParameter(name);		
				out.println("<li> "+name+" : "+value);
			}
		}
		
		out.println("<p></p><a href='/HomePJ'>�ڷ�</a>");
		
		out.println("</body>");
		out.println("</html>");

	}
	
}
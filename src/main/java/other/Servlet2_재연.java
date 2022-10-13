package other;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/4502")
public class Servlet2_재연 extends HttpServlet {
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		 String name = req.getParameter("id");
		 req.setCharacterEncoding("UTF-8"); //한글 받기
		 resp.setCharacterEncoding("UTF-8"); //한글 보내기
		 resp.setContentType("text/html;charset=utf-8");
		 PrintWriter out  =resp.getWriter();		 
		 
		 out.println("<html>");
		 out.println("<head>");
		 out.println("<style>");
		 out.println(" li { list-style:none;}");		 
		 out.println("</style>");
		 out.println("</head>");
		 out.println("<body>");
		 out.println( name + " 잠시만 기다려 주세요.");
		 out.println("<ui>");
		 out.println("<li>");
		 out.println("<label>");
		 out.println("진행률 70%");
		 out.println("</label>");
		 out.println("<progress value=\"70\" max=\"100\">");
		 out.println("</progress>");
		 out.println("<label>");
		 out.println("진행률 30%");
		 out.println("</label>");
		 out.println("<progress value=\"30\" max=\"100\">");
		 out.println("</progress>");
		 out.println("</li>");
		 out.println("</ui>");
		 out.println("</body>");
		 out.println("</html>");		 
		 
		
	}	
}

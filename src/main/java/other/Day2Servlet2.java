package other;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/d2s2")
public class Day2Servlet2 extends HttpServlet{
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String id = request.getParameter("id");
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		
		out.println("<html>");
		out.println("<head>");
		out.println("<style>");
		out.println("*{color: green; text-decoration: none; padding: 10px 10px;}");
		out.println("</style>");
		out.println("</head>");
		out.println("<body>");
		out.println("<a href='http://www.naver.com'>");
		out.println("네이버");
		out.println("</a>");
		out.println("</body>");
		out.println("</html>");
		
	}
}

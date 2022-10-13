package other;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/s210121")
public class Servelt2연습 extends HttpServlet {

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String id = request.getParameter("id");
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		
		out.println("<html>");
		out.println("<head>");
		out.println("<style>");
		out.println("ul, li{padding: 0px;");
		out.println("margin: 0px;}");
		out.println("ul{ list-style:none;}");
		out.println(" .menu_item ul{display: none;}");
		out.println(" .menu_item:hover ul{ display: block;}");
		out.println(".menu_wrap{display: flex;}");
		out.println("  .menu_item{width: 100px;}");
		out.println("strong{color:blue;}");
		out.println("</style");
		out.println("</head>");
		out.println("<body>");
		out.println("<ul class=\"menu_wrap\">");
		out.println("<strong>"+id+"</strong>");
		out.println("<li class=\"menu_item\">hi");
		out.println("<ul>");
		out.println("<li>오늘</li>");
		out.println("<li><점심</li>");
		out.println("<li> <a href=\"https://www.google.com/maps/search/%ED%99%8D%EB%8C%80%EB%A7%9B%EC%A7%91/data=!3m1!4b1\">뭐먹지</a></li>");
		out.println("</ul>");
		out.println("</li>");
		out.println("</ul>");
		out.println("</body>");
		out.println("</html>");
		
	}
}

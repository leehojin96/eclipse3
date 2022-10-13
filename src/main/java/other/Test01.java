package other;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Test01")
public class Test01 extends HttpServlet {

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String test = request.getParameter("test");
		
		
		response.setContentType("text/html;charset=utf-8");
		
		PrintWriter out = response.getWriter();
		
		out.println("<html>");
		out.println("<head>");
		out.println("<style>");
		
		out.println(".wrap{width:800px; margin:0px auto; text-align:center; top-margin:50px;}");
		out.println(".box{width:100px; height:150px; border:1px solid black; top-margin:50px; margin:0px auto; background-image:https://store.storeimages.cdn-apple.com/8756/as-images.apple.com/is/MQGJ3ref_VW_34FR+watch-45-alum-silver-nc-8s_VW_34FR_WF_CO_GEO_KR?wid=1400&hei=1400&trim=1%2C0&fmt=p-jpg&qlt=95&.v=1660778416396%2C1661969952914; background-position:center; background-size:cover;}");
		
		out.println("</style");
		
		out.println("<body>");
		
		out.println("<div class=wrap>");
		out.println("<div class=box>");
		out.println("</div>");
		out.println("<h2> Watch8 </h2>");
		out.println("<p> ~599,000 부터 </p>");
		out.println("</div>");
		out.println("</body>");
		out.println("</html>");
	}
}

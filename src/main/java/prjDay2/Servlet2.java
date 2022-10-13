package prjDay2;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/s21012")
public class Servlet2 extends HttpServlet{

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		
		int[] arr = new int[7];
		for(int i = 0 ; i < arr.length ; i ++) {
			arr[i] = (int)(Math.random()*45 +1);
		}
		
		out.println("<html>");
		out.println("<head>");
		out.println("<style>");
		out.println("</style>");
		out.println("<body>");
		out.println("<button> 번호 생성 </button>");
		out.println("</body>");
		out.println("</html>");
		
	}
}

package question;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/question05")
public class Question05 extends HttpServlet {
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		req.setCharacterEncoding("UTF-8");
		resp.setCharacterEncoding("UTF-8");
		resp.setContentType("text/html;charset=utf-8");
		PrintWriter out = resp.getWriter();

//		문제5)  전체구구단을 출력하는 프로그램을 작성하시오     (10점)
		
		for(int i = 1 ; i <= 9 ; i++) {
			for(int j = 1 ; j <= 9 ; j++) {
				out.print(j+" + " +i+" =	"+j*i+"	|	");
			}
			out.print("<br>");
		}
		
	}
}
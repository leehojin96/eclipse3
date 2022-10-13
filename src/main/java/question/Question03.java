package question;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/question03")
public class Question03 extends HttpServlet {
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		req.setCharacterEncoding("UTF-8");
		resp.setCharacterEncoding("UTF-8");
		resp.setContentType("text/html;charset=utf-8");
		PrintWriter out = resp.getWriter();
	    
//		문제3)  사칙연산을 하는 클래스를 작성하였다.  (MyCalculator)
//		       static 매서드로 두 수를 입력받아 곱한 결과를 반환하는 매서드를 작성하고 
//		       매서드를 이용해서 두 수를 곱한 결과를 모니터에 출력하시오          (10점)
		out.print(mul(5,3));
		
	}
	
	static int mul(int i,int j) {
		int mul;
		mul = i * j;
		return mul;
	}
	
}
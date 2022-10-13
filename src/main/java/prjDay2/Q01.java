package prjDay2;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Q01")
public class Q01 extends HttpServlet {
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		request.setCharacterEncoding("UTF-8");
		 response.setCharacterEncoding("utf-8");
		 response.setContentType("text/html;charset=utf-8");
		 
		 System.out.println("start");	
		
		String su1_ = request.getParameter("su1");
		String su2_ = request.getParameter("su2");
		String op = request.getParameter("op");
		
		int su1=0;
		int su2=0;
		
		 if( su1_ != null && su2_ != null  &&  op != null) {
			su1 = Integer.parseInt(su1_);
			su2 = Integer.parseInt(su2_);			
		}
		
		int result = 0;
		switch(op){
			case "add" :
				result = su1+su2;
				break;
			case "sub" :
				result = su1-su2;
				break;
			case "mul" :
				result = su1*su2;
				break;
			case "div" :
				result = su1/su2;
				break;
			default:
				result=0;
		}
		
		//출력
		System.out.println( result);
		PrintWriter out  =response.getWriter();			
		out.println(result);	
		
		
	}
}

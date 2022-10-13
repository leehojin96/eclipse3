package prjDay2;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;


@WebServlet("/ex4")
public class Ex04  extends HttpServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		//score의 자료형 한 학생 성적 처링하기 위한 객체 
		//입력 받을 것은 이름, 국어점수, 영어 점수
		
		//한글화
		res.setCharacterEncoding("UTF-8");
		res.setContentType("text/html;charset=utf-8");
		
		PrintWriter out = res.getWriter();
		
		try {
		// 입력 받기
			String name = req.getParameter("name");
			String kor_ = req.getParameter("kor");
			int kor = Integer.parseInt(kor_);
			String eng_ = req.getParameter("eng");
			int eng = Integer.parseInt(eng_);
			
			//Score 자료형 생성
			Score student = new Score(name,kor,eng);		
			student.avg();
			String info  = student.getPritInfo2();
			System.out.println( info);   // 콘솔에 출력
			
			//out.println( info);     // client 응답
			 		
			//html에 출력
			out.println(student.getPritInfo1());	 
			out.println(student.getPritInfo2());
			out.println( student);
		 
		}catch(NumberFormatException a) {
			out.println("빠빰 입력 바람 빠빰");
		}
		
	}
}

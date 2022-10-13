package other;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Servlet21")
public class Servlet21 extends HttpServlet {

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		
		out.println("<html>");
		out.println("<head>");
		out.println("<style>");
		out.println("h1{text-align:center;}");
		out.println(".wrap{width:300px; margin:30px auto; border:1px solid black; padding:30px;}");
		out.println(".img{width:250px; height:250px; margin:30px auto; border:1px solid black; background-size:cover; background-position:center; background-img:url(data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAT4AAACfCAMAAABX0UX9AAABEVBMVEX////HlHIAAADKlnTGkm/EjWjFkGzJlXNnOxvu4dn8/PzDjGZISEjGkm7y8vLv7u/m5ubLnX/27+vW1tbLy8tvb2/Oo4fQp43r2tHm0sbJmXngxra0tLTe3t6QkJC9vb3cvqxeRjZ1V0NeLABbW1vVsJlRUVGEhIQ9PT02NjbAhFpNAABiMwvRxr/r5uLn1MmjeV20hmcVDwxBMCVMOSuOaVEvIxt1UTtaIwAqKirVzcmdnZ1ra2sQEBCVfXCqmI5TFACNcmSTd2O0oZWIWThtQyPAsqmnd1ZZQjOWb1YjGhSCY1ExEgC2hWM1IhV/UjRvUj9VLhCrkICNZEh1ZFkdHR1HLx6BeHIaJy1XOCCGhoYeLoOCAAAI1UlEQVR4nO2de1/iSBaGk6okaAEBuYjIVRFQGxRExG60dbunGS/jjnPp7V2//wfZShFCLhWlYJogOc9fSIBf5fU9deoeSQIAAAAAAACAoDgpRLeDLsM7JR/N1aOaHN0MuiDvkVRUlZW4TIkWQEBRUqpsoR0HXZr3Rj0q2zkW9x8hP6FY74S6KjtRjwtCP3Dy+cPnn1S2laegarIHoQxyc9tqhVa+XcWrHg1g16dItVCopnghetKqbbQu28so6gpS53jPiN+87TNkp3qsUdTjqvcHbmqt2r9KyyruipHieo/mX5t8+rEan7yfmr59MvZi6ltoxZOkKt98tPabfIJUbXlZ2bb0S/2VajMB2yHOuls+7pPVTVOVLYfAWtX84qc/ifTlJKhirwg77jaLTb9oriq51aOYkukn0smXEPuOsekvH41UNefVV6vqTLRP7a/9sKZbix2/qs8UMOq5rmwnEoZ+7a/tsIeulHpdPT4nuh50uVcEn0bfq8Tr6QTox8jP475fvpUSYc8ZY17NHD7gp9oIwpcxl3y/1togH2Me+ZRvN4kERK/BHPJFnto6yDdmUzx1KDlDPZCPUY+/LZgT9ZQY8gVd8NVAOHqVXSIRAuYbIxy90fzbPxoicmL2U3LgOzvk1DHghykyjvibL/X2T4aLLbt6nb39brfTZfpxVFR2gi7tqpG3Ry/unyHKBTb+6MjYpZ5WD7q0KwZxD/gpnce9/Y6hWxf1ui4DgnouXMszzNqPuQ4/orO+Q9mtoEu7avCHSyOTirCHHm3xq0GbxQnJ8ebZMLMge9Fx1Hwgn5O8J3Sp9ajpeufPzHYRZ923C60WB9xJ3j5idN1pFxKvC8KRD+8jk66n2aedBl3ilYIzXoA7E/XQvtd+KkSvjTondu8s+c698kGP1453eRDuWuqhPa98sO7eBqfZMq35uO6DtosNzhw57Wm8Kp8Cuddi22W+CG0s30/le+TIFwf5JribLZHufmfS6KM80E6HJ7gV2LNlse2Wr4fOp3VfB8vnnuwBowYWnmmOiHyPzizzYZpG7j0DfmL7PdaZlKdmi2ArdntdjC96ntoP3DfFnTrk8RgVdd75fbe/10Mdr3xQ91nw1jVjubOHzqh06OHOE7ognx1v9LIAxt29h7vHLn3lvQrBa8NnT4cxVekzV6nBTJsNv00dvvO80Oe1s8MZbX4Na08MwPDdU8RHBfM5ELOfsht0eVeNqoj9FBhsdkL2BRaowUyRCzKo/TK7ehC6DvT2oLXxxGkc+3gPQtfB4+VG69dZ1ZN3IevaIdR6s3vPsJ8Co1Vj9Iw0qrU2vomoR4nDcJ/BEKGz3zbEvGc6cAtCeMgGRP/9u7h6xgbz3ZDPlJOP1mTGPChqNdQCHvgvIpgNLRpeAYuT2YwzzmDyzAKGNIIngbtA8DKUcOp3MFXvQmysCvSTpE+HZuCeP/f9h5RnIoTbi0a3fzyM5eviBSI3pPYb3W5sXN4Uv6MfT4s5b6xfLuj7WSqjDzWq3oi93tlVF6r5ZGMh5Z8B39AyITeXtJd2O5r8vbCA+A4Ng7yhpUIG1Hqtgb262uEfujkrF7QKvQ7JcSSjD9R6tYGrsuduKZqR7rWRgkLhPxa4tcuR6+1NwUleO1hhKfwgkPtZLixwL2887YyC4DEGiqaZRxRHsHKOQiIfG1X2WE8Sl49s5k/zhoCR8TI2hI5C0PT7XOOrx1ve9xrqeHVQQY0/W0tQ08u9lSDQb2uDT7wLoplDM7tpOwOr3xyGA4fbN9z2hXDmUK3FaQ1TvRBUfb7McX6Q9V1z5KEYYPGDRvzwtKhlv3QDHZRioYhdP8Tli1etL5OiLpFMcIUPnjmO7oMVVlP0rbf1cqHCymaLedwH6+otQL6FmOfUV4jeKXOMV8G2jilzyAfRO2Wu0VJoukwQHHFhwMYOC/Ezh0E+G/OkXtiVZTHXefWQOyaAfAsx10wbVH4TeMfPgXyzAy2XhcgLVn5Y6WKQz0LsKWMRef/hog/yTRGKXsWYGj97AvksROTD49Ot/gL5LATkm5xpOgihfEOfOTER+cZrgi7CGLwvKMl9n3f0q4965pmmnVCmjix/OcXs3Tb8zNTr43gon4p6xV1PIdDrvWCn0uGQ9nl17oKKmeUzE8c9DuvJuQce+5USlb9nrfvGB+r25IgW0sH69KHrjQxCR3ez7o7Bd6b5Jie5pNd6XWlakioNIpVsC/sc9mu+NBEqX509zSif/MCO0o3EDfMlmrFDVGa/k8w2l3pfy4GgAyKVP0pp28aBjM1+GcNL5QxKz9jwG1d951itG+Kho0qpxNzXRFnaIiLp4jC7Vm5MNK6LUjkmmYuPiZQtJadtP6ZeqUKzif+IH9aeFPOiouA9Frs0dNMvVLGJVFcolqAGNNZKHvAblu+WISpKV5UmtV+ymD1qoDQ5ujIvMfWSJSMXn/qk3gh++luvb2kRLap2c1uasRb8Qakmsh+z1rM9M0eIdmYqCDXKyfV74GcCFRMojQhts8S+o8ZQRxXzyiFb062zW+bbL5L7D9tz8OO3H6kUGkpf2MkbX8uOXUQxau3kFWqs6SJJql+2bGiWkHQjtCYPNaV+SVtu4cun/Pc7u8oWL18fSuVxjy1m/QdofZCl3qM+Li/zlpZKEpVQwuONEiradmNwe734f1djqVmFphNTvkz2YJogkigrkSOjAihlG43YhIq0PlzFODsSSo6tLNzZNq3t+k7ZcF7TsRQ8SVss5CVt/DsQus6OaazVJsvE97fzofcpgbIcdX/oBTWk4VWTr8xLOmldSCaTa9SCmcUJnEe1eeTT10mUfxbifT60Rz7gFTZV11KrEJ4xsgibuagjAatwSp8YVEBtMvoSweEcEl0IUugqePxo3kHQZXmHZGLo4u65f3/f74Vhk/M/CxVvyjoO4f1EMkPbqXSx5jr1u34+du3QIWgngsN4hxUCnQsBMkOb8Y500E6ItF08iFpRDkG8RSiBeAtBJJo4oKEyPwRyLQAAAAAAAAAAAACsFv8HWz6qxQ/OopcAAAAASUVORK5CYII=);}");
		out.println(".login{width:280px; margin:10px auto;}");
		out.println("input{display:block; width:280px; height:40px; margin-bottom:7px;}");
		out.println("button{display:block; width:280px; height:40px; background-color:skyblue; color:white; border-color:skyblue;}");
		out.println("</style>");
		
		out.println("<body>");
		out.println("<h1>");
		out.println("로그인화면");
		out.println("</h1>");
		out.println("<div class='wrap'>");
		
		out.println("<div class='img'>");
		out.println("</div>");
		
		out.println("<div class='login'>");
		
		out.println("<input type='text' placeholder='ID'>");
		out.println("</input>");
		out.println("<input type='password' placeholder='PW'>");
		out.println("</input>");
		out.println("<button>");
		out.println("로그인");
		out.println("</button>");
		out.println("</div>");
		
		out.println("</div>");
		out.println("</body>");
		out.println("</html>");
	}
}

package sec02.ex01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CalcServlet
 */
@WebServlet("/calc")
public class CalcServlet extends HttpServlet {
	private static float USD_RATE = 1124.70F;
	private static float JPY_RATE = 10.113F;
	private static float CNY_RATE = 163.30F;
	private static float GBP_RATE = 1444.35F;
	private static float EUR_RATE = 1295.97F;
	
	public void init(ServletConfig config) throws ServletException {
	}

	public void destroy() {
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UFT-8");
		response.setContentType("text/html; charset=UTF-8"); 
		PrintWriter pw = response.getWriter();
		String command = request.getParameter("command");
		String won = request.getParameter("won");
		String operator = request.getParameter("operator");
		
		if (command != null && command.equals("calculate")) {
			String result = 
		}
	}
	
	private static String calculate(float won, String operater) {
		String result = null;
		if(operater.equals("dollar")) {
			result = String.format("%.6f", won / USD_RATE);
		} else if (operater.equals("en")) {
			result = String.format("%.6f", won / JPY_RATE);
		} else if (operater.equals("wian")) {
			result = String.format("%.6f", won / CNY_RATE);
		} else if (operater.equals("pound")) {
			result = String.format("%.6f", won / GBP_RATE);
		} else if (operater.equals("euro"))
			result = String.format("%.6f", won / EUR_RATE);
		return result;
	}

}
package sec04.ex01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/loginTest2")
public class LoginTest2 extends HttpServlet {
	public void init(ServletConfig config) throws ServletException {
		System.out.println("init �޼ҵ� ȣ��");
	}

	public void destroy() {
		System.out.println("destroy �޼ҵ� ȣ��");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		String id = request.getParameter("user_id");
		String pw = request.getParameter("user_pw");
		
		System.out.println("���̵� : " + id);
		System.out.println("��й�ȣ : " + pw);
		if (id!=null && (id.length()!=0)) {
			if (id.equals("admin")) {
				out.print("<html>");
				out.print("<body>");
				out.print("<font size='12'>������ �������� �Է��ϼ̽��ϴ�.</font>");
				out.print("<br>");
				out.print("<input type='button' value='ȸ������ �����ϱ�'>");
				out.print("<input type='button' value='ȸ������ �����ϱ�'>");
				out.print("</body>");
				out.print("</html>");
			}
			else {
				out.print("<html>");
				out.print("<body>");
				out.print(id + "�� �ݰ����ϴ�.");
				out.print("</body>");
				out.print("</html>");
			}
		}
		else {
			out.print("<html>");
			out.print("<body>");
			out.print("id�� ��й�ȣ�� �Է��ϼ���~");
			out.print("<a href='http://localhost:8090/pro06/test01/login.html'>�α��� â���� �̵�</a>");
			out.print("</body>");
			out.print("</html>");
		}
	}

}

package com.test.ajax;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Test02 extends HttpServlet
{
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		doGetPost(request, response);
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		doGetPost(request, response);
	}
	
	// ����� ���� �޼ҵ�
	protected void doGetPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		// ���� ���� �ڵ�
	      
	      // ������ ����(AjaxTest02.jsp �������κ��� �Ѿ�� ������)
	      int n1 = Integer.parseInt(request.getParameter("n1"));
	      int n2 = Integer.parseInt(request.getParameter("n2"));
	      
	      // ���� ó��(���� ó��)
	      int result = n1 + n2;
	      
	      //��ȯ�� ����� �غ�
	      request.setAttribute("result", result);
	      
	      RequestDispatcher dispatcher = request.getRequestDispatcher("Test02OK.jsp");
	      dispatcher.forward(request, response);
		
	}
}
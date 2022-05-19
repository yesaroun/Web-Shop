/*==================
	Test03.java
===================*/

package com.test.ajax;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Test03 extends HttpServlet
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
	
	protected void doGetPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		// ������ ����
		String id = request.getParameter("id");
		
		// id �� hch �� ���
		// Model �� DB �׼� ó�� ��û �� DAO(ó�� ��û)
		//						  ----------------
		//                        DTO, Connection Ȱ��
		//
		// �� SELECT COUNT(*) AS COUNT FROM MEMBER WHERE ID = 'hch';
		//           ------------------
		//               ���� ó��
		//					->   1 or 0
		
		// �� DB ������ ������ ���� �ʾұ� ������ �÷��� �ڷᱸ���� �����.
		ArrayList<String> db = new ArrayList<String>();
		db.add("superman");
		db.add("batman");
		db.add("admin");
		
		int result = 0;
		
		for(String item : db)
		{
			if(item.equals(id))
			{
				result = 1;
			}
		}
		
		// ���� result �� 1 �� ����������... �̹� �����ϴ� id   -> ��� �Ұ�
		// 1�� �ٲ��� �ʰ� 0 �� ��� ����������... �������� �ʴ� id �� ��� ����
		
		// �� ���� result ���� �����ֱ� ���� ���� �����͸� View �� �ѱ��.
		request.setAttribute("result", result);
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("Test03OK.jsp");
		dispatcher.forward(request, response);
	}
}
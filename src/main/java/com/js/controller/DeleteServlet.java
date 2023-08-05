package com.js.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.js.dao.ProductCRUD;
@WebServlet("/delete")
public class DeleteServlet  extends HttpServlet{
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
	int id=Integer.parseInt(req.getParameter("id"));
	System.out.println(id);
	ProductCRUD pc=new ProductCRUD();
	int res= (int) pc.deleteByproductId(id);
	if(res>0) {
		RequestDispatcher rd=req.getRequestDispatcher("view");
		rd.forward(req,resp);
	}
	else {
		RequestDispatcher rd=req.getRequestDispatcher("result.jsp");
		req.setAttribute("msg", "Failed to delete PRODUCT");
		rd.forward(req,resp);
	}
	}
}


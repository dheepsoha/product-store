package com.js.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.js.dao.ProductCRUD;
@WebServlet("/brand")
public class DeleteBybrand extends HttpServlet{
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		String brand=req.getParameter("brand");
		ProductCRUD pc= new ProductCRUD();
		int res1=pc.deleteProductByBrand(brand);
		if(res1>0) {
			RequestDispatcher rd=req.getRequestDispatcher("view");
			rd.forward(req, res);
		}else {
			RequestDispatcher rd=req.getRequestDispatcher("result.jsp");
			req.setAttribute("msg", "failed to deleteProduct");
			rd.forward(req, res);
		}
	}
}

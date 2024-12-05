package com.my;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/register")
public class Register extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name = req.getParameter("uname");
		String email = req.getParameter("uemail");
		String password = req.getParameter("upassword");

		Connection conn = ConnectionPool.giveConnection();
		String sql = "insert into customer values(?,?,?)";
		try {
			PreparedStatement pstm = conn.prepareStatement(sql);
			pstm.setString(1, name);
			pstm.setString(2, email);
			pstm.setString(3, password);

			int update = pstm.executeUpdate();

			if (update > 0) {
				req.setAttribute("msg", "Registred Successfully");
				RequestDispatcher rd = req.getRequestDispatcher("login.jsp");
				rd.forward(req, resp);
			} else {
				req.setAttribute("msg", "Already registred");
				RequestDispatcher rd = req.getRequestDispatcher("register.jsp");
				rd.forward(req, resp);
			}
			ConnectionPool.submitConnection(conn);

		} catch (SQLException e) {
			req.setAttribute("msg", "Already registred");
			RequestDispatcher rd = req.getRequestDispatcher("register.jsp");
			rd.forward(req, resp);
			e.printStackTrace();

		}
	}

}

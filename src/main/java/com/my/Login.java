package com.my;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class Login extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String email = req.getParameter("uemail");
		String password = req.getParameter("upassword");

		Connection conn = ConnectionPool.giveConnection();

		String sql = "select * from customer where email=?";

		try {
			PreparedStatement pstm = conn.prepareStatement(sql);

			pstm.setString(1, email);

			ResultSet rs = pstm.executeQuery();

			if (rs.next()) {
				String pwd = rs.getString(3);
				if (pwd.equals(password)) {
					resp.sendRedirect("https://www.flipkart.com/");
				} else {
					req.setAttribute("msg", "Wrong password");
					RequestDispatcher rd = req.getRequestDispatcher("login.jsp");
					rd.forward(req, resp);

				}

			} else {
				req.setAttribute("msg", "Not registred");
				RequestDispatcher rd = req.getRequestDispatcher("register.jsp");
				rd.forward(req, resp);
			}

		} catch (SQLException e) {
			req.setAttribute("msg", "something went wrong, try after some time");
			RequestDispatcher rd = req.getRequestDispatcher("login.jsp");
			rd.forward(req, resp);

			e.printStackTrace();
		}
	}
}

package com.example;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;
import java.io.IOException;

@WebServlet("/secure/dashboard")
public class DashboardServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request,
                         HttpServletResponse response)
                         throws IOException {

        HttpSession session = request.getSession(false);
        String user = (String) session.getAttribute("user");

        response.getWriter().println("Welcome " + user);
    }
}

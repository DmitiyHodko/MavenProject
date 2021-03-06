package test;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class Servlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html; charset = UTF-8");
        resp.setCharacterEncoding("UTF-8");

        req.setAttribute("hello", "Hello centSOSI");
        getServletContext().getRequestDispatcher("/jsp/hello.jsp").forward(req, resp);

    }

}

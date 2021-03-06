package pl.coderslab.controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/")
public class IndexServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        SolutionDao solutionDao = new SolutionDao;

        int n = Integer.parseInt(getServletContext().getInitParameter("number-solutions"));
        List<Solution> recent = solutionDao.findRecent(n);

        req.setAttribute("recent", recent);

        getServletContext()
                .getRequestDispatcher("/index1.jsp")
                .forward(req, resp);
    }
}

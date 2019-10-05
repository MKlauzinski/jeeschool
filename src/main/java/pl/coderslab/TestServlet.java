package pl.coderslab;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/test")
public class TestServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        UserGroup userGroup = new UserGroup("group");

        UserGroupDao dao = new UserGroupDao();
        dao.create(userGroup);

        List<UserGroup> all = dao.findAll();
        resp.getWriter().println(all);
    }
}

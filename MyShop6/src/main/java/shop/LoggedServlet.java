package shop;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;

public class LoggedServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("post",Db.postsList);
        request.setAttribute("user",Db.usersList);
     request.getRequestDispatcher("/WEB-INF/pages/logged.jsp").forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}

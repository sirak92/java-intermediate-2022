package shop;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;

public class SingUp extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
     request.getRequestDispatcher("/WEB-INF/pages/signup.jsp").forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String name = request.getParameter("name");
        Db.usersList.add(new User(username,password, name));
        response.sendRedirect("/login");
    }
}

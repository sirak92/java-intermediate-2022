package shop;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;

public class LoginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       request.getRequestDispatcher("WEB-INF/pages/login.jsp").forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String userName = request.getParameter("userName");
        String password = request.getParameter("password");
        String name = request.getParameter("name");

        User user = new User(userName, password, name);

        if(Db.usersList.contains(user)){
            request.getSession().setAttribute("user",user);
            response.sendRedirect("/loggedIn");
        } else {

            response.sendRedirect("/login?error");
        }


    }
}

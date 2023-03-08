package shop;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;

public class HomeServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        request.setAttribute("post",Db.postsList);
       request.getRequestDispatcher("/WEB-INF/pages/home.jsp").forward(request,response);




    }


}

package shop;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

public class MyAccount extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        User user = ((User) request.getSession().getAttribute("user"));
        int userID = user.getUserID();
        List<Post> ownList = Db.postsList
                .stream()
                .filter(c -> c.getUserId() == userID).collect(Collectors.toList());


        request.setAttribute("post", ownList);
        request.getRequestDispatcher("/WEB-INF/pages/account.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}

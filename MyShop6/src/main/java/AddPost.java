import shop.Db;
import shop.Post;
import shop.User;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;

public class AddPost extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/WEB-INF/pages/addPost.jsp").forward(request, response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String title = request.getParameter("title");
        String imgUrl = request.getParameter("imgUrl");
        User user = ((User) request.getSession().getAttribute("user"));
        int userID = user.getUserID();
        Db.postsList.add(new Post(userID,title,imgUrl));

        response.sendRedirect("/account");
    }
}

import shop.Db;
import shop.User;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

public class AuthenticationFilter implements Filter {
    public void init(FilterConfig config) throws ServletException {
    }

    public void destroy() {
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws ServletException, IOException {
        HttpSession session = ((HttpServletRequest) request).getSession();
        User user = ((User) session.getAttribute("user"));


        if(user == null){
            ((HttpServletResponse) response).sendRedirect("/login");

        } else {

            chain.doFilter(request, response);
        }




    }
}

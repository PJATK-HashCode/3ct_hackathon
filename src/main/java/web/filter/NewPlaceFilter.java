package web.filter;


import model.user.User;
import web.SessionKey;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
;

/**
 * @author Lelental on 27.05.2017.
 */
@WebFilter(urlPatterns = "AddNewPlace.jsp")
public class NewPlaceFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest httpServletRequest = (HttpServletRequest) servletRequest;
        HttpSession session = httpServletRequest.getSession();
        User user = (User) session.getAttribute(SessionKey.login);
        if (user == null && user.getLevel() == 0) {
            ((HttpServletResponse) servletResponse).sendRedirect("/index.jsp");
        }else{
            filterChain.doFilter(servletRequest,servletResponse);
        }

    }

    @Override
    public void destroy() {

    }
}

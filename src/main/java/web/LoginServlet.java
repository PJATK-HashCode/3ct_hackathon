package web;

import dao.service.RepositoryService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * @author Lelental on 27.05.2017.
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String nick = req.getParameter("nick");
        RepositoryService repositoryService = new RepositoryService();
        //TODO Uwierzytelnianie
        if (repositoryService.users().withNick(nick) != null) {
            HttpSession session = req.getSession();
            session.setAttribute(SessionKey.login, repositoryService.users().withNick(nick));
            resp.sendRedirect("/place.jsp");
        } else {
            resp.getWriter().println("Zjebałes, nie elo");
        }
    }
}

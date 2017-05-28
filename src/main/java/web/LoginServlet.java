package web;

import dao.service.RepositoryService;
import model.user.User;
import org.apache.commons.codec.digest.DigestUtils;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.util.Objects;



@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String nick = req.getParameter("nick");
        String password = req.getParameter("password");
        RepositoryService repositoryService = new RepositoryService();
        User user = repositoryService.users().withNick(nick);

        if (user != null && Objects.equals(user.getPassword(), DigestUtils.sha1Hex(password))) {
            HttpSession session = req.getSession();
            session.setAttribute(SessionKey.login, repositoryService.users().withNick(nick));
            resp.sendRedirect("place.html");
        } else {
            resp.getWriter().println("Zjebałes, nie elo");
        }

    }
}

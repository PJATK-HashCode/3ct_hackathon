package web;

import dao.service.RepositoryService;
import model.user.User;
import security.Encryptor;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.security.NoSuchAlgorithmException;

/**
 * @author Lelental on 27.05.2017.
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String nick = req.getParameter("nick");
        String password= req.getParameter("password");
        RepositoryService repositoryService = new RepositoryService();
        //TODO Uwierzytelnianie
        User user = repositoryService.users().withNick(nick);
        try {
            if (user != null && user.getPassword() == Encryptor.get_SHA_256_SecurePassword(password,Encryptor.getSalt())) {
                HttpSession session = req.getSession();
                session.setAttribute(SessionKey.login, repositoryService.users().withNick(nick));
                resp.sendRedirect("/place.jsp");
            } else {
                resp.getWriter().println("Zjebałes, nie elo");
            }
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
    }
}

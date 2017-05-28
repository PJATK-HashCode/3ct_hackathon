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
import javax.transaction.Transactional;
import java.io.IOException;
import java.util.List;

/**
 * @author Lelental on 27.05.2017.
 */
@WebServlet("/RegisterServlet")
@Transactional
public class RegisterServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;
    private RepositoryService repositoryService = new RepositoryService();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession();
        User user = (User) session.getAttribute("user");
        List<User> users = repositoryService.users().getAll("User");
        if (users.isEmpty()) {
            addUser(user, resp);
        }
        if (repositoryService.users().withNick(user.getNickname()) != null) {
            resp.getWriter().write("Podana nazwa juz jest zajeta");
        } else {
            addUser(user, resp);
        }

    }

    private void addUser(User user, HttpServletResponse resp) throws IOException {
        String pass = user.getPassword();
        user.setPassword(DigestUtils.sha1Hex(pass));
        repositoryService.users().add(user);
        resp.sendRedirect("index.jsp");
    }
}

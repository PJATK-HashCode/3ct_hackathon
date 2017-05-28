package web;

import dao.service.RepositoryService;
import daoSzeryfa.hdao.impl.UserDao;
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

        User user = new User();
        user.setName(req.getParameter("firstName"));
        user.setSurname(req.getParameter("lastName"));
        user.setNickname(req.getParameter("nick"));
        user.setPassword(req.getParameter("password"));
        user.setEmail(req.getParameter("email"));
        user.setPhoneNumber(req.getParameter("phone"));

        String pass = user.getPassword();
        user.setPassword(DigestUtils.sha1Hex(pass));

        UserDao userDao = new UserDao();
        userDao.create(user);

        resp.sendRedirect("index.jsp");

    }

    private void addUser(User user, HttpServletResponse resp) throws IOException {
       /* String pass = user.getPassword();
        user.setPassword(DigestUtils.sha1Hex(pass));*/

    }
}

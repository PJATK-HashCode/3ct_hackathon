package web;

import dao.hdao.impl.UserDao;
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
import java.security.NoSuchAlgorithmException;
import java.util.List;
import java.util.Objects;



@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String nick = req.getParameter("nick");
        String password = req.getParameter("password");

        UserDao userDao = new UserDao();
        List<User> users = userDao.getAll();

        for (User u: users
             ) {
            if (u.getNickname() == nick)
            {
                if (  (u.getPassword() == DigestUtils.sha1Hex(password))) {
                    HttpSession session = req.getSession();
                    session.setAttribute(SessionKey.login, userDao.getById(u.getId()));
                    resp.sendRedirect("index.jsp");
                } else {
                    resp.getWriter().println("Błąd logowania");
                }
            }

            resp.sendRedirect("index.jsp");
        }



    }}


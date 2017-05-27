package dao.service;

import dao.repository.IUserRepository;
import model.user.User;

/**
 * @author Lelental on 27.05.2017.
 */
public class UserService extends EntityService<User> implements IUserRepository {

    @Override
    public User withNick(String nick) {
        return (User) super.searchByCriteria("from User u where u.nick='" + nick + "'");
    }
}

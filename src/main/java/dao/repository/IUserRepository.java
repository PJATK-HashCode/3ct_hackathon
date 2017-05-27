package dao.repository;

import model.user.User;

/**
 * @author Lelental on 27.05.2017.
 */
public interface IUserRepository extends IRepository<User> {

    User withNick(String nick);

}

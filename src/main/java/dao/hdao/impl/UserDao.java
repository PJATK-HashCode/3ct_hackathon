package dao.hdao.impl;

import dao.hdao.AbstractHDAO;
import dao.hdao.DataAccessLayerException;
import dao.hdao.HibernateFactory;
import model.user.User;
import org.hibernate.HibernateException;


import java.util.List;

/**
 * Created by Kuba on 2017-01-30.
 */
public class UserDao extends AbstractHDAO {
    public UserDao(){
        super();
    }
    public void create(User user) throws DataAccessLayerException {
        super.saveOrUpdate(user);
    }

    public void delete(User user) throws DataAccessLayerException {
        super.delete(user);
    }

    public User getById(int id) {
        return (User) super.getById(User.class,id);
    }



    public void update(User user) throws DataAccessLayerException {
        super.saveOrUpdate(user);
    }

    public List getAll() throws DataAccessLayerException{
        return super.getAll(User.class);
    }
}

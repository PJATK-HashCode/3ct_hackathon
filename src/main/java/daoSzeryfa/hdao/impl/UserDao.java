package daoSzeryfa.hdao.impl;

import daoSzeryfa.hdao.AbstractHDAO;
import daoSzeryfa.hdao.DataAccessLayerException;
import model.user.User;


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

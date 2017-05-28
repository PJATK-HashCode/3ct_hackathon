package dao.hdao.impl;


import dao.hdao.AbstractHDAO;
import dao.hdao.DataAccessLayerException;
import model.user.Owner;

import java.util.List;

/**
 * Created by Kuba on 2017-01-30.
 */
public class OwnerDao extends AbstractHDAO {
    public OwnerDao(){
        super();
    }
    public void create(Owner owner) throws DataAccessLayerException {
        super.saveOrUpdate(owner);
    }

    public void delete(Owner owner) throws DataAccessLayerException {
        super.delete(owner);
    }



    public Owner getById( int id) {
        return (Owner) super.getById(Owner.class,id);
    }



    public void update(Owner owner) throws DataAccessLayerException {
        super.saveOrUpdate(owner);
    }

    public List getAll() throws DataAccessLayerException{
        return super.getAll(Owner.class);
    }
}

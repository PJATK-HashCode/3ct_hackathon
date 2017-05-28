package dao.hdao.impl;


import dao.hdao.AbstractHDAO;
import dao.hdao.DataAccessLayerException;
import model.rateSystem.Rate;

import java.util.List;

/**
 * Created by Kuba on 2017-01-30.
 */
public class RateDao extends AbstractHDAO {
    public RateDao(){
        super();
    }
    public void create(Rate rate) throws DataAccessLayerException {
        super.saveOrUpdate(rate);
    }

    public void delete(Rate rate) throws DataAccessLayerException {
        super.delete(rate);
    }



    public Rate getById( int id) {
        return (Rate) super.getById(Rate.class,id);
    }



    public void update(Rate rate) throws DataAccessLayerException {
        super.saveOrUpdate(rate);
    }

    public List getAll() throws DataAccessLayerException{
        return super.getAll(Rate.class);
    }}

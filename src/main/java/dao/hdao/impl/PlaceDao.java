package dao.hdao.impl;


import dao.hdao.AbstractHDAO;
import dao.hdao.DataAccessLayerException;
import model.place.Place;

import java.util.List;

/**
 * Created by Kuba on 2017-01-30.
 */
public class PlaceDao extends AbstractHDAO {
    public PlaceDao(){
        super();
    }
    public void create(Place place) throws DataAccessLayerException {
        super.saveOrUpdate(place);
    }

    public void delete(Place place) throws DataAccessLayerException {
        super.delete(place);
    }



    public Place getById( int id) {
        return (Place) super.getById(Place.class,id);
    }



    public void update(Place place) throws DataAccessLayerException {
        super.saveOrUpdate(place);
    }

    public List getAll() throws DataAccessLayerException{
        return super.getAll(Place.class);
    }
}

package dao.hdao.impl;


import dao.hdao.AbstractHDAO;
import dao.hdao.DataAccessLayerException;
import model.reservation.Reservation;

import java.util.List;

/**
 * Created by Kuba on 2017-01-30.
 */
public class ReservationDao extends AbstractHDAO {
    public ReservationDao(){
        super();
    }
    public void create(Reservation reservation) throws DataAccessLayerException {
        super.saveOrUpdate(reservation);
    }

    public void delete(Reservation reservation) throws DataAccessLayerException {
        super.delete(reservation);
    }



    public Reservation getById( int id) {
        return (Reservation) super.getById(Reservation.class,id);
    }



    public void update(Reservation reservation) throws DataAccessLayerException {
        super.saveOrUpdate(reservation);
    }

    public List getAll() throws DataAccessLayerException{
        return super.getAll(Reservation.class);
    }
}

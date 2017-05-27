package dao.service;

import dao.repository.IReservationRepository;
import model.place.Place;
import model.reservation.Reservation;

import java.util.List;

/**
 * @author Lelental on 27.05.2017.
 */
public class ReservationService extends EntityService<Reservation> implements IReservationRepository{

    @Override
    public List<Reservation> atPlace(Place place) {
        return super.searchByCriteria("from Reservation r where r.place='" + place + "'");

    }
}

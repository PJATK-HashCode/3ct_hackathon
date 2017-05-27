package dao.repository;

import model.place.Place;
import model.reservation.Reservation;

import java.util.List;

/**
 * @author Lelental on 27.05.2017.
 */
public interface IReservationRepository extends IRepository<Reservation>  {

    List<Reservation> atPlace(Place place);
}

package dao.repository;

/**
 * @author Lelental on 27.05.2017.
 */
public interface IRepositoryCatalog {

    IPlaceRepository places();
    IRateRepository rates();
    IReservationRepository reservations();
    IUserRepository users();
}

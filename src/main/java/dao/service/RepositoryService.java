package dao.service;

import dao.repository.*;

/**
 * @author Lelental on 27.05.2017.
 */
public class RepositoryService implements IRepositoryCatalog {

    @Override
    public IPlaceRepository places() {
        return new PlaceService();
    }

    @Override
    public IRateRepository rates() {
        return new RateService();
    }

    @Override
    public IReservationRepository reservations() {
        return new ReservationService();
    }

    @Override
    public IUserRepository users() {
        return new UserService();
    }

    @Override
    public IOwnerRepository owners() {
        return new OwnerService();
    }
}

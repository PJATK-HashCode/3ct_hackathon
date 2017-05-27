package dao.service;

import dao.repository.IPlaceRepository;
import dao.repository.IRateRepository;
import dao.repository.IRepositoryCatalog;
import dao.repository.IReservationRepository;

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
}

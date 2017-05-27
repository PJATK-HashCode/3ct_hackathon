package dao.service;

import dao.repository.IPlaceRepository;
import model.place.*;

import java.math.BigDecimal;
import java.util.List;

/**
 * @author Lelental on 27.05.2017.
 */
public class PlaceService extends EntityService<Place> implements IPlaceRepository {

    @Override
    public Place withName(String name) {
        return (Place) super.searchByCriteria("from Place p where p.name='" + name + "'");
    }

    @Override
    public List<Place> atStreet(String street) {
        return super.searchByCriteria("from Place p where p.street='" + street + "'");
    }

    @Override
    public List<Place> withAmenities(PlaceAmenities placeAmenities) {
        return super.searchByCriteria("from Place p where p.placeAmenities='" + placeAmenities + "'");
    }

    @Override
    public List<Place> isType(PlaceType placeType) {
        return super.searchByCriteria("from Place p where p.placeType='" + placeType.name() + "'");

    }

    @Override
    public List<Place> amountOfCost(BigDecimal cost) {
        return super.searchByCriteria("from Place p where p.cost='" + cost + "'");

    }

    @Override
    public List<Place> withTypeSport(TypeOfSport typeSport) {
        return super.searchByCriteria("from Place p where p.typeOfSport='" + typeSport.name() + "'");

    }
}

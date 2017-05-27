package dao.repository;

import model.place.*;

import java.math.BigDecimal;
import java.util.List;

/**
 * @author Lelental on 27.05.2017.
 */
public interface IPlaceRepository extends IRepository<Place> {

    Place withName(String name);
    List<Place> inCity(City city);
    List<Place> atStreet(String street);
    List<Place> withAmenities(PlaceAmenities placeAmenities);
    List<Place> isType(PlaceType placeType);
    List<Place> amountOfCost(BigDecimal cost);
    List<Place> withTypeSport(TypeOfSport typeSport);

}

package model.place;

import lombok.Data;
import model.RateSystem.Rate;
import model.Reservation.Term;
import model.User.Owner;

import java.math.BigDecimal;
import java.util.List;

/**
 * @author Lelental on 27.05.2017.
 */
@Data
public class Place {

    private String Name;
    private String LocaliztionCoordinates;
    private String Street;
    private String PostCode;
    private String OpenHours;
    private PlaceType placeType;
    private City city;
    private Owner owner;
    private PlaceAmenities placeAmenities;
    private BigDecimal cost;
    private List<TypeOfSport> typeOfSportList;
    private List<Term> termList;
    private List<Rate>  rateList;


}

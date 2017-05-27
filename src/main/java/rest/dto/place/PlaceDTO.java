package rest.dto.place;

import lombok.Data;
import model.RateSystem.Rate;
import model.Reservation.Term;
import model.User.Owner;
import model.place.City;
import model.place.PlaceAmenities;
import model.place.PlaceType;
import model.place.TypeOfSport;

import javax.xml.bind.annotation.XmlRootElement;
import java.math.BigDecimal;
import java.util.List;

/**
 * Created by Kuba on 27.05.2017.
 */
@Data
@XmlRootElement
public class PlaceDTO {

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

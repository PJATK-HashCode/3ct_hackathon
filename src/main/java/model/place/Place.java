package model.place;

import lombok.Data;
import model.rateSystem.Rate;
import model.reservation.Term;
import model.user.Owner;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;

/**
 * @author Lelental on 27.05.2017.
 */
@Entity
@Data
public class Place {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String Name;
    private String LocaliztionCoordinates;
    private String Street;
    private String PostCode;
    private String OpenHours;

    @Enumerated(EnumType.STRING)
    private PlaceType placeType;

    @Enumerated(EnumType.STRING)
    private City city;

    private Owner owner;
    private PlaceAmenities placeAmenities;
    private BigDecimal cost;

    @Enumerated(EnumType.STRING)
    private List<TypeOfSport> typeOfSportList;

    private List<Term> termList;
    private List<Rate> rateList;


}

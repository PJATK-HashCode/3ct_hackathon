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
@NamedQueries({
        @NamedQuery(name = "place.all", query = "select p from place p"),
        @NamedQuery(name = "place.id", query = "select p from place p where p.id=:placeId")
})
public class Place {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String Name;
    private String localiztionCoordinates;
    private String Street;
    private String PostCode;
    private String OpenHours;

    @Enumerated(EnumType.STRING)
    private PlaceType placeType;

    @Enumerated(EnumType.STRING)
    private City city;

    @OneToOne
    private Owner owner;

    @OneToOne
    private PlaceAmenities placeAmenities;

    private BigDecimal cost;

    @Enumerated(EnumType.STRING)
    private List<TypeOfSport> typeOfSportList;

    @OneToMany
    private List<Term> termList;

    @OneToMany
    private List<Rate> rateList;


}

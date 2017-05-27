package model.place;

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


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getLocaliztionCoordinates() {
        return localiztionCoordinates;
    }

    public void setLocaliztionCoordinates(String localiztionCoordinates) {
        this.localiztionCoordinates = localiztionCoordinates;
    }

    public String getStreet() {
        return Street;
    }

    public void setStreet(String street) {
        Street = street;
    }

    public String getPostCode() {
        return PostCode;
    }

    public void setPostCode(String postCode) {
        PostCode = postCode;
    }

    public String getOpenHours() {
        return OpenHours;
    }

    public void setOpenHours(String openHours) {
        OpenHours = openHours;
    }

    public PlaceType getPlaceType() {
        return placeType;
    }

    public void setPlaceType(PlaceType placeType) {
        this.placeType = placeType;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public PlaceAmenities getPlaceAmenities() {
        return placeAmenities;
    }

    public void setPlaceAmenities(PlaceAmenities placeAmenities) {
        this.placeAmenities = placeAmenities;
    }

    public BigDecimal getCost() {
        return cost;
    }

    public void setCost(BigDecimal cost) {
        this.cost = cost;
    }

    public List<TypeOfSport> getTypeOfSportList() {
        return typeOfSportList;
    }

    public void setTypeOfSportList(List<TypeOfSport> typeOfSportList) {
        this.typeOfSportList = typeOfSportList;
    }

    public List<Term> getTermList() {
        return termList;
    }

    public void setTermList(List<Term> termList) {
        this.termList = termList;
    }

    public List<Rate> getRateList() {
        return rateList;
    }

    public void setRateList(List<Rate> rateList) {
        this.rateList = rateList;
    }
}

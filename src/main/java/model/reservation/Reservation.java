package model.reservation;

import model.user.User;
import model.place.Place;

import javax.persistence.*;

/**
 * Created by Kuba on 27.05.2017.
 */
@Entity
public class Reservation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @OneToOne
    private Place place;

    @OneToOne
    private User user;

    @Enumerated(EnumType.STRING)
    private TypeOfPayment typeOfPayment;


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Place getPlace() {
        return place;
    }

    public void setPlace(Place place) {
        this.place = place;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public TypeOfPayment getTypeOfPayment() {
        return typeOfPayment;
    }

    public void setTypeOfPayment(TypeOfPayment typeOfPayment) {
        this.typeOfPayment = typeOfPayment;
    }
}

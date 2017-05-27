package model.Reservation;

import lombok.Data;
import model.User.User;
import model.place.Place;

import javax.persistence.*;

/**
 * Created by Kuba on 27.05.2017.
 */
@Entity
@Data
public class Reservation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private Place place;
    private User user;

    @Enumerated(EnumType.STRING)
    private TypeOfPayment typeOfPayment;

}

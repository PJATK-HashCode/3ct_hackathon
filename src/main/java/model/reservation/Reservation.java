package model.reservation;

import lombok.Data;
import model.user.User;
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

    @OneToOne
    private Place place;

    @OneToOne
    private User user;

    @Enumerated(EnumType.STRING)
    private TypeOfPayment typeOfPayment;

}

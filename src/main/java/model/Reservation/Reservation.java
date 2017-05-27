package model.Reservation;

import lombok.Data;
import model.User.User;
import model.place.Place;

/**
 * Created by Kuba on 27.05.2017.
 */
@Data
public class Reservation {
    private Place place;
    private User user;
    private TypeOfPayment typeOfPayment;

}

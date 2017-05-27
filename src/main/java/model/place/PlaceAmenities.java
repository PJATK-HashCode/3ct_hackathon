package model.place;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * @author Lelental on 27.05.2017.
 */
@Entity
@Data
public class PlaceAmenities {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private boolean hasOwner;

    private boolean hasChaningRoom;
    private boolean hasLightOutSide;
    private boolean hasFreeWater;
}

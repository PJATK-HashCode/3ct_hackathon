package model.place;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * @author Lelental on 27.05.2017.
 */
@Entity
public class PlaceAmenities {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private boolean hasShower;
    private boolean hasChangingRoom;
    private boolean hasLightOutSide;
    private boolean hasFreeWater;


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public boolean isHasShower() {
        return hasShower;
    }

    public void setHasShower(boolean hasOwner) {
        this.hasShower = hasOwner;
    }

    public boolean isHasChangingRoom() {
        return hasChangingRoom;
    }

    public void setHasChangingRoom(boolean hasChaningRoom) {
        this.hasChangingRoom = hasChaningRoom;
    }

    public boolean isHasLightOutSide() {
        return hasLightOutSide;
    }

    public void setHasLightOutSide(boolean hasLightOutSide) {
        this.hasLightOutSide = hasLightOutSide;
    }

    public boolean isHasFreeWater() {
        return hasFreeWater;
    }

    public void setHasFreeWater(boolean hasFreeWater) {
        this.hasFreeWater = hasFreeWater;
    }
}

package model.reservation;

import org.joda.time.LocalTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Created by Kuba on 27.05.2017.
 */

@Entity
public class Term {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private Boolean IsTaken;
    private LocalTime dateTime;


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Boolean getTaken() {
        return IsTaken;
    }

    public void setTaken(Boolean taken) {
        IsTaken = taken;
    }

    public LocalTime getDateTime() {
        return dateTime;
    }

    public void setDateTime(LocalTime dateTime) {
        this.dateTime = dateTime;
    }
}

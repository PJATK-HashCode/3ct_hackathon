package model.reservation;

import lombok.Data;
import org.joda.time.LocalTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Created by Kuba on 27.05.2017.
 */

@Entity
@Data
public class Term {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private Boolean IsTaken;
    private LocalTime dateTime;
}

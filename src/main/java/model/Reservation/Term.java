package model.Reservation;

import lombok.Data;
import org.joda.time.LocalTime;

/**
 * Created by Kuba on 27.05.2017.
 */
@Data
public class Term {
    private Boolean IsTaken;
    private LocalTime dateTime;
}

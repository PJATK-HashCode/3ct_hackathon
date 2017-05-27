package model.RateSystem;

import lombok.Data;
import model.User.User;

import javax.persistence.*;

/**
 * Created by Kuba on 27.05.2017.
 */
@Entity
@Data
public class Rate {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Enumerated(EnumType.STRING)
    private Score score;

    private User user;

    @Enumerated(EnumType.STRING)
    private Category Category;
}

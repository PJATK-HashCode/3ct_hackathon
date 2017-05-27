package model.rateSystem;

import lombok.Data;
import model.user.User;

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

package model.RateSystem;

import lombok.Data;
import model.User.User;

/**
 * Created by Kuba on 27.05.2017.
 */
@Data
public class Rate {
    private Score score;
    private User user;
    private Category Category;
}

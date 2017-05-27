package model.rateSystem;

import lombok.Data;
import model.user.User;

/**
 * Created by Kuba on 27.05.2017.
 */
@Data
public class Rate {
    private Score score;
    private User user;
    private Category Category;
}

package model.RateSystem;

import lombok.Data;
import model.User.User;

/**
 * Created by Kuba on 27.05.2017.
 */
@Data
public class Comment {

    private User user;
    private String Text;
}

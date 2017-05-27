package model.rateSystem;

import lombok.Data;
import model.user.User;

/**
 * Created by Kuba on 27.05.2017.
 */
@Data
public class Comment {

    private User user;
    private String Text;
}

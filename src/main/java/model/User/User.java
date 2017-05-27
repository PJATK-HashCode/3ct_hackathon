package model.User;

import lombok.Data;

/**
 * Created by Kuba on 27.05.2017.
 */
@Data
public class User {

    private int id;
    private String password;
    private String name;
    private String surname;
    private String phoneNumber;
    private String email;
    private String nickname;


}

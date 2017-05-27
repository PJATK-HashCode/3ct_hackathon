package dao.repository;

import model.user.Owner;

/**
 * @author Lelental on 27.05.2017.
 */
public interface IOwnerRepository extends IRepository<Owner> {

    Owner withName(String name);

    Owner withEmail(String email);
}

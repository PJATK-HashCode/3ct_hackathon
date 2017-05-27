package dao.service;

import dao.repository.IOwnerRepository;
import model.user.Owner;

import java.util.List;

/**
 * @author Lelental on 27.05.2017.
 */
public class OwnerService extends EntityService<Owner> implements IOwnerRepository {
    @Override
    public Owner withName(String name) {
       return (Owner) super.searchByCriteria("from Owner o where o.name='" + name + "'");
    }

    @Override
    public Owner withEmail(String email) {
       return (Owner) super.searchByCriteria("from Owner o where o.email='" + email + "'");
    }
}

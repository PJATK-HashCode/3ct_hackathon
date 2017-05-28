package rest.Resources;

import model.reservation.Reservation;
import model.user.User;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by Kuba on 28.05.2017.
 */
@XmlRootElement
@Path("/user")
public class UserResources {

    @PersistenceContext
    private EntityManager entityManager;


    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public Response Add(User user) {
        entityManager.persist(user);
        return Response.ok(user.getId()).build();
    }

}

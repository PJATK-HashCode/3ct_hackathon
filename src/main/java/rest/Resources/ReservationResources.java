package rest.Resources;

import model.place.Place;
import model.reservation.Reservation;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.ws.rs.*;
import javax.ws.rs.core.GenericEntity;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Kuba on 27.05.2017.
 */
@XmlRootElement
@Path("/reservation")
public class ReservationResources {

    @PersistenceContext
    private EntityManager entityManager;


    @GET
    @Consumes((MediaType.APPLICATION_JSON))
    public Response getAll() {
        List<Reservation> reservationList = new ArrayList<>();
        reservationList.addAll(entityManager.createNamedQuery("reservation.all", Reservation.class)
                .getResultList());

        return Response.ok(new GenericEntity<List<Reservation>>(reservationList) {
        }).build();
    }

    @GET
    @Path("/{id}")
    @Consumes((MediaType.APPLICATION_JSON))
    public Response get(@PathParam("id") int id) {
        Place result = entityManager.createNamedQuery("reservation.id", Place.class)
                .setParameter("id", id)
                .getSingleResult();
        if (result == null) {
            return Response.status(404).build();
        }
        return Response.ok(result).build();
    }

    @GET
    @Path("/user/{user}")
    @Consumes((MediaType.APPLICATION_JSON))
    public Response get(@PathParam("user") String user) {
        Place result = entityManager.createNamedQuery("reservation.user", Place.class)
                .setParameter("user", user)
                .getSingleResult();
        if (result == null) {
            return Response.status(404).build();
        }
        return Response.ok(result).build();
    }


    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public Response Add(Reservation reservation) {
        entityManager.persist(reservation);
        return Response.ok(reservation.getId()).build();
    }


    @PUT
    @Path("/{id}")
    @Consumes(MediaType.APPLICATION_JSON)
    public Response update(@PathParam("id") int id, Reservation r) {
        Reservation result = entityManager.createNamedQuery("reservation.id", Reservation.class)
                .setParameter("id", id).getSingleResult();
        if (result == null) {
            return Response.status(404).build();
        }
        return Response.ok(result).build();
    }


    @DELETE
    @Path("/{id}")
    public Response delete(@PathParam("id") int id) {
        Reservation result = entityManager.createNamedQuery("reservation.id", Reservation.class)
                .setParameter("id", id)
                .getSingleResult();
        if (result == null) return Response.status(404).build();
        entityManager.remove(result);
        return Response.ok().build();
    }
}
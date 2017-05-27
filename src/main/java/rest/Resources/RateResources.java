package rest.Resources;

import model.rateSystem.Rate;

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
@Path("/rate")
public class RateResources {

    @PersistenceContext
    private EntityManager entityManager;


    @GET
    @Consumes((MediaType.APPLICATION_JSON))
    public Response getAll() {
        List<Rate> placeList = new ArrayList<>();
        placeList.addAll(entityManager.createNamedQuery("rate.all", Rate.class)
                .getResultList());

        return Response.ok(new GenericEntity<List<Rate>>(placeList){}).build();
    }

    @GET
    @Path("/{id}")
    @Consumes((MediaType.APPLICATION_JSON))
    public Response get(@PathParam("id") int id) {
        Rate result = entityManager.createNamedQuery("rate.id", Rate.class)
                .setParameter("id",id)
                .getSingleResult();
        if (result == null){
            return Response.status(404).build();
        }
        return Response.ok(result).build();
    }
    @GET
    @Path("/rate/{category}")
    @Consumes((MediaType.APPLICATION_JSON))
    public Response get(@PathParam("category") String category) {
        Rate result = entityManager.createNamedQuery("rate.category", Rate.class)
                .setParameter("category",category)
                .getSingleResult();
        if (result == null){
            return Response.status(404).build();
        }
        return Response.ok(result).build();
    }


    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public Response Add(Rate rate){
        entityManager.persist(rate);
        return Response.ok(rate.getId()).build();
    }


    @PUT
    @Path("/{id}")
    @Consumes(MediaType.APPLICATION_JSON)
    public Response update(@PathParam("id") int id, Rate p){
        Rate result = entityManager.createNamedQuery("rate.id",Rate.class)
                .setParameter("id", id).getSingleResult();
        if (result==null){
            return Response.status(404).build();

        }//TODO USTAWIC SETY

        return Response.ok(result).build();
    }


    @DELETE
    @Path("/{id}")
    public Response delete(@PathParam("id") int id ){
        Rate result = entityManager.createNamedQuery("rate.id",Rate.class)
                .setParameter("id",id)
                .getSingleResult();
        if (result==null) return Response.status(404).build();

        entityManager.remove(result);
        return Response.ok().build();
    }
}

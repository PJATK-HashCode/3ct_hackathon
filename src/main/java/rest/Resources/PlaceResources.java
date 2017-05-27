package rest.Resources;

import model.place.Place;
import org.dozer.DozerBeanMapper;
import org.dozer.Mapper;

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
@Path("/place")
public class PlaceResources {

    @PersistenceContext
    private EntityManager entityManager;


    @GET
    @Consumes((MediaType.APPLICATION_JSON))
    public Response getAll() {
        List<Place> placeList = new ArrayList<>();
        placeList.addAll(entityManager.createNamedQuery("place.all", Place.class)
                .getResultList());

        return Response.ok(new GenericEntity<List<Place>>(placeList){}).build();
    }

    @GET
    @Path("/{id}")
    @Consumes((MediaType.APPLICATION_JSON))
    public Response get(@PathParam("id") int id) {
        Place result = entityManager.createNamedQuery("place.id", Place.class)
                .setParameter("id",id)
                .getSingleResult();
        if (result == null){
            return Response.status(404).build();
        }
        return Response.ok(result).build();
    }
    @GET
    @Path("/city/{city}")
    @Consumes((MediaType.APPLICATION_JSON))
    public Response get(@PathParam("city") String city) {
        Place result = entityManager.createNamedQuery("place.city", Place.class)
                .setParameter("city",city)
                .getSingleResult();
        if (result == null){
            return Response.status(404).build();
        }
        return Response.ok(result).build();
    }


    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public Response Add(Place place){
        entityManager.persist(place);
        return Response.ok(place.getId()).build();
    }


    @PUT
    @Path("/{id}")
    @Consumes(MediaType.APPLICATION_JSON)
    public Response update(@PathParam("id") int id, Place p){
        Place result = entityManager.createNamedQuery("place.id",Place.class)
                .setParameter("id", id).getSingleResult();
        if (result==null){
            return Response.status(404).build();

        }
        result.setName(p.getName());
        result.setCost(p.getCost());
        result.setCity(p.getCity());
        result.setOwner(p.getOwner());
        result.setPlaceAmenities(p.getPlaceAmenities());
        result.setRateList(p.getRateList());
        result.setPlaceType(p.getPlaceType());
        result.setTypeOfSportList(p.getTypeOfSportList());

        return Response.ok(result).build();
    }


    @DELETE
    @Path("/{id}")
    public Response delete(@PathParam("id") int id ){
        Place result = entityManager.createNamedQuery("place.id",Place.class)
                .setParameter("id",id)
                .getSingleResult();
        if (result==null) return Response.status(404).build();

        entityManager.remove(result);
        return Response.ok().build();
    }

}

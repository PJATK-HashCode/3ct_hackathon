package rest.Resources;

import model.place.Place;
import org.dozer.DozerBeanMapper;
import org.dozer.Mapper;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
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
    Mapper mapper = new DozerBeanMapper();

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

}

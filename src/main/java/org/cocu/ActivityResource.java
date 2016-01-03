package org.cocu;

import org.cocu.dao.ActivityRepository;
import org.cocu.dao.ActivityRepositoryStub;
import org.cocu.model.Activity;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("activities")
public class ActivityResource {
    ActivityRepository activityRepository = new ActivityRepositoryStub();

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public List<Activity> createActivity (Activity activity){
        System.out.println(activity.getDescription());
        System.out.println(activity.getDuration());
        return activityRepository.create(activity);
    }

    @GET
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public List<Activity> getAllActivities(){
        return activityRepository.listAllActivities();
    }
}

package org.cocu.dao;

import org.cocu.model.Activity;
import java.util.ArrayList;
import java.util.List;

public class ActivityRepositoryStub implements ActivityRepository {

    private List<Activity> activityList;

    public ActivityRepositoryStub() {
        activityList = new ArrayList<>();

        Activity activity1 = new Activity();
        activity1.setDescription("swimming");
        activity1.setDuration(10);

        Activity activity2 = new Activity();
        activity2.setDescription("dancing");
        activity2.setDuration(3);

        Activity activity3 = new Activity();
        activity3.setDescription("biking");
        activity3.setDuration(7);

        activityList.add(activity1);
        activityList.add(activity2);
        activityList.add(activity3);
    }

    @Override
    public List<Activity> listAllActivities(){
        activityList.sort((Activity a1, Activity a2) -> a1.getDescription().compareTo(a2.getDescription()));
        return activityList;
    }

    @Override
    public List<Activity> create(Activity activity) {
        activityList.add(activity);
        return activityList;
    }

}

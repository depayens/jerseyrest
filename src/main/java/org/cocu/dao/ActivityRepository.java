package org.cocu.dao;

import org.cocu.model.Activity;

import java.util.List;

public interface ActivityRepository {
    List<Activity> listAllActivities();
    List<Activity> create(Activity activity);
}

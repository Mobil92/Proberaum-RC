package de.pr22.proberaum;

import android.app.Activity;

import java.util.ArrayList;
import java.util.List;


class ActivityRegistry {
    private static List<Activity> _activities;
    private static List<String> _activitiesBack;

    public static void register(Activity activity) {
        if(_activities == null) {
            _activities = new ArrayList<Activity>();
        }
        _activities.add(activity);
    }
    public static void register(String activityBack) {
        if(_activitiesBack == null) {
            _activitiesBack = new ArrayList<String>();
        }
        _activitiesBack.add(activityBack);
    }

    public static void finishAll() {
        for (Activity activity : _activities) {
            activity.finish();
        }
    }
    public static List<String> query() {
        if(_activitiesBack == null) {
            _activitiesBack = new ArrayList<String>();
        }
       return _activitiesBack;
    }
}
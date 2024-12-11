package com.klef.jfsd.springboot.service;

import com.klef.jfsd.springboot.model.Activity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ActivityService {
    private List<Activity> activities = new ArrayList<>();

    // Initialize with mock data
    public ActivityService() {
        activities.add(new Activity(1, "Football", "Join our college football team and showcase your skills.", "football.jpg", 0, 0, 0));
        activities.add(new Activity(2, "Debate Club", "Become a part of our debate club and improve your public speaking skills.", "debate.jpg", 0, 0, 0));
        activities.add(new Activity(3, "Drama Club", "Express your creative side in our drama club performances.", "drama.jpg", 0, 0, 0));
        activities.add(new Activity(4, "Music Band", "Join our music band and create magic with melodies.", "music.jpg", 0, 0, 0));
    }

    public List<Activity> getAllActivities() {
        return activities;
    }

    // Methods to update counts
    public void incrementView(int activityId) {
        Activity activity = activities.stream().filter(a -> a.getId() == activityId).findFirst().orElse(null);
        if (activity != null) {
            activity.setViews(activity.getViews() + 1);
        }
    }

    public void incrementParticipation(int activityId) {
        Activity activity = activities.stream().filter(a -> a.getId() == activityId).findFirst().orElse(null);
        if (activity != null) {
            activity.setParticipations(activity.getParticipations() + 1);
        }
    }

    public void incrementInterest(int activityId) {
        Activity activity = activities.stream().filter(a -> a.getId() == activityId).findFirst().orElse(null);
        if (activity != null) {
            activity.setInterest(activity.getInterest() + 1);
        }
    }

    // Fetch activity by id for detail page
    public Activity getActivityById(int id) {
        return activities.stream().filter(a -> a.getId() == id).findFirst().orElse(null);
    }
}



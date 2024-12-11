package com.klef.jfsd.springboot.controller;

import java.util.List;
import com.klef.jfsd.springboot.controller.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.klef.jfsd.springboot.model.Activity;
import com.klef.jfsd.springboot.service.ActivityService;

@RestController
@RequestMapping("/api/extracurricular-activities")
@CrossOrigin(origins = "http://localhost:3000")  // Add your frontend URL here
public class ActivityController {

    @Autowired
    private ActivityService activityService;

    @GetMapping
    public List<Activity> getAllActivities() {
        return activityService.getAllActivities();
    }

    @GetMapping("/{id}")
    public Activity getActivity(@PathVariable int id) {
        return activityService.getActivityById(id);
    }

    @PutMapping("/{id}/view")
    public void incrementView(@PathVariable int id) {
        activityService.incrementView(id);
    }

    @PutMapping("/{id}/participation")
    public void incrementParticipation(@PathVariable int id) {
        activityService.incrementParticipation(id);
    }

    @PutMapping("/{id}/interest")
    public void incrementInterest(@PathVariable int id) {
        activityService.incrementInterest(id);
    }
}

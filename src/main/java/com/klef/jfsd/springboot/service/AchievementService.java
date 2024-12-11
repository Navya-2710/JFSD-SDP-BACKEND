package com.klef.jfsd.springboot.service;

import com.klef.jfsd.springboot.model.Achievement;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Arrays;

@Service
public class AchievementService {

    // Simulate fetching achievements
    public List<Achievement> getAllAchievements() {
        // Make sure Achievement objects are created correctly
        Achievement achievement1 = new Achievement(1L, "Achievement 1", "Description 1");
        Achievement achievement2 = new Achievement(2L, "Achievement 2", "Description 2");

        // Return them as a list
        return Arrays.asList(achievement1, achievement2);
    }
}


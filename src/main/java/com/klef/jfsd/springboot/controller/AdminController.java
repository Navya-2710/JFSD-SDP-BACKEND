package com.klef.jfsd.springboot.controller;

import com.klef.jfsd.springboot.model.Achievement;
import com.klef.jfsd.springboot.service.AchievementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/admin")
public class AdminController {

 @Autowired
 private AchievementService achievementService;

 // Endpoint to fetch all achievements
 @GetMapping("/achievements")
 public List<Achievement> getAchievements() {
     return achievementService.getAllAchievements();
 }
}

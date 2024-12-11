// src/main/java/com/klef/jfsd/springboot/controller/AchievementController.java
package com.klef.jfsd.springboot.controller;

import com.klef.jfsd.springboot.model.Achievement;
import com.klef.jfsd.springboot.service.AchievementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

//AchievementController.java
@RestController
@RequestMapping("/api/achievements")
public class AchievementController {

 @Autowired
 private AchievementService achievementService;

 @CrossOrigin(origins = "http://localhost:3000")
 @GetMapping
 public List<Achievement> getAllAchievements() {
     return achievementService.getAllAchievements();
 }
}


package com.RestDemo.StartupProfile.controller;

import com.RestDemo.StartupProfile.model.StartupProfile;
import com.RestDemo.StartupProfile.service.StartupProfileService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/StartupProfile")
public class StartupProfileController {
    StartupProfileService startupProfileService;
    public StartupProfileController(StartupProfileService startupProfileService) {
        this.startupProfileService = startupProfileService;
    }
@GetMapping("/{startupId}")
    public StartupProfile getStartupProfileById(@PathVariable("startupId") String startupId){
        return startupProfileService.getStartupProfileById(startupId);
    }

    @GetMapping()
    public List<StartupProfile> getAllStartupProfile(){
        return startupProfileService.getAllStartupProfile();
    }

    @PostMapping()
    public String createStartupProfile(@RequestBody StartupProfile startupProfile){
        startupProfileService.createStartupProfile(startupProfile);
        return "Startup Profile created successfully";
    }

    @PutMapping
    public String updateStartupProfile(@RequestBody StartupProfile startupProfile){
        startupProfileService.updateStartupProfile(startupProfile);
        return "Startup Profile updated successfully";
    }

    @DeleteMapping("/{startupId}")
    public String deleteStartupProfile(@PathVariable("startupId") String startupId){
        startupProfileService.deleteStartupProfile(startupId);
        return "Startup Profile deleted successfully";
    }
}

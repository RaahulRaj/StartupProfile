package com.RestDemo.StartupProfile.service;

import com.RestDemo.StartupProfile.model.StartupProfile;

import java.util.List;

public interface StartupProfileService {
    public String createStartupProfile(StartupProfile startProfile);
    public String updateStartupProfile(StartupProfile startProfile);
    public String deleteStartupProfile(String startupId);
    public List<StartupProfile> getAllStartupProfile();
    public StartupProfile getStartupProfileById(String startupId);
}

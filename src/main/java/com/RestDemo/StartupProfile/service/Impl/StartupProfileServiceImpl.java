package com.RestDemo.StartupProfile.service.Impl;

import com.RestDemo.StartupProfile.exception.StartupProfileNotFoundException;
import com.RestDemo.StartupProfile.model.StartupProfile;
import com.RestDemo.StartupProfile.repository.StartupProfileRepository;
import com.RestDemo.StartupProfile.service.StartupProfileService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StartupProfileServiceImpl implements StartupProfileService {
    StartupProfileRepository startProfileRepository;
    public StartupProfileServiceImpl(StartupProfileRepository startProfileRepository) {
        this.startProfileRepository = startProfileRepository;
    }
    @Override
    public String createStartupProfile(StartupProfile startProfile) {
        startProfileRepository.save(startProfile);
        return "Success";
    }

    @Override
    public String updateStartupProfile(StartupProfile startProfile) {
        startProfileRepository.save(startProfile);
        return "Success";
    }

    @Override
    public String deleteStartupProfile(String startupId) {
        startProfileRepository.deleteById(startupId);
        return "Success";
    }

    @Override
    public List<StartupProfile> getAllStartupProfile() {
        return startProfileRepository.findAll();
    }

    @Override
    public StartupProfile getStartupProfileById(String startupId) {
        if(startProfileRepository.findById(startupId).isEmpty()){
            throw new StartupProfileNotFoundException("Requested Startup Profile does not exist");
        }
        return startProfileRepository.findById(startupId).get();
    }
}

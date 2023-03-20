package com.example.demo.Service;


import com.example.demo.Entities.Profile;
import com.example.demo.Repository.ProfileRepository;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
@Service
public class ProfileService {

    @Autowired
private ProfileRepository profileRepository;

    public Profile addProfile(Profile profile) {
        return profileRepository.save(profile);
    }
    public Iterable<Profile> addAllProfiles(Iterable<Profile> TempProfiles) {
        return profileRepository.saveAll(TempProfiles);
    }

    public void removeProfile(Profile profile) {
        profileRepository.delete(profile);
    }
    public Iterable<Profile> getProfiles() {
            Iterable<Profile> profiles =profileRepository.findAll();
        return profiles;
    }

    public void printProfiles(ArrayList<Profile> profiles) {
        for (Profile p:profiles) {
            p.toString();
        }

    }
}

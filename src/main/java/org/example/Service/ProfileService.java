package org.example.Service;

import org.example.Entities.Profile;
import org.example.Entities.User;

import java.util.ArrayList;

public class ProfileService {

    private ArrayList<Profile> profiles = new ArrayList<>();

    public void addProfile(Profile profile) {
        profiles.add(profile);

    }

    public void addAllProfiles(ArrayList<Profile> TempProfiles) {
        profiles.addAll(TempProfiles);
    }

    public void removeProfile(Profile profile) {
        profiles.remove(profile);
    }

    public void editProfile(Profile profile) {

    }

    public ArrayList<Profile> getProfiles() {
        return profiles;
    }

    public void printProfiles(ArrayList<Profile> profiles) {
        for (Profile p:profiles) {
            p.toString();
        }

    }

    public String toString(User profile) {;
        return "Profile{" +
                "id=" + profile.getId() +
                ", name='" + profile.getFirstName() + '\'' +
                ", surname='" + profile.getLastName() + '\'' +
                ", email='" + profile.getEmail() + '\'' +
                ", password='" + profile.getPassword() + '\'' +
                ", premiumType='" + profile.getMembership() + '\'' +
                '}';
    }

}

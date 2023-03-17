package org.example;

import com.sun.source.doctree.ProvidesTree;
import org.example.Entities.Admin;
import org.example.Entities.Profile;
import org.example.Entities.User;
import org.example.Premium.Gold;
import org.example.Premium.Membership;
import org.example.Premium.Standart;
import org.example.Service.ProfileService;

public class Main {
    public static void main(String[] args) {
        ProfileService profileService = new ProfileService();
        User user = new User(2,"Mustafa","Cansu","mucansu@gmail.com","123456", new Standart());
        Admin admin = new Admin(1,"Mustafa","Cansu","mucansu96@gmail.com","1234");

        profileService.addProfile(user);
        profileService.addProfile(admin);

        profileService.printProfiles(profileService.getProfiles());
        System.out.println(profileService.toString(user));

    }
}
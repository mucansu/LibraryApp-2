package org.example;

import com.sun.source.doctree.ProvidesTree;
import org.example.Entities.Admin;
import org.example.Entities.Profile;
import org.example.Entities.User;
import org.example.Premium.Gold;
import org.example.Premium.Membership;
import org.example.Premium.Silver;
import org.example.Premium.Standart;
import org.example.Service.ProfileService;

public class Main {
    public static void main(String[] args) {
        ProfileService profileService = new ProfileService();
        User user1 = new User(3,"Mustafa1","Cansu","mucansu@gmail.com","123456", new Silver());
    /*    User user = new User(2,"Mustafa","Cansu","mucansu@gmail.com","123456", new Standart());
        User user2 = new User(4,"Mustafa2","Cansu","mucansu@gmail.com","123456", new Standart());
        User user3 = new User(5,"Mustafa3","Cansu","mucansu@gmail.com","123456", new Standart());
        User user4 = new User(6,"Mustafa4","Cansu","mucansu@gmail.com","123456", new Standart());
        Admin admin = new Admin(1,"Mustafa","Cansu","mucansu96@gmail.com","1234");

        profileService.addProfile(user);
        profileService.addProfile(admin);

        profileService.printProfiles(profileService.getProfiles());
        System.out.println(profileService.toString(user));
*/
    }
}